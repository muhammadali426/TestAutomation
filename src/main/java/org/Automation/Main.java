package org.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
    public static void main(String[] args) {
        // Set the path to the Chrome driver
        System.setProperty("webdriver.chrome.driver", "D:/Personel/Automation/API/libs/drivers/chrome/chromedriver.exe");

        // Set Chrome options for headless mode
       // ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless"); // Run Chrome in headless mode

        // Create a new instance of the Chrome driver with headless options
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        //driver.quit();
    }
}