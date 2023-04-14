package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FrameExample {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {

        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize(); //for window to maximize

    }

    @Test
    public void frame() throws InterruptedException {


        driver.switchTo().frame("mce_0_ifr");
        WebElement e = driver.findElement(By.id("tinymce"));
        e.clear();
        e.sendKeys("Hii this is frame");


    }
}
