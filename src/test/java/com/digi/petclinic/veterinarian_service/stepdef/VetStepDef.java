package com.digi.petclinic.veterinarian_service.stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import sun.security.util.PendingException;


@ContextConfiguration
@SpringBootTest
@ActiveProfiles("test")
public class VetStepDef {


    @Given("^Jonn search for veterinarian available$")
    public void jonn_search_for_veterinarian_available() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^John should get the veterinarian as$")
    public void john_should_get_the_veterinarian_as(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

}
