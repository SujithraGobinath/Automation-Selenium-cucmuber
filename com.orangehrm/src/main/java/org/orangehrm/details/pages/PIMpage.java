package org.orangehrm.details.pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.orangehrm.details.Utils.ActionUtils;

import java.util.concurrent.TimeoutException;

public class PIMpage {
    private WebDriver driver;
    private static Logger logger = LogManager.getLogger("");
    Scenario scenario;
    ActionUtils actions;

    By pim = By.xpath("//ul[@class='oxd-main-menu']/child::li[2]");
    By employee = By.xpath("//input[@placeholder='Type for hints...']");
    By employeeid = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By employeestatus = By.xpath("(//label[@class='oxd-label'])[3]/following::div[@class=''][1");
    By jobtitle = By.xpath("(//div[@tabindex='0'])[3]");
    By search = By.xpath("//button[@type='submit']");

    By name = By.xpath("(//div[@class='header'])[7]/following::div[@class='data']");
    By reset = By.xpath("//button[@type='reset']");

    By alert = By.xpath("//div[@role='document']");
    By delete = By.xpath("//i[@class='oxd-icon bi-trash']");
    By options= By.xpath("//button[text()=' No, Cancel ']");


    public PIMpage(WebDriver driver, Scenario scenario) {
        this.driver = driver;
        this.scenario= scenario;
        actions = new ActionUtils(driver);

    }

    public void pimpage() {
        actions.wait(pim);
        actions.findandclick(pim);
    }

    public void fielddeatails(String Employeename, String EmployeeId) {
        actions.wait(employee);
        actions.findandsend(employee, Employeename);
        actions.wait(employeeid);
        actions.findandsend(employeeid, EmployeeId);

    }

    public void search() {
        actions.findandclick(search);
    }

    public void delete() {
        actions.wait(delete);
        actions.findandclick(delete);
        actions.findandclick(options);
    }

    public void alert() {
        actions.wait(alert);
        actions.findandclick(alert);
    }

}