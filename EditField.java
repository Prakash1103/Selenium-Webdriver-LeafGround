package Week2Day5Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/Edit.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Enter your email address
        driver.findElement(By.id("email")).sendKeys("balaprakash150mail.com");
        //Append a text and press keyboard tab
        driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[2]")).sendKeys("add"+Keys.TAB);
        //Get default text entered
        String attribute = driver.findElement(By.name("username")).getAttribute("value");
        if(attribute.equals("TestLeaf")) {
        	System.out.println(attribute +" Entered is verified");
        }
        else {
        	System.out.println(attribute +"Entered is not verified");
        }
        
        //Confirm that edit field is disabled
        driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[4]")).clear();
        boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']//following-sibling::input")).isEnabled();
	    if (enabled==false) {
	    	System.out.println("The Edit field is Disabled ");
	    }
	    	
	    	else {
	    		System.out.println("The Edit field is Enabled ");
	    	}
	    	
	    }
	}
	


