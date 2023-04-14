package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class DropDownExample {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize(); //for window to maximize

    }
    @Test
    public void dropdown() throws InterruptedException {
        Select select=new Select(driver.findElement(By.id("dropdown")));
//        select.selectByValue("1");
//        select.selectByVisibleText("Option 1");
//        select.getOptions();
        List<WebElement> list=select.getOptions();
        for (WebElement a: list)
        {
            System.out.println(a.getText());
        }
//        Thread.sleep(2000);




    }
// @AfterClass
// void close(){
// driver.close();
// }
}
