package com.autotrader.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Runnur daki JUnit den geliyor
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/com/autotrader/stepDefinitions",
        //dryRun, en basta true yapilir ki feature larin snippetlerini olusturmak icin
        //daha sonra StepDefinition daki metodlari uygulamak icin ise dryRun = false olur
        dryRun =false,
        // tags = "@smoke_test,@unit_test",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class RunnerClass {

}
