package com.adere.springboot.trial.springboottrial;

import com.adere.springboot.trial.springboottrial.Controller.SurveyController;
import com.adere.springboot.trial.springboottrial.Service.SurveyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by adere on 7.11.2018.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(SurveyController.class)
public class SurveyControllerTest {


    @MockBean
    private SurveyService service;

    @Test
    public void test(){

    }
}
