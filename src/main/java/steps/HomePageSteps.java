package steps;

import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
	
	
	
	HomePage home;
	
	@Step("Performing Login")
	@Screenshots(onlyOnFailures = false)
	public void doLogin() {
		
		
		home.navigate();
		home.enterUsername();
		
	}
	
	
	@Step("Entering Password")
	public void doEnterPassword() {
		
		
		
		home.clickNextBtn();
		home.enterPassword();
	}
	

}
