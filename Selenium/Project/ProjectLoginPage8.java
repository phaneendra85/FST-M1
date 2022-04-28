import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectLoginPage8 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void exampleTestCase() throws InterruptedException {

        WebElement username = driver.findElement(By.xpath("//*[@id=\'user_login\']"));
        username.sendKeys("root");

        WebElement password = driver.findElement(By.xpath("//*[@id=\'user_pass\']"));
        password.sendKeys("pa$$w0rd");

        WebElement login = driver.findElement(By.xpath("//*[@id=\'wp-submit\']"));
        login.click();

        Thread.sleep(2000);
        String heading = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/h1")).getText();
        Assert.assertTrue(heading.contains("Dashboard"));

        //Assertion for page heading
        Assert.assertEquals("Dashboard", heading);
//Print the title of the page
        System.out.println("Page heading is: " + heading);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}