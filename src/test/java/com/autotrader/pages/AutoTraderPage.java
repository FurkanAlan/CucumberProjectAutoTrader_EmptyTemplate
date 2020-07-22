package com.autotrader.pages;

import com.autotrader.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoTraderPage extends BasePage {


    /**
     * Locators
     */
    @FindBy(xpath = "//button[contains(@title,'Browse by Make')]")
    public WebElement browseByMake;

    @FindBy(xpath = "//button[contains(@title,'Browse by Style')]")
    public WebElement browseByStyle;

    @FindBy(xpath = "//a[contains(text(),'Advanced Search')]")
    public WebElement advanceSearch;

    @FindBy(xpath = "//button[@id='search']")
    public WebElement searchButton;


    @FindBy(xpath = "//select[@id='makeCode']")
    public WebElement makeElement;

    @FindBy(xpath = "//select[@id='ModelCode']")
    public WebElement modelElement;

    public AutoTraderPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }


    /**
     * In here we will verify
     * 3 feature:
     * Then Verify that "Browse by Make" are present
     * Then Verify that "Browse by Style" are present
     * Then Verify that "Advanced Search" are present
     *
     * @param expected
     */
    public void verification(String expected) {
        if (expected.equals(browseByMake.getText())) {
            String actual = browseByMake.getText();
            Assert.assertEquals(expected, actual);
        } else if (expected.equals(browseByStyle.getText())) {
            String actual = browseByStyle.getText();
            Assert.assertEquals(expected, actual);
        } else {
            String actual = advanceSearch.getText();
            Assert.assertEquals(expected, actual);
        }

    }

    /**
     * And verify that search button is present.
     */
    public void verifyButton() {
        Assert.assertTrue(searchButton.isEnabled());
    }

    /**
     * Then verify that "Any Make" and "Any Model" is visible
     *
     * @param make
     * @param model
     */
    public void verifyMakeAndModel(String make, String model) {
        Assert.assertTrue(makeElement.isDisplayed());
        Assert.assertTrue(modelElement.isDisplayed());
    }

    /*
      #  Scenario Outline: testin the multiple entry
      #    Given choose make as "<model>"

      @param model
     */
//    public void multipleChoice(String model) {
//        makeElement.sendKeys(model);
//    }
}
