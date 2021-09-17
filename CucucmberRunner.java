package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import steps.BaseClass;
@CucumberOptions(features = "src/test/java/feature/F02_CreateLead.feature",
                            glue="steps",
                            //dryRun = true,
                            monochrome = true,
                            publish=true,
                            tags ="@regression"
                            )

public class CucucmberRunner extends BaseClass {

}
