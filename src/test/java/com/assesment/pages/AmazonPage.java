package com.assesment.pages;


import com.assesment.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


        public AmazonPage(){

                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")
        public WebElement helloSignInSection;
       

        @FindBy(xpath = "//span[@class='nav-action-inner'] ")
        public WebElement singInButton;


        @FindBy(xpath = "//*[@id='ap_email']")
        public WebElement emailOrNumberToSignIn;

       
        @FindBy(xpath = "//input[@id='continue']")
        public WebElement continueButton;

        @FindBy(xpath = "//input[@id='ap_password']")
        public WebElement passwordButton;

        @FindBy(xpath = "//input[@id='signInSubmit']")
        public WebElement signInSubmitButton;

        







}


