import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);



        WebDriver driver = new ChromeDriver();

//        Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,3);

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

//        using the explicit wait to wait for the auto-complete result to show

        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
