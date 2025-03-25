package stepDefinition;





import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\saimanikanta\\OneDrive\\Desktop\\selenium\\workplace\\interview\\src\\test\\java\\cucumber\\TestLogin.feature"},
		glue = "stepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests   {

}
