package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxWxample {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {

        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize(); //for window to maximize

    }

    @Test
    public void checkbox() throws InterruptedException {

        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,360)","");
        WebElement w= driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        w.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();


    }
}
