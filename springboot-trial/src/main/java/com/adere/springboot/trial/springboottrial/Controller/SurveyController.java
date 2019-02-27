package com.adere.springboot.trial.springboottrial.Controller;

import com.adere.springboot.trial.springboottrial.Model.Question;
import com.adere.springboot.trial.springboottrial.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @RequestMapping(value = "/surveys/{surveyId}/questions/{questionId}")
    public Question retriveDetailsForQuestion(@PathVariable String surveyId, @PathVariable String questionId) {

        return surveyService.retrieveQuestion(surveyId, questionId);
    }

    @RequestMapping(value = "/surveys/{surveyId}/questions", method = RequestMethod.POST)
    public ResponseEntity<Void> addQuestionToSurvey(@PathVariable String surveyId, @RequestBody Question newQuestion) {

        Question question = surveyService.addQuestion(surveyId, newQuestion);

        if (question == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(question.getId()).toUri();


        return ResponseEntity.created(location).build();
    }
}
