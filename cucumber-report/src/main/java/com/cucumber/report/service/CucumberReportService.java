package com.cucumber.report.service;

import com.cucumber.report.model.InputParameters;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CucumberReportService {

    public void generate(InputParameters inputParameters) {
        //Output directory path for html report
        File reportOutputDirectory = new File(inputParameters.getReportDirPath());

        //List all json file to generate html report
        List<String> jsonFiles = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(Paths.get(inputParameters.getJsonDirPath()))) {
           jsonFiles = walk.map(Path::toString)
                    .filter(f -> f.endsWith(".json")).collect(Collectors.toList());
            jsonFiles.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String buildNumber = inputParameters.getBuildNumber();
        String projectName = inputParameters.getProjectName();

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        // do not make scenario failed when step has status SKIPPED
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        configuration.setBuildNumber(buildNumber);


        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }

}
