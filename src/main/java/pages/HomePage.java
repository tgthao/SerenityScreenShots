package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
    public void navigate() {

        open();
    }

    public void enterUsername() {

        $("//*[@id=\"identifierId\"]").sendKeys("giangthaonexle@gmail.com");
        //sSerenity.takeScreenshot();

    }


    public void clickNextBtn() {



        $("//*[@id=\"identifierNext\"]/div/button/span").click();
        //Serenity.takeScreenshot();
    }


    public void enterPassword() {

        $("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys("Giangthao789");


    }
}
