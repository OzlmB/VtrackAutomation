package com.vtrack.stepdefinitions;

import com.vtrack.pages.AddEventPage;
import com.vtrack.pages.LoginPage;
import com.vtrack.utilities.BrowserUtils;
import com.vtrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddEvent2StepDef {

LoginPage loginPage=new LoginPage();
AddEventPage addEventPage=new AddEventPage();
    @When("the user clicks {string} menu")
    public void the_user_clicks_menu(String string) {
      loginPage.loginAsDriver();
        BrowserUtils.waitFor(3);
        addEventPage.fleetButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the users clicks {string} menu")
    public void the_users_clicks_menu(String vehicle) {
    addEventPage.vehicleButton.click();
    BrowserUtils.waitFor(5);
    }

    @Then("the user should be on {string} page")
    public void the_user_should_be_on_page(String expectedTitle) {

        Assert.assertTrue(Driver.get().getTitle().contains("Car"));
    }

    @When("the user rows down on the page")
    public void the_user_rows_down_on_the_page() {
        BrowserUtils.waitFor(2);
    }

    @Then("the user clicks on any vehicles")
    public void the_user_clicks_on_any_vehicles() {
        AddEventPage addEventPage=new AddEventPage();
        addEventPage.driver.click();
    }

    @Then("the user can access the Add Event page from the general information page")
    public void the_user_can_access_the_Add_Event_page_from_the_general_information_page() {
      String actualtitle=addEventPage.general.getText();
      String expectedtitle="General";
      Assert.assertEquals(expectedtitle,actualtitle);

    }



    @Then("{string} page should be pop up")
    public void page_should_be_pop_up(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can mark the event with any color")
    public void the_user_can_mark_the_event_with_any_color() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user can mark {string} button")
    public void the_user_can_mark_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Repeat option should includes the options below")
    public void repeat_option_should_includes_the_options_below(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Ends option should be as below and clickable")
    public void ends_option_should_be_as_below_and_clickable(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @When("All Users can see all events in the General information page")
    public void all_Users_can_see_all_events_in_the_General_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

