package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver m = new ChromeDriver();

        m.get("https://menswearhouse.com");

        m.findElement(By.xpath("//ul[@aria-labelledby=\"categoryCustomerService\"]/li[2]/a")).click();



    }



    }


