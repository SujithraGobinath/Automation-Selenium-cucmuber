package Steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.orangehrm.details.Cucumber.Testcontext;
import org.orangehrm.details.Utils.ActionUtils;
import org.orangehrm.details.pages.Login;
import org.orangehrm.details.pages.PIMpage;
import org.picocontainer.PicoCompositionException;

public class PIMsteps {
    public static WebDriver driver;
    PIMpage pim;
    Scenario scenario;
    ActionUtils actions;
    Testcontext testcontext;




    public PIMsteps(Testcontext testcontext) {
        this.testcontext = testcontext;
        pim = new PIMpage(testcontext.getDriver(),testcontext.getScenario());



    }


    @Then("move to PIM page")
    public void move_to_pim_page() {
        pim.pimpage();


    }

    @Then("enter {string} and {string} in the fields")
    public void enter_and_in_the_fields(String Employeename, String EmployeeId) {
        pim.fielddeatails(Employeename, EmployeeId);


    }

    @Then("search with given data")
    public void search_with_given_data() {

            pim.search();


        }

    @Then("delete the data")
    public void delete_the_data() {
        pim.delete();

    }

    @Then("handle the alert")
    public void handle_the_alert() {
        pim.alert();
    }


}
