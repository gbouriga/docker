package com.cucumber.report.controller;

import com.cucumber.report.model.InputParameters;
import com.cucumber.report.service.CucumberReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CucumberReportController {

    private final CucumberReportService cucumberReportService;


    @Autowired
    public CucumberReportController(CucumberReportService cucumberReportService) {
        this.cucumberReportService = cucumberReportService;
    }

    @RequestMapping(path="/CucumberReport/",  method = RequestMethod.GET)
    public ResponseEntity<?> cucumberReport(@RequestBody InputParameters inputParameters) {
        cucumberReportService.generate(inputParameters);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
