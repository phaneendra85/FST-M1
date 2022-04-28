import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSearchJob {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void exampleTestCase() throws InterruptedException {

        WebElement Jobbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a"));
        Jobbutton.click();
        String title = driver.getTitle();
        //Assert.assertEquals("Alchemy Jobs – Job Board Application", title);

        //Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
        System.out.println("2nd Page title is: " + title);

        WebElement Searchbox = driver.findElement(By.id("search_keywords"));
        Searchbox.sendKeys("Banking");

        WebElement SearchButton = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input"));
        SearchButton.click();
        Thread.sleep(3000);

        WebElement SearchItem = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3"));
        SearchItem.click();

        WebElement ApplyJob = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input"));
        ApplyJob.click();
        Thread.sleep(2000);

        WebElement Sendemail = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/div/p/a"));
        Sendemail.getAttribute("abhiram@cklabs.com");
        Assert.assertTrue(Sendemail.isDisplayed());
        //Assert.assertEquals("abhiram@cklabs.com", Sendemail);
        //System.out.println("Email send to: " + Sendemail);

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}