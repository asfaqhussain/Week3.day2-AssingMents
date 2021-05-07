package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ErailSorting{


   WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://erail.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("chkselectdateonly")).click();
	System.out.println("unchecked the sort on date");
    WebElement fromStation=driver.findElement(By.xpath("//input[@placeholder='from station']"));
    	fromstation.clear();
    	fromstation.sendkeys("tamabaram");
    	fromstation.sendkeys(keys.TAB);
    		WebElement tostation=driver.findElement(By.xpath("//input[@placeholder='to station']"));
    		fromstation.clear();
        	fromstation.sendkeys("tirunelveli");
        	fromstation.sendkeys(keys.TAB);            
driver.findelement(by.id("buttonfromto")).click();
System.out.println("---train details---");
driver.findelement(by.id("chkselectdateonly")).click();
thread.sleep();
List<WebElement>eleTrainList=driver.findElements(By.xpath("//div[@id='divtrainlist']/table[1]//td[2]"));
System.out.println("Traincount:"+eleTrainList.size());
thread.sleep();
ArrayList<String>trainName=new ArrayList<String>();
for (int i=0; i<eleTrainList.size();i++) {
	System.out.println(trainName);
trainName.add(eleTrainList.get(i).getText());
Collections.sort(trainName);
System.out.println("Ascending order using collection.sort:");
trainName.forEach(System.out::println);
}}}

