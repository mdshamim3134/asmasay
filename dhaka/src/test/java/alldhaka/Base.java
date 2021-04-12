package alldhaka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.childrensplace.com/");
		String title=dr.getTitle();
		System.out.println("title is "+" "+title);
		System.out.println("i am pass");
		
			
	}
	@Test
	void dd() {
		System.out.println("i am exclude");
		System.out.println(300);
		System.out.println(2);
	}

}
