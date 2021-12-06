import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
//        TESTCASE: click dropdown and select an item from the list

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownFiled = driver.findElement(By.id("dropdownMenuButton"));
        dropdownFiled.click();
        Thread.sleep(3000);

        WebElement dropdownItem = driver.findElement(By.id("autocomplete"));
        dropdownItem.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
