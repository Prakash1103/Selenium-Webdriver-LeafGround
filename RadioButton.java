package Week2Day5Assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/radio.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Are you enjoying the classes?
        driver.findElement(By.xpath("(//label[text()='Are you enjoying the classes?']//following-sibling::input)[1]")).click();
        
        //Find default selected radio button
        List<WebElement> findElements = driver.findElements(By.xpath("(//label[text()='Find default selected radio button']//following-sibling::input)"));
	    int size = findElements.size();
	    for (int i = 0; i <size; i++) {
	    	
	    	boolean selected = findElements.get(i).isSelected();
	    	
	    	
			if(selected==true) {
				System.out.println("check box index "+ i+" is Selected");
				}
			else {
				System.out.println("check box index " + i+" is not Selected");
			}
		
		//Select your age group (Only if choice wasn't selected)	
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//input)[5]")).click();
	    }
	    
	    
	}
	

}
