import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class ProjectGetHeading {
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

        String heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1")).getText();

        Assert.assertTrue(heading.contains("Welcome to Alchemy Jobs"));

        //Assertion for page heading
        Assert.assertEquals("Welcome to Alchemy Jobs", heading);
//Print the title of the page
        System.out.println("Page heading is: " + heading);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}