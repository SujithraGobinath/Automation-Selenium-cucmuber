package Steps;




import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.orangehrm.details.Cucumber.Testcontext;



public class Hooks {
    Testcontext testcontext;
     //Scenario scenario;


    public Hooks(Testcontext testcontext) {

        this.testcontext = testcontext;

    }


    @Before
    public void Setup() {
        WebDriverManager.chromedriver().browserVersion("124").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        testcontext.setDriver(new ChromeDriver(options));
        testcontext.setScenario(testcontext.scenario);

    }

    @After
    public void Takescreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) testcontext.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "");



    }
}











