package com.assesment.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {
                "html:target/cucumber-report1.html",
                "json:target/cucumber/report.json",
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = "com/assesment/step_definitions",
        dryRun = false,

        tags="@smoke"



)
public class CukesRunner {
}

