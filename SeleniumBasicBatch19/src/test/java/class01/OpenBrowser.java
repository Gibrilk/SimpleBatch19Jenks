package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {

        //instance of chromeDriver
        //and navigate to a url

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/");

        //maximize the window
        driver.manage().window().maximize();
//enter full  screen mode i comment it because I want to stay in maximize mode
        //driver.manage().window().fullscreen();

        String title = driver.getTitle();
        System.out.println("The title of the webpage is " + title);
        Thread.sleep(4000);
        driver.quit();
    }
}
