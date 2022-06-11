package Week2Day5Assignment2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/checkbox.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Select the languages that you know?
        driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']//following-sibling::input)[1]")).click();
        
        //Confirm Selenium is checked
        boolean selected = driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked']//following-sibling::input)")).isSelected();
        if(selected==true) {
        	System.out.println("The Selenium Checkbox is Selected");
        }
        else {
        	System.out.println("The Selenium Checkbox is Not Selected");
        }
        
        
        //DeSelect only checked
        driver.findElement(By.xpath("(//label[text()='DeSelect only checked']//following-sibling::input)[2]")).click();
        
        //Select all below check boxes 
        List<WebElement> options = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']//following-sibling::input"));
	    int size = options.size();
	    for (int i = 0; i < size; i++) {
		  options.get(i).click();
	    }
	}
	

}
