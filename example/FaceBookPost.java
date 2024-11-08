package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FaceBookPost {
    public static void main(String[] args) {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://in.linkedin.com/");
  driver.findElement(By.xpath("//a[contains(.,'           Sign in ')]")).click();
 driver.findElement(By.id("username")).sendKeys("piyapaymal2098@gmail.com");
 driver.findElement(By.id("password")).sendKeys("Kolhapur@2020");


    }
}
