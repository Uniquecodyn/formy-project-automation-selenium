import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

//        TESTCASE: click each radio buttom on the webpage

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();

        Thread.sleep(3000);

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();
        Thread.sleep(3000);


        WebElement radioBtn3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radioBtn3.click();
        Thread.sleep(3000);


        driver.quit();
    }
}
