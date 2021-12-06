import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
//        TESTCASE: user click btn on default tab to open new tab and close new tab to switch back to default tab

        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath+"/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

//        find and click button element to open new tab
        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click(); //open new tab
        Thread.sleep(3000);

//        Now there is 2 tabs open, get both of the window handle and switch to the tab that is open
//        getWindowhandle method identifies the id of the window/tab to switch to
        String defaultHandle = driver.getWindowHandle();
//        write a for loop to iterate the 2 handles and be able to switch back to the default tab that was originally open
//        driver.getWindowHandles method will get both window/tab handles
//        for(String handle1: driver.getWindowHandles()) {
//            System.out.println(handle1);
//            driver.switchTo().window(handle1); // will switch from the default window/tab handle then to the second window/tab handle
//            Thread.sleep(3000);
//        }
//
////        switch back to the defaultTab handle
//        driver.switchTo().window(defaultHandle);
//        Thread.sleep(3000);

//      write a for loop to iterate the 2 handles and be able to switch back to the default tab that was originally open
//        driver.getWindowHandles method will get both window/tab handles
        for(String handle1: driver.getWindowHandles()) {
//            System.out.println(handle1);
//            check for the new window handle
            if (!handle1.equalsIgnoreCase(defaultHandle)) {
                //Switch to the newly opened tab
                driver.switchTo().window(handle1);
                Thread.sleep(3000);
//                close the newly opened tab
                driver.close();
                Thread.sleep(3000);
            }
        }

        driver.quit();
    }
}
