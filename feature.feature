Feature: Tira Beauty E-Commerce Application Workflow
@Regression @Smoke @Regression @healthcheck 

  Scenario: User Authentication with OTP verification
    Given the user has entered a valid mobile number "<mobile>", country code "<country_code>", and captcha code "<captcha_code>"
    When the user initiates an OTP request
    Then an OTP should be sent to the specified mobile number
    Given the user enters the received OTP "<otp>" for the mobile number "<mobile>"
    When the user submits the OTP for verification
    Then the user should be successfully authenticated

  Scenario: Product Catalog Search
    Given the user is authenticated
    When the user searches for "<product_name>"
    Then the system should display products related to "<product_name>"
    And the system should include at least one product with a detailed description and price
