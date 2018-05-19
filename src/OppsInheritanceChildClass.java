import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OppsInheritanceChildClass extends OppsInheritanceParentClass {
	WebDriver driver;
	public static void MedRec() {
			String FirstName="Arif";
			String LastNmae="Rasmi";
			int SSN=1;
			String Address="Rasmi Street";
			System.out.print("Arif MedRecord is :"+FirstName +" "+LastNmae +" "+SSN+" " + Address);

	}
	public static void Webdriver() {
	System.setProperty("webdriver.chrome.driver", "/Users/arifrasmi/Desktop/Work/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://flighthub.com");
}
}