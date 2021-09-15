package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pritam Paul\\Downloads\\demo1\\iFrames\\src\\" +
                "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(5000);

        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(5000);
        driver.switchTo().alert();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //display confirm box
//        driver.findElement(By.id("confirmBox")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().dismiss();

//        Thread.sleep(5000);
//        alert.dismiss();

    }
}
