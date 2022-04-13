package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class SecondTest {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomePageSteps home;
	
	@Title("Executing Login Test")
	@Test
	//@Screenshots(onlyOnFailures=true)
	public void loginTest() {
		
		home.doLogin();
		//home.doEnterPassword();
		
	}

	
	@Title("Executing Second Test")
	@Test
	//@Screenshots(afterEachStep=true)
	public void secondTest() {
		
		home.doLogin();
		home.doEnterPassword();
		
		
	}

}
