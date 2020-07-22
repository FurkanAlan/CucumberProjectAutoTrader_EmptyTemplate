package com.autotrader.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * if any scenario fails, we are storing the fail details
 * in rerun.txt and we are only calling failed scenarios.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        //@target olmali diger turli rerun.txt dosyasini bulamaz
        features = {"@target/rerun.txt",},
        glue = "src/test/java/com/autotrader/stepDefinitions",

        plugin = {
                "html:target/rerun-default-cucumber-reports",
                "json:target/cucumber_failure.json"
        }

)
public class FailedRunner {
}
