import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project2ndPage {
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

        String URL = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img")).getText();

        //Assert.assertTrue(URL.contains("https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg"));

        //Assertion for page heading
        //Assert.assertEquals("https://alchemy.hguy.co/jobs/wp-content/uploads/2019/09/career-corporate-job-776615-e1569782235456-1024x271.jpg", URL);
//Print the title of the page
        System.out.println("Page URL is: " + URL);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

    public static class ProjectNavig {
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
            WebElement Jobbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a"));
            Jobbutton.click();
            String title = driver.getTitle();
            //Assert.assertEquals("Alchemy Jobs – Job Board Application", title);

            //Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
            System.out.println("2nd Page title is: " + title);
        }

        @AfterMethod
        public void afterMethod() {
            //Close the browser
            //driver.quit();
        }

    }
}