import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        //        first find the element you wish to automate
        WebElement nameInput = driver.findElement(By.id("name"));

//        then to scroll we use the method moveToElement which is provided by the Actions class.
//        create a new object of the actions class with driver as parameter.
        Actions actions = new Actions(driver);
//        scroll to the element
        actions.moveToElement(nameInput);
        Thread.sleep(3000);
//        send text to the element after scrolling to it
        nameInput.sendKeys("Cynth");

        WebElement dateInput = driver.findElement(By.id("date"));
        dateInput.sendKeys("01/01/2020");
        Thread.sleep(3000);


        driver.quit();
    }
}
