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
        //span[contains(text(), 'Hello, sign in')]
        ///html/body/div[1]/header/div/div[1]/div[3]/div/a[2]
        //span[contains(text(), 'Account & Lists')] ")
        //span[contains(text(), 'Hello, sign in')]

        @FindBy(xpath = "//span[@class='nav-action-inner'] ")
        public WebElement singInButton;
///a[@href='url']
        //span[@class='nav-action-inner']
       // nav-icon nav-arrow

        //*[@id="nav-flyout-ya-signin"]/a

        //div[@id='nav-signin-tooltip']

        @FindBy(xpath = "//*[@id='ap_email']")
        public WebElement emailOrNumberToSignIn;

        //*[@id="ap_email"]
       // /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]
        //input[@class='a-input-text a-span12 auth-autofocus auth-required-field']
        //input[@name='email']
        //div[@class='a-section a-spacing-base']
        //div[@class='a-row a-spacing-base']
        //div[@class='a-section a-spacing-base']
        //*[@id='ap_email']



        @FindBy(xpath = "//input[@id='continue']")
        public WebElement continueButton;

        @FindBy(xpath = "//input[@id='ap_password']")
        public WebElement passwordButton;

        @FindBy(xpath = "//input[@id='signInSubmit']")
        public WebElement signInSubmitButton;

        //input[@id='continue']







}


