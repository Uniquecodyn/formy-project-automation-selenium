import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
//        TESTCASE: drag the selenium image and drop it in the square box. the text in the box should the change to dropped

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

//        get the image and box element and use the dragAndDropn method in the Actions class to drag and drop
        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

//        create an instance of the Actions class which takes driver as parameter
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform(); //you have to build and perform the action.
        Thread.sleep(3000);

        driver.quit();
    }
}

