package com.adere.springboot.trial.springboottrial;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by adere on 7.11.2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootTrialApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SurveyControllerIT {


    @LocalServerPort
    private int port;
    

    @Test
    public void test() throws JSONException {

        String url = "http://localhost:" + port + "/surveys/Survey1/questions/Question1";

        TestRestTemplate restTemplate = new TestRestTemplate();

        String output =  restTemplate.getForObject(url, String.class);
        System.out.println("output is: " + output);




        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String>  response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);


        System.out.println("Response: " + response.getBody());

        assertTrue(response.getBody().contains("Russia"));



        JSONAssert.assertEquals("{correctAnswer: Russia}", response.getBody(),false);

    }
}
