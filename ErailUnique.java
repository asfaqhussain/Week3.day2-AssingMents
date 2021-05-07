package Week3Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {	
		 WebDriverManager.chromedriver().setup();	
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.id("txtstationfrom")).clear();
			Thread.sleep(3000);
			driver.findElement(By.id("txtstationfrom")).sendKeys("chennai");		
           driver.findElement(By.xpath("//div[text()='beach jn']")).click();
           driver.findElement(By.id("txtstationto")).clear();		
           driver.findElement(By.id("txtstationto")).sendKeys("delhi");		
           driver.findElement(By.xpath("//div[@title='delhi']//div[1]")).click();
           List<WebElement>TrainName=driver.findElements(By.xpath("//table[@class='DataTable TrainListHeader']/td[2]/a"));
	          
	List<String>List1=new ArrayList<String>();
	for (int i=0; i<TrainName.size();i++) {
		String List=TrainName.get(i).getText();
		List1.add(List);
		System.out.println(List1.size());
		HashSet<String>set=new HashSet<String>(List1);
		for(String Train:List1) {
			set.add(Train);
			System.out.println(set);
			System.out.println(set.size());
				
			}
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	

}
