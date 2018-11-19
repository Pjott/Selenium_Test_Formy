package Formy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/home/pitr/Intellij_Projects/Selenium_Test_Formy/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Jan");
        driver.findElement(By.id("last-name")).sendKeys("Kowalski");
        driver.findElement(By.id("job-title")).sendKeys("Kierowca");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("11/11/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        driver.quit();
    }
}
