package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassService;

@CucumberOptions(features="src/test/java/feature/S01_LoginServicenow.feature",
                           glue="steps",
                           //tags ="@regression",
                           //tags="@smoke",
                           //tags="@functional",
                           tags= "@regression",
                           monochrome=true,
                           publish=true)

public class CucumberRunnerService extends BaseClassService{

}
