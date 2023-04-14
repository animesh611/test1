package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptAlert {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize(); //for window to maximize

    }
    @Test
    void JavaScriptAlert() throws InterruptedException {

//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hii");
        alert.accept();
    }

}

