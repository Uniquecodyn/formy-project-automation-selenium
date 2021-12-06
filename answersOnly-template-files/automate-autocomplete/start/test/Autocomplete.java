import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
//        set chrome driver location
        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

//      instantiate chrome driver
        WebDriver driver = new ChromeDriver();

//       launch website or webapp
        driver.get("https://formy-project.herokuapp.com/autocomplete");

//        find the element and assign it to a WebElement data type variable
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        send text to the text field to generate the auto-complete result
        autocomplete.sendKeys("1555 Pacific Coast Highway, Oxnard, CA");

//        wait for element to be ready
        Thread.sleep(3000);

//         find the autocomplete result element and assign it to a WebElement data type variable
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//        click the autocomplete result populate the text field
        autocompleteResult.click();

//        Quit driver and close all windows
        driver.quit();
    }
}
