package runner_dominos;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import b_ClassDominos.B_Class_daminos;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature_dominos\\com.feature",glue = "step_Def",publish = true)

public class Runner_class_daminos extends B_Class_daminos {
	@BeforeClass
	public static void First() {
		BroswerLaunch();
	}
}
