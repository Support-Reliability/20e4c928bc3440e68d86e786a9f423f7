package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("the user has entered a valid mobile number {string}, country code {string}, and captcha code {string}")
    public void theUserHasEnteredAValidMobileNumberCountryCodeAndCaptchaCode(String mobile, String country_code, String captcha_code) {
        System.out.println("Executing step: the user has entered a valid mobile number {string}, country code {string}, and captcha code {string}");
    }

    @When("the user initiates an OTP request")
    public void theUserInitiatesAnOtpRequest() {
        System.out.println("Executing step: the user initiates an OTP request");
    }

    @Then("an OTP should be sent to the specified mobile number")
    public void anOtpShouldBeSentToTheSpecifiedMobileNumber() {
        System.out.println("Executing step: an OTP should be sent to the specified mobile number");
    }

    @Given("the user enters the received OTP {string} for the mobile number {string}")
    public void theUserEntersTheReceivedOtpForTheMobileNumber(String otp, String mobile) {
        System.out.println("Executing step: the user enters the received OTP {string} for the mobile number {string}");
    }

    @When("the user submits the OTP for verification")
    public void theUserSubmitsTheOtpForVerification() {
        System.out.println("Executing step: the user submits the OTP for verification");
    }

    @Then("the user should be successfully authenticated")
    public void theUserShouldBeSuccessfullyAuthenticated() {
        System.out.println("Executing step: the user should be successfully authenticated");
    }

    @Given("the user is authenticated")
    public void theUserIsAuthenticated() {
        System.out.println("Executing step: the user is authenticated");
    }

    @When("the user searches for {string}")
    public void theUserSearchesFor(String product_name) {
        System.out.println("Executing step: the user searches for {string}");
    }

    @Then("the system should display products related to {string}")
    public void theSystemShouldDisplayProductsRelatedTo(String product_name) {
        System.out.println("Executing step: the system should display products related to {string}");
    }

    @And("the system should include at least one product with a detailed description and price")
    public void theSystemShouldIncludeAtLeastOneProductWithADetailedDescriptionAndPrice() {
        System.out.println("Executing step: the system should include at least one product with a detailed description and price");
    }

}
