package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddAutoPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddAutoSteps {

    @And("User click LetTheCarWork link")
    public void open_Car_Work_Link() {
        new HomePage(driver).clickOnLetTheCarWork();

    }

    @And("User enters car details:")
    public void enter_car_details() {
        new AddAutoPage(driver).enterCarDetails("Haifa","Ford","S-Max",
                "2012","Hybrid","5","C","MO8888","400");

    }

    @And("User adding photo")
    public void click_on_adding_photo_bottom() {
        new AddAutoPage(driver).clickAddPhoto("C:/Users/strel/Downloads/мару1.jpg");

    }

    @And("User clicks Submit button")
    public void click_on_Submit_bottom() {
        new AddAutoPage(driver).clickSubmitButton();
    }

    @Then("User successfully added new car")
    public void verifyCarAdded() {
        new AddAutoPage(driver).successfullyCarAdded("Car added");
    }
}
