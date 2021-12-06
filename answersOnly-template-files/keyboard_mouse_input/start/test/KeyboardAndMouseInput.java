import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Cynth");

        WebElement btn = driver.findElement(By.id("button"));
        btn.click();

        driver.quit();
    }
}
