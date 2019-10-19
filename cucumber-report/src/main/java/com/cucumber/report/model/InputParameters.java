package com.cucumber.report.model;

import lombok.Data;

@Data
public class InputParameters {

    private String buildNumber;
    private String jsonDirPath;
    private String reportDirPath;
    private String projectName;


}
