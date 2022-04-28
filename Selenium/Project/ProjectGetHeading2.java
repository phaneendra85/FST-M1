import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectGetHeading2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void exampleTestCase() {

        String subheading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();

        Assert.assertTrue(subheading.contains("Quia quis non"));

        //Assertion for page heading
        Assert.assertEquals("Quia quis non", subheading);
//Print the title of the page
        System.out.println("Page heading is: " + subheading);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}