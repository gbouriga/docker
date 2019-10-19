package com.cucumber.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CucumberController {

    private final CucumberReportService cucumberReportService;


    @Autowired
    public CucumberController(CucumberReportService cucumberReportService) {
        this.cucumberReportService = cucumberReportService;
    }

    @RequestMapping("/CucumberReport")
    public String cucumberReport() {
        cucumberReportService.generate();
        return "";
    }
}
