package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTestCases {
    public static void main(String[] args) {
    	
    	// Set the driver path
    	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\dell\\Desktop\\DemoTest\\Drivers\\chromedriver.exe");
    	
    	// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://sakshingp.github.io/assignment/login.html");

        // Enter the username and password
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("myusername");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("mypassword");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("log-in"));
        loginButton.click();
       
        // Click the Amount header
        WebElement amountField = driver.findElement(By.id("amount"));
        amountField.click();
        
    }
}



