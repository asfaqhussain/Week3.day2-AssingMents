package Week3Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mynthra {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();	
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifictions");
			ChromeDriver driver=new ChromeDriver(options);
			driver.get("https://www.mynthra.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			WebElement Women=driver.findElement(By.xpath("//a[text()='women']"));
         				Actions builder =new Actions(driver);
                      builder.moveToElement(Women).build().perform();
                      driver.findElementByLinkText("jackets &coats").click();
                      Thread.sleep(3000);
                      String Total=driver.findElementByXPath("//span[@class='title-count']").getText();
                      Total=Total.replaceAll("//D", "");
                      int TotalCount=Integer.parseInt(Total);
                      System.out.println("Total Count Of The Item:"+TotalCount);
                      String JacketsCount=driver.findElementByXPath("//span[@class='categories-num'][1]").getText();
                      String CoatsCount=driver.findElementByXPath("//span[@class='categories-num'][2]").getText();        
	                  JacketsCount=JacketsCount.replaceAll("//D","");
	                  int JCount=Integer.parseInt(JacketsCount);
	                  int cCount=Integer.parseInt(CoatsCount);
	                  int JacketsCoats=JCount+cCount;
                     System.out.println("JacketCount  + CoatsCount=" + JacketsCoats);  
						if(TotalCount==JacketsCoats) {
							System.out.println("the sum of the Jackets and coats matches with the total.");}
							else 
								System.out.println("Count not matched");
					driver.findElementByXPath("//div[@class='common-checkboxIndicator'])[2]").click();
					driver.findElementByXPath("//div[@class='brand-more'])").click();
					driver.findElementByXPath("//input[@class='FilterDirectory-SearchInput'])[1]").sendKeys("Mango");
					driver.findElementByXPath("//label[@class='CustomerCheckBox']").click();
					driver.findElementByXPath("//div[@class='FilterDirectory-titleBar]'/span").click();
						Thread.sleep(5000);
						List<WebElement>PriceList=driver.findElementsByXPath("//div[@class='product-productmetaInfo'])[1]");
						String price=PriceList.get(0).getText();
						System.out.println("price of the first displayed item:" +price);
						Thread.sleep(2000);
						driver.findElementByXPath("//span[text()='wishlist'])[1]").click();
						driver.close();
						
						
						
						
						
						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}
