package com.adere.springboot.trial.springboottrial.Controller;

import com.adere.springboot.trial.springboottrial.Model.Question;
import com.adere.springboot.trial.springboottrial.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adere on 4.11.2018.
 */

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @RequestMapping(value = "/surveys/{surveyId}/questions", method = RequestMethod.GET)
    public List<Question> retriveQuestionsForSurvey(@PathVariable String surveyId) {

        return surveyService.retrieveQuestions(surveyId);

    }
}
