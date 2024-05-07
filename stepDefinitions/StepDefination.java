package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("I am a "registered user" logging into the platform")
    public void iAmARegisteredUserLoggingIntoThePlatform() {
        System.out.println("Executing step: I am a "registered user" logging into the platform");
    }

    @When("I login")
    public void iLogin() {
        System.out.println("Executing step: I login");
    }

    @Then("I should see the result as "failure"")
    public void iShouldSeeTheResultAsFailure() {
        System.out.println("Executing step: I should see the result as "failure"");
    }

    @When("I verify otp")
    public void iVerifyOtp() {
        System.out.println("Executing step: I verify otp");
    }

    @When("I search product")
    public void iSearchProduct() {
        System.out.println("Executing step: I search product");
    }

    @When("I add product to cart")
    public void iAddProductToCart() {
        System.out.println("Executing step: I add product to cart");
    }

    @When("I verify cart")
    public void iVerifyCart() {
        System.out.println("Executing step: I verify cart");
    }

    @When("I add address")
    public void iAddAddress() {
        System.out.println("Executing step: I add address");
    }

    @When("I get address")
    public void iGetAddress() {
        System.out.println("Executing step: I get address");
    }

    @When("I select address")
    public void iSelectAddress() {
        System.out.println("Executing step: I select address");
    }

    @When("I get payment options")
    public void iGetPaymentOptions() {
        System.out.println("Executing step: I get payment options");
    }

    @When("I get aggregators")
    public void iGetAggregators() {
        System.out.println("Executing step: I get aggregators");
    }

    @When("I review order")
    public void iReviewOrder() {
        System.out.println("Executing step: I review order");
    }

    @When("I checkout")
    public void iCheckout() {
        System.out.println("Executing step: I checkout");
    }

    @When("I get order")
    public void iGetOrder() {
        System.out.println("Executing step: I get order");
    }

    @When("I delete address")
    public void iDeleteAddress() {
        System.out.println("Executing step: I delete address");
    }

    @When("I logout")
    public void iLogout() {
        System.out.println("Executing step: I logout");
    }

    @When("I customer cancel - kapture")
    public void iCustomerCancelKapture() {
        System.out.println("Executing step: I customer cancel - kapture");
    }

    @When("I verify customer cancel shipment")
    public void iVerifyCustomerCancelShipment() {
        System.out.println("Executing step: I verify customer cancel shipment");
    }

    @When("I seller cancellation")
    public void iSellerCancellation() {
        System.out.println("Executing step: I seller cancellation");
    }

    @When("I verify seller cancel shipment")
    public void iVerifySellerCancelShipment() {
        System.out.println("Executing step: I verify seller cancel shipment");
    }

    @When("I invoice")
    public void iInvoice() {
        System.out.println("Executing step: I invoice");
    }

    @When("I dispatch")
    public void iDispatch() {
        System.out.println("Executing step: I dispatch");
    }

    @When("I intransit")
    public void iIntransit() {
        System.out.println("Executing step: I intransit");
    }

    @When("I outfordelivery")
    public void iOutfordelivery() {
        System.out.println("Executing step: I outfordelivery");
    }

    @When("I delivered")
    public void iDelivered() {
        System.out.println("Executing step: I delivered");
    }

    @When("I initiate return - kapture")
    public void iInitiateReturnKapture() {
        System.out.println("Executing step: I initiate return - kapture");
    }

    @When("I verify return shipment")
    public void iVerifyReturnShipment() {
        System.out.println("Executing step: I verify return shipment");
    }

    @When("I platform login")
    public void iPlatformLogin() {
        System.out.println("Executing step: I platform login");
    }

    @When("I platform token")
    public void iPlatformToken() {
        System.out.println("Executing step: I platform token");
    }

    @When("I platform access")
    public void iPlatformAccess() {
        System.out.println("Executing step: I platform access");
    }

    @When("I return bag picked")
    public void iReturnBagPicked() {
        System.out.println("Executing step: I return bag picked");
    }

    @When("I return bag in transit")
    public void iReturnBagInTransit() {
        System.out.println("Executing step: I return bag in transit");
    }

    @When("I return complete")
    public void iReturnComplete() {
        System.out.println("Executing step: I return complete");
    }

    @When("I rto")
    public void iRto() {
        System.out.println("Executing step: I rto");
    }

    @When("I rto complete")
    public void iRtoComplete() {
        System.out.println("Executing step: I rto complete");
    }

}
