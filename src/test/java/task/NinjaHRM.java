package task;

import java.awt.Label;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaHRM {

	public static void main(String[] args) {
		String expId="TPH_1154";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://106.51.90.215:8084/");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Your UserName\"]")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Password\"]")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		//	WebElement pid = driver.findElement(By.xpath("//table[@class=\"table table-striped table-hover\" ]//tr//a[not (contains(@class,'edit' ) or contains(@class,'delete'))]"));
		//	System.out.println(pid.getText());


		for(;;)
		{
//			
			try {
				List<WebElement> pid = driver.findElements(By.xpath("//table[@class=\"table table-striped table-hover\" ]//tr//a[not (contains(@class,'edit' ) or contains(@class,'delete'))]"));

			for(WebElement p : pid)
			{
				String proID = p.getText();
				System.out.println(proID);
			}
			}catch(Exception e)
			{
				driver.findElement(By.xpath("//a[@aria-label=\"Go to next page\"]")).click();
				
			}


		}



	






}

}
