package practiceaddjar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

	public static void main(String[] args) {
		
		 // declaration and instantiation of objects/variables  
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe" );// got the location of the chromedriver which was in desktop folderbuse set property key value method
		WebDriver driver = new ChromeDriver();    // web driver is an interface  it has its own methods. instead driver we can use any name i can use my name shilpa too
		                                          // it opens the empty browser
		
		driver.get("https://cnn.com");         // to launch the website need to use an method called get method
		
		String a = driver.getCurrentUrl();       // use string getcurrenturl method----> to copy the url of the website and and print in console
		System.out.println(a);
		String b = driver.getTitle();           // use string get title method ----> to get the title of the website and print in console
		System.out.println(b);
		driver.quit();                            // to close---> use quit method

	}
}
