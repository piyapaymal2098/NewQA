package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon i
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.name("firstname")).sendKeys("Sp");
        driver.findElement(By.name("lastname")).sendKeys("abcsd");
        WebElement birthday_day = driver.findElement(By.name("birthday_day"));
        Select s= new Select(birthday_day);
        s.selectByValue("20");
        WebElement birthday_month = driver.findElement(By.name("birthday_month"));
        Select s2= new Select(birthday_month);
        s2.selectByVisibleText("Jul");
        WebElement birthday_year = driver.findElement(By.name("birthday_year"));
        Select s3= new Select(birthday_year);
        s3.selectByVisibleText("1998");
        driver.findElement(By.id("sex")).click();
      driver.findElement(By.name("reg_email__")).sendKeys("12365489468");
      driver.findElement(By.id("password_step_input")).sendKeys("abscd@2245");
      driver.findElement(By.name("websubmit"));

    }
}