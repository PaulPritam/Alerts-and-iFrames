package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class NestedFrames {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pritam Paul\\Downloads\\demo1\\iFrames\\src\\" +
                "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Robot robot = new Robot();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        driver.switchTo().frame(3);
        driver.switchTo().frame(1);

    }
}
