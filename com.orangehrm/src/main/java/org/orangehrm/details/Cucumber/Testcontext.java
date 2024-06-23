package org.orangehrm.details.Cucumber;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

public class Testcontext {

    public WebDriver driver;
    public Scenario scenario;

   public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
