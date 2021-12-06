import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
//        TESTCASE: User clicks button to open alert popup & clicks ok to close alert popup

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertBtn = driver.findElement(By.id("alert-button"));
        alertBtn.click();
        Thread.sleep(3000);

//        use the Alert class data type to define a new object variable and be able to swtich to that alert
        Alert alert = driver.switchTo().alert(); //switch the drive focus to that alert
        alert.accept(); //this will click ok and close the alert.
        Thread.sleep(3000);


        driver.quit();
    }
}
