package Steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.orangehrm.details.Cucumber.Testcontext;
import org.orangehrm.details.pages.Login;

public class Loginsteps {
    public static WebDriver driver;
    Login login;
    Scenario scenario;

    public Loginsteps(Testcontext testcontext) {

        login = new Login(testcontext.getDriver(),testcontext.getScenario());
    }

    @Given("Given Open the login page")
    public void given_open_the_login_page() {
login.login();

    }
    @Given("enter {string} and {string}")
    public void enter_and(String username, String password) {
        login.enterdatas(username,password);

    }


    @Then("click login")
    public void click_login() {
        login.click();
    }






}
