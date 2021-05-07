package Week3Day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailMapInSelinium {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();	
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.id("txtstationfrom")).clear();
			driver.findElement(By.id("txtstationfrom")).sendKeys("chennai");		
        driver.findElement(By.xpath("//div[text()='beach jn']")).click();
        driver.findElement(By.id("txtstationto")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("txtstationto")).clear();
        driver.findElement(By.id("txtstationto")).sendKeys("delhi");		
        driver.findElement(By.xpath("//div[@Title='delhi']//div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("chkselectdateonly")).click();
        System.out.println("unchecked the sort on date");
        Map<String,String>map=new HashMap<String,String>();
        List<WebElement>Train=driver.findElements(By.xpath("//table[@class='DataTable TrainListHeader']"));
	for(WebElement row :Train) {
		List<WebElement>coloums=row.findElements(By.tagName("td"));
		for (WebElement cols:coloums) {
		if(cols.getText().startsWith("m")) {
			map.put(cols.getText(), cols.getText());
			System.out.println(map.values());
		}
		}
	}
	
	
	
	
	
	
	
	}

}
