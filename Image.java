package Week2Day5Assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the browser
        ChromeDriver driver=new ChromeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/Image.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click on this image to go home page
        driver.findElement(By.xpath("(//label['Click on this image to go home page']//following-sibling::img)[1]")).click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals("http://www.leafground.com/home.html")) {
        	System.out.println("By clicking image it goes to home Page");
        	}
        else {
        	System.out.println("By clicking image it does not goes to home page");
        }
       
        //navigate back
        driver.navigate().back();
       
        //Am I Broken Image?

        File source = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']//following-sibling::img")).getScreenshotAs(OutputType.FILE);
        File destination=new File("./snap/img.png");
        FileUtils.copyFile(source, destination);
        System.out.println("broken image verified by snapshot");
        
        //Click me using Keyboard or Mouse 
        driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']//following-sibling::img")).click();
        String currentUrl1 = driver.getCurrentUrl();
        if(currentUrl1.equals("http://www.leafground.com/home.html")) {
        	System.out.println("By clicking keyboard or mouse image it goes to home Page");
        	}
        else {
        	System.out.println("By clicking keyboard or mouse image it does not goes to home page");
        }
       
	}

}
