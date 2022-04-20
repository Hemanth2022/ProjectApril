package org.git;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Flipkart extends BaseClass{
      public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		launchUrl("https://www.flipkart.com/");
		implicityWait(10);
		
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnlogin.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone",Keys.ENTER);
//		WebElement search1 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//		search1.click();
		List<WebElement>phonelist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> phoneprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int size=phonelist.size();
		System.out.println(size);
		
	for(int i=0;i<phonelist.size();i++)
	{
		WebElement each = phonelist.get(i);
		System.out.println(each.getText());
		WebElement each1 = phoneprice.get(i);
		System.out.println(each1.getText());	
	}	
	quit();
	}     
    }
