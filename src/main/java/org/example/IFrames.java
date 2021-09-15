package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class IFrames {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pritam Paul\\Downloads\\demo1\\iFrames\\src\\" +
                "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Robot robot = new Robot();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,600)", "");
        driver.switchTo().frame(1);

        Thread.sleep(2000);

         WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='selectnav' and @id='selectnav1']//parent" +
                 "::div[@id='LinkList210']//parent::div[@id='LinkList210']"));

        Thread.sleep(2000);

        WebElement choice1 = driver.findElement(By.xpath("//select[@id='course']"));

         if(dropdown1.isDisplayed())
         {
             dropdown1.click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("//option[contains(text(),'- Frames Practice')]")).click();
             if(choice1.isDisplayed())
             {
                 driver.findElement(By.xpath("//option[@value='java']")).click();
             }
         }

        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        Thread.sleep(2000);
        driver.switchTo().frame(2);

        Select select = new Select(driver.findElement(By.xpath("//select[@id='selectnav1']")));
        select.selectByVisibleText("- Basic Controls");

        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys("Pritam");
        driver.findElement(By.id("lastName")).sendKeys("Paul");
        Thread.sleep(2000);

        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();


    }
}
