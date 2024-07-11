package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the element with the select tag

       WebElement DD = driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
       //Select class
        Select sel = new Select(DD);
        // Select by index
        sel.selectByIndex(3);

        Thread.sleep(2000);
        //select by Value

        sel.selectByValue("Sunday");

        Thread.sleep(3000);
        //select by visible text
        sel.selectByVisibleText("Monday");

        WebElement multiplelDD = driver.findElement(By.xpath("//select[@id='multi-select']"));
       // select class
        Select select1 = new Select(multiplelDD);

        select1.selectByValue("Florida");

        select1.selectByVisibleText("New York");

        select1.selectByIndex(0);

        //options in multiselect
        select1.deselectByIndex(0);

        System.out.println("the dropdown2 is multiselect" + select1.isMultiple());
        System.out.println("the dropdown2 is multiselect" + sel.isMultiple());



    }
}
