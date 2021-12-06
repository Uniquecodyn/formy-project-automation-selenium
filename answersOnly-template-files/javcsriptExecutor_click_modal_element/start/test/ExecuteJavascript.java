import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

//        TESTCASE: click button to open modal then click the close button on the modal to close the modal

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalBtn = driver.findElement(By.id("modal-button"));
        modalBtn.click(); // click button to open the modal
        Thread.sleep(3000);

//        get the close button on the modal
        WebElement closeBtn = driver.findElement(By.id("close-button"));

//  use the JS executor class to click the modal close button
//        create an object instance of the JavascriptExecutor class
        JavascriptExecutor js = (JavascriptExecutor)driver;
//        use the executeScript method of the JavascriptExecutor object instance to click the modal close button
        js.executeScript("arguments[0].click();", closeBtn);
        Thread.sleep(3000);


        driver.quit();
    }
}
