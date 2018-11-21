package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMain {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/pitr/Intellij_Projects/Selenium_Test_Formy/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://learn.letskodeit.com/p/practice");

        driver.findElement(By.cssSelector("input[value='benz']")).click();
        driver.findElement(By.cssSelector("#carselect"));
        driver.findElement(By.cssSelector("option[value='benz']")).click();
        driver.findElement(By.cssSelector("option[value='orange']")).click();
    }
}
