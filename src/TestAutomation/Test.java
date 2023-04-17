package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Testing {
	
	void home() {
		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://35.92.179.38:3000/");
		
		System.out.println("Home Page Testing:");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div/div/header/div/span"));
		boolean titlei = title.isDisplayed();
		System.out.println("Title Displayed: " + titlei);
		
		WebElement image = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/img"));
		boolean imagei = image.isDisplayed();
		System.out.println("Image Displayed: "+imagei);

		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/a"));
		boolean loginb =loginButton.isEnabled();
		System.out.println("Login Button Clickable: "+loginb);
		
		WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/a"));
		boolean registerb =registerButton.isEnabled();
		System.out.println("Register Button Clickable: "+registerb);
		
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button"));
		boolean searchb =searchButton.isEnabled();
		System.out.println("Search Button Clickable: "+searchb);
		
		WebElement petIdBox = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/input"));
		boolean petIdboxb =petIdBox.isDisplayed();
		System.out.println("Enter Pet Id Box Displayed: "+petIdboxb);
	
		driver.close();
		
	}
	
	void login() {
		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://35.92.179.38:3000/");
		
		System.out.println("Login Page Testing:");
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/a"));
		loginButton.click();
		
		WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[1]"));
		boolean emailboxb =emailBox.isEnabled();
		System.out.println("Email Box Displayed: "+emailboxb);
		emailBox.sendKeys("usertwo@gmail.com");
		
		WebElement passBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[2]"));
		boolean passboxb =passBox.isEnabled();
		System.out.println("Password Box Displayed: "+passboxb);
		passBox.sendKeys("12345678");
		
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button"));
		boolean loginbuttonb =loginbutton.isEnabled();
		System.out.println("Login Button Displayed: "+loginbuttonb);	
		
		driver.close();
		
	}
	
	void register() {
		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://35.92.179.38:3000/");
		
		System.out.println("Register Page Testing:");
		
		WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/a"));
		registerButton.click();
		
		WebElement nameBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[1]"));
		boolean nameboxb =nameBox.isEnabled();
		System.out.println("Name Box Displayed: "+nameboxb);
		nameBox.sendKeys("user Two");
		
		WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[2]"));
		boolean emailboxb =emailBox.isEnabled();
		System.out.println("Email Box Displayed: "+emailboxb);
		emailBox.sendKeys("userthree@gmail.com");
		
		WebElement passBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[3]"));
		boolean passboxb =passBox.isEnabled();
		System.out.println("Password Box Displayed: "+passboxb);
		passBox.sendKeys("12345678");
		
		WebElement phoneBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[4]"));
		boolean phoneboxb =phoneBox.isEnabled();
		System.out.println("Phone No Box Displayed: "+phoneboxb);
		phoneBox.sendKeys("1234567890");
		
		WebElement registerbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button"));
		boolean registerbuttonb =registerbutton.isEnabled();
		System.out.println("Register Button Displayed: "+registerbuttonb);	
		registerbutton.click();
		
		driver.close();
	}
	
	void search() {
		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://35.92.179.38:3000/");
		
		System.out.println("Pet Details Page Testing:");
		
		WebElement petIdBox = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/input"));
		petIdBox.sendKeys("b6YJhHVk");
		
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button"));
		searchButton.click();
		
		WebElement heading = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/h2"));
		boolean headingb = heading.isEnabled();
		System.out.println("Heading is Displayed: "+headingb);
		
		WebElement petid = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/span"));
		boolean petidb = petid.isEnabled();
		System.out.println("PetID is Displayed: "+petidb);
		
		WebElement petName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[2]/span"));
		boolean petNameb = petName.isEnabled();
		System.out.println("Pet Name is Displayed: "+petNameb);
		
		WebElement petCategory = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[3]/span"));
		boolean petCategoryb = petCategory.isEnabled();
		System.out.println("Pet Category is Displayed: "+petCategoryb);
		
		WebElement petIdentifications = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[4]/span"));
		boolean petIdentificationsb = petIdentifications.isEnabled();
		System.out.println("Pet Identifications is Displayed: "+petIdentificationsb);
		
		WebElement petBreed = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/span"));
		boolean petBreedb = petBreed.isEnabled();
		System.out.println("Pet Breed is Displayed: "+petBreedb);
		
		WebElement petGender = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/span"));
		boolean petGenderb = petGender.isEnabled();
		System.out.println("Pet Gender is Displayed: "+petGenderb);
		
		WebElement petColour = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[3]/span"));
		boolean petColourb = petColour.isEnabled();
		System.out.println("Pet Colour is Displayed: "+petColourb);
		
		WebElement petOwner = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[4]/span"));
		boolean petOwnerb = petOwner.isEnabled();
		System.out.println("Pet Owner is Displayed: "+petOwnerb);
		
		WebElement petButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/button"));
		boolean petButtonb = petButton.isEnabled();
		System.out.println("Contact Owner is Displayed and Enabled: "+petButtonb);
		
		driver.close();
		
	}
}

public class Test {

	public static void main(String[] args) {
		Testing obj = new Testing();
		obj.home();
		obj.login();
		obj.register();
		obj.search();	
	}
}
