package session9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectPostJob {
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

        WebElement postJob = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[3]/a"));
        postJob.click();
        String title = driver.getTitle();

        WebElement email = driver.findElement(By.xpath("//*[@id=\'create_account_email\']"));
        email.sendKeys("abc@gmail.com");

        WebElement jtitle = driver.findElement(By.id("job_title"));
        jtitle.sendKeys("Test Specialist");
        WebElement appemail = driver.findElement(By.xpath("//*[@id='application']"));
        appemail.sendKeys("applicationemail.gmail.com");
        WebElement company = driver.findElement(By.xpath("//*[@id='company_name']"));
        company.sendKeys("IBM");
        //WebElement desc = driver.findElement(By.xpath("//*[@id='tinymce']"));
        //desc.sendKeys("5-7year Automation tester position");
        WebElement previewbut = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]"));
        previewbut.click();
        Thread.sleep(4000);
        WebElement subbut = driver.findElement(By.xpath("//*[@id=\'job_preview_submit_button\']"));
        subbut.click();
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }

}