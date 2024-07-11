package class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        // find the element email address and email address to it
        WebElement email = driver.findElement(By.id("email"));
        //send text
        email.sendKeys("moazmasadig@gmail.com");
// pass the password
       WebElement password  = driver.findElement(By.name("pass"));
//send text
       password.sendKeys("brachdmk");

      WebElement button  = driver.findElement(By.name("login"));
      // click on the button
      //button.click();

        //go to

        WebElement createAccount = driver.findElement(By.partialLinkText("account"));
        createAccount.click();
    }
}
