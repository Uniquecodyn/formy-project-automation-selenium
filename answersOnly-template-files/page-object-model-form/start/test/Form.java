import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

//        create an instance of the FormPage class
        FormPage formPage = new FormPage();
       FormPage.submitForm(driver);

//       crate a new object instance of FormConfirmationClass
        FormConfirmationPage confirmFormSubmitted = new FormConfirmationPage();
        confirmFormSubmitted.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmFormSubmitted.getAlertBannerText(driver));

        driver.quit();
    }

}
