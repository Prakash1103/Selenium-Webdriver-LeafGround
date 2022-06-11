package Week2Day5Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/Link.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
        //Click button to travel home page
        driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals("http://www.leafground.com/home.html")) {
        	System.out.println("The current page is home Page");
        	}
        else {
        	System.out.println("The current page is not Home page");
        }
       
        //navigate back
        driver.navigate().back();
       
        //Find where am supposed to go without clicking me?
        String attribute = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
	    System.out.println(attribute);
	    
	    //Verify am I broken?
	    String attribute2 = driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
	    if(attribute2.equals("http://www.leafground.com/pages/error.html")) {
	    	System.out.println("Its broken");
	    }
	    else {
	    	System.out.println("Its not broken ");
	    }
	    
	    //Go to Home Page (Interact with same link name)
	    driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
        String currentUrl1 = driver.getCurrentUrl();
        if(currentUrl1.equals("http://www.leafground.com/home.html")) {
        	System.out.println("The current page is home Page");
        	}
        else {
        	System.out.println("The current page is not Home page");
        }
       
	}

}
