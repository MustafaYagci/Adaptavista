package com.Adaptavista.stepDefs;

import com.Adaptavista.POM.GeneralLocatorPage;
import com.Adaptavista.Utilities.ConfigurationReader;
import com.Adaptavista.Utilities.Driver;
import com.Adaptavista.Utilities.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automation2_1 extends Utilities {

    By textIframe=By.id(GeneralLocatorPage.Editor.textIframe_ById);
    By text=By.xpath(GeneralLocatorPage.Editor.text_ByXpath);
    By boldOption=By.xpath(GeneralLocatorPage.Editor.boldOption_ByXpath);
    WebDriver driver=Driver.get();

    @Given("User navigates to URL {string} page")
    public void userNavigatesToURLPage(String URL) {
        driver.navigate().to(ConfigurationReader.get(URL));
    }

    @When("User navigates to page as a default {string} writen")
    public void userNavigatesToPageAsADefaultWriten(String expectedText) {
        driver.switchTo().frame(elementReturner(textIframe));
        String actualText=getText(text);
        Assert.assertEquals(expectedText,actualText);
    }

    @And("User clears the text field")
    public void userClearsTheTextField() {
       clear(text);
    }

    @And("User selects bold option")
    public void userSelectsBoldOption() {
        driver.switchTo().parentFrame();
        click(boldOption);
    }

    @Then("User write {string}")
    public void userWrite(String word) {
        driver.switchTo().frame(elementReturner(textIframe));
        writeText(text,word);
    }
}
