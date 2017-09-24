package StepDefinitions;

import Base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageSteps extends Base {

    public HomepageSteps(WebDriver driver) {
        super(driver);
    }

    public HomepageSteps() {
        super();
        //empty constructor
    }

    @Given("^Open selenium webdriver$")
    public void OpenDriver() {
        driver.manage().window().maximize();
    }

    @When("^Open page '(.*)'$")
    public void OpenPage(String url) {
        driver.get(url);
    }

    @When("^Click element '(.*)'$")
    public void ClickElement(String css) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(css)).click();
    }

    @When("^Fill textbox '(.*)' as '(.*)'$")
    public void FillTextbox(String css, String text) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(css)).clear();
        driver.findElement(By.cssSelector(css)).sendKeys(text);
    }

    @Then("^Verify element '(.*)' text is '(.*)'$")
    public void CheckText(String css, String expected) throws InterruptedException {
        Thread.sleep(1000);
        String actual = driver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expected, actual);
    }

    @When("^I Login with username as '(.*)' and password as '(.*)'$")
    public void Login(String username, String password) throws InterruptedException {
        FillTextbox("input._2zrpKA",username);
        FillTextbox("input._3v41xv",password);
        ClickElement("button._2AkmmA");
    }

    @When("^I search for '(.*)'$")
    public void Search(String product) throws InterruptedException {
        FillTextbox("input.LM6RPg", product);
        ClickElement("button.vh79eN");
    }

    @When("^I add first item in the cart$")
    public void AddToCart() throws InterruptedException {
        ClickElement("div._3T_wwx  a");
        ClickElement("button._2AkmmA");
    }

    @Then("^I Verify product '(.*)' has been added in the cart$")
    public void CheckText(String product) throws InterruptedException {
        CheckText("div._3vIvU_ a",product);
    }
}