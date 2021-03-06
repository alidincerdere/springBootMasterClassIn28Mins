package com.adere.springboot.trial.springboottrial;

import com.adere.springboot.trial.springboottrial.Controller.SurveyController;
import com.adere.springboot.trial.springboottrial.Model.Question;
import com.adere.springboot.trial.springboottrial.Service.SurveyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


/**
 * Created by adere on 7.11.2018.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(SurveyController.class)
public class SurveyControllerTest {


    @Autowired
    MockMvc mockMvc;

    @MockBean
    private SurveyService service;

    @Test
    public void retrieveDetailsForQuestion() throws Exception {

        Question questionMock = new Question("QuestionMock",
                "mock question", "Russia", Arrays.asList(
                "India", "Russia", "United States", "China"));

        Mockito.when(service.retrieveQuestion(Mockito.anyString(), Mockito.anyString())).thenReturn(questionMock);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/surveys/Survey1/questions/Question1").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expected = "{id:QuestionMock, correctAnswer: Russia, description: \"mock question\"}";

        JSONAssert.assertEquals(expected,result.getResponse().getContentAsString(),false);


    }

    @Test
    public void createSurveyQuestion() throws Exception {
        Question mockQuestion = new Question("1", "Smallest Number", "1",
                Arrays.asList("1", "2", "3", "4"));

        String questionJson = "{\"description\":\"Smallest Number\",\"correctAnswer\":\"1\",\"options\":[\"1\",\"2\",\"3\",\"4\"]}";
        //surveyService.addQuestion to respond back with mockQuestion
        Mockito.when(
                service.addQuestion(Mockito.anyString(), Mockito
                        .any(Question.class))).thenReturn(mockQuestion);

        //Send question as body to /surveys/Survey1/questions
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/surveys/Survey1/questions")
                .accept(MediaType.APPLICATION_JSON).content(questionJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.CREATED.value(), response.getStatus());

        assertEquals("http://localhost/surveys/Survey1/questions/1", response
                .getHeader(HttpHeaders.LOCATION));

    }
}
