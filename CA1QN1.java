package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CA1QN1 {
public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	Thread.sleep(5000);
	driver.get("https://www.amazon.in/Samsung-Galaxy-Ultra-Green-Storage/dp/B0BT9CXXXX/ref=sr_1_1?crid=2PJUQF2G7KAMU&keywords=samsung%2Bs23%2Bultra%2B5g&qid=1683193215&sprefix=samsung%2Caps%2C2224&sr=8-1&th=1");
	
	driver.manage().window().maximize();
	
	

	String title = driver.getTitle();
    String etitle =  "Samsung Galaxy S23 Ultra 5G (Green, 12GB, 256GB Storage) : Amazon.in: Electronics";
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9345863509",Keys.ENTER);
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Vayisha147_",Keys.ENTER);
    System.out.println(title);
    if(title.equals(etitle)) {
    	System.out.println("Title is matching");
    }
    else {
    	System.out.println("Title Mismatch");
    }
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    Thread.sleep(5000); 
    Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
    System.out.println("Is item added to cart:" + present);
    driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
    Thread.sleep(2000);
    String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
    String extext = "Your Amazon Cart is empty.";
    if(removeText.equals(extext)) {
    	System.out.println("Product is removed");
    }
    Thread.sleep(4000);

    driver.get("https://www.amazon.in/Samsung-Galaxy-Ultra-Green-Storage/dp/B0BT9CXXXX/ref=sr_1_1?crid=2PJUQF2G7KAMU&keywords=samsung%2Bs23%2Bultra%2B5g&qid=1683193215&sprefix=samsung%2Caps%2C2224&sr=8-1&th=1");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    Thread.sleep(2000);
    driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
    Thread.sleep(1000);
    String sign = driver.getTitle();
    System.out.println(sign);
    String esign = "Amazon Sign In";
    if(sign.equals(esign)) {
    	System.out.println("Success");
    }
    else {
    	System.out.println("Failure");
    }


	
}
}
