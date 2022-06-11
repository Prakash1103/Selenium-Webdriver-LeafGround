package Week2Day5Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/Button.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click button to travel home page
        driver.findElement(By.xpath("//label[text()='Click button to travel home page']//following-sibling::button")).click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals("http://www.leafground.com/home.html")) {
        	System.out.println("The current page is home Page");
        	}
        else {
        	System.out.println("The current page is not Home page");
        }
       
        //navigate back
        driver.navigate().back();
        
        //Find position of button (x,y)
        Point location = driver.findElement(By.xpath("//label[text()='Find position of button (x,y)']//following-sibling::button")).getLocation();
	    System.out.println("Position of X and Y is  "+location);
	    
	    //Find button color
	    String cssValue = driver.findElement(By.xpath("//label[text()='Find button color']//following-sibling::button")).getCssValue("background-color");
	    System.out.println(cssValue);
	   
	    //Find the height and width
	    Dimension size = driver.findElement(By.id("size")).getSize();
	    System.out.println("the width and height is "+size);
	    
	}
	
	

}
