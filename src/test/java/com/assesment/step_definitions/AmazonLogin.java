package com.assesment.step_definitions;

import com.assesment.pages.AmazonPage;
import com.assesment.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {


    AmazonPage amazonPage;
    Actions actions;



    @When("user is on {string}")
    public void user_is_on(String uri) {

        Driver.getDriver().get(uri);
    }


    @Then("Amazon title page should be {string}")
    public void amazon_title_page_should_be(String title) {

        //BrowserUtils.sleep(2);
        String expected = title;
        String actualResult = Driver.getDriver().getTitle();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expected);

    }

    @When("User hoover on Hello, sign in section")
    public void user_hoover_on_hello_sign_in_section() {

        amazonPage = new AmazonPage();
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonPage.helloSignInSection).perform();


    }
    @Then("User can click on Sign in button")
    public void user_can_click_on_sign_in_button() {

        amazonPage.singInButton.click();

    }

    @When("User enters email or phone number")
    public void user_enters_email_or_phone_number() {


        //BrowserUtils.sleep(2);
        amazonPage.emailOrNumberToSignIn.sendKeys("iva_orlinova@yahoo.com");

    }

    @When("User can click Continue button")
    public void user_can_click_continue_button() {

        amazonPage.continueButton.click();
    }


    @When("User enter password")
    public void user_enter_password() {

        amazonPage.passwordButton.sendKeys("Happyhappy23@");

    }

    @Then("User can click on Sign\\(Submit) button")
    public void user_can_click_on_sign_submit_button() {

        amazonPage.signInSubmitButton.click();
    }







}
