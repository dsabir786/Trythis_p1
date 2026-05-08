package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page.Page;

public class ValidTest extends BaseTestP1 {

	@Test
	void Test_01() throws InterruptedException {
		Page pb = new Page();
		WebElement fname=driver.findElement(By.id("fname"));
	     pb.type(fname, "Shabir");
		WebElement lname=driver.findElement(By.id("lname"));
		pb.type(lname,"khas");
		JavascriptExecutor jss= (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,300)");
		WebElement gender=driver.findElement(By.id("male"));
		pb.Click(gender);
		WebElement opt= driver.findElement(By.id("option"));
		Select sel = new Select(opt);
		sel.selectByIndex(2);
		WebElement opt2= driver.findElement(By.id("owc"));
		Select sel1= new Select(opt2);
		sel1.selectByVisibleText("Option 2");
		jss.executeScript("window.scrollBy(0,500)");
		WebElement opt3=driver.findElement(By.xpath("(//input[@id=\"moption\"])[3]"));
		pb.Click(opt3);
		WebElement col = driver.findElement(By.name("Options"));
		pb.type(col, "Strawberry");
		WebElement date= driver.findElement(By.id("day"));
		pb.type(date, "25-05-2026");
		WebElement fil= driver.findElement(By.id("myfile"));
		pb.type(fil, "C:\\Users\\Shabir khan\\Downloads\\popup_1.png");
        WebElement range=driver.findElement(By.id("quantity"));
        pb.type(range, "4");
		jss.executeScript("window.scrollBy(0,900)");
		WebElement msg=driver.findElement(By.xpath("//textarea[@name=\"message\"]"));
		msg.clear();
		pb.type(msg, "i am billionaire");
		jss.executeScript("window.scrollBy(0,1100)");
		WebElement sub= driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
		pb.Click(sub);


		
		
		

		
	}
}
