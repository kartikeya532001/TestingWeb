package TestAutomation;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Testing {

	@Test
	void home() {

		System.setProperty("webdriver.chrome.driver", "C:\\fire\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://52.89.7.185:3000/");

		System.out.println("Home Page Testing:");

		WebElement title = driver.findElement(By.xpath("/html/body/div/div/header/div/span"));
		boolean titlei = title.isEnabled();
		System.out.println("Title Displayed: " + titlei);
		AssertJUnit.assertEquals(titlei, true);

		WebElement image = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/img"));
		boolean imagei = image.isEnabled();
		System.out.println("Image Displayed: " + imagei);
		AssertJUnit.assertEquals(imagei, true);

		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/a"));
		boolean loginb = loginButton.isEnabled();
		System.out.println("Login Button Clickable: " + loginb);
		AssertJUnit.assertEquals(loginb, true);

		WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/a"));
		boolean registerb = registerButton.isEnabled();
		System.out.println("Register Button Clickable: " + registerb);
		AssertJUnit.assertEquals(registerb, true);

		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button"));
		boolean searchb = searchButton.isEnabled();
		System.out.println("Search Button Clickable: " + searchb);
		AssertJUnit.assertEquals(searchb, true);

		WebElement petIdBox = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/input"));
		boolean petIdboxb = petIdBox.isEnabled();
		System.out.println("Enter Pet Id Box Displayed: " + petIdboxb);
		AssertJUnit.assertEquals(petIdboxb, true);

		driver.close();

	}

	@Test
	void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\fire\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://52.89.7.185:3000/login");

		System.out.println("Login Page Testing:");

		WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[1]"));
		boolean emailboxb = emailBox.isEnabled();
		System.out.println("Email Box Displayed: " + emailboxb);
		emailBox.sendKeys("usertwo@gmail.com");
		AssertJUnit.assertEquals(emailboxb, true);

		WebElement passBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[2]"));
		boolean passboxb = passBox.isEnabled();
		System.out.println("Password Box Displayed: " + passboxb);
		passBox.sendKeys("12345678");
		AssertJUnit.assertEquals(passboxb, true);

		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button"));
		boolean loginbuttonb = loginbutton.isEnabled();
		System.out.println("Login Button Displayed: " + loginbuttonb);
		AssertJUnit.assertEquals(loginbuttonb, true);

		driver.close();

	}

	@Test
	void register() {

		System.setProperty("webdriver.chrome.driver", "C:\\fire\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://52.89.7.185:3000/signup");

		System.out.println("Register Page Testing:");

		WebElement nameBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[1]"));
		boolean nameboxb = nameBox.isEnabled();
		System.out.println("Name Box Displayed: " + nameboxb);
		nameBox.sendKeys("user Two");
		AssertJUnit.assertEquals(nameboxb, true);

		WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[2]"));
		boolean emailboxb = emailBox.isEnabled();
		System.out.println("Email Box Displayed: " + emailboxb);
		emailBox.sendKeys("userthree@gmail.com");
		AssertJUnit.assertEquals(emailboxb, true);

		WebElement passBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[3]"));
		boolean passboxb = passBox.isEnabled();
		System.out.println("Password Box Displayed: " + passboxb);
		passBox.sendKeys("12345678");
		AssertJUnit.assertEquals(passboxb, true);

		WebElement phoneBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/input[4]"));
		boolean phoneboxb = phoneBox.isEnabled();
		System.out.println("Phone No Box Displayed: " + phoneboxb);
		phoneBox.sendKeys("1234567890");
		AssertJUnit.assertEquals(phoneboxb, true);

		WebElement registerbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button"));
		boolean registerbuttonb = registerbutton.isEnabled();
		System.out.println("Register Button Displayed: " + registerbuttonb);
		registerbutton.click();
		AssertJUnit.assertEquals(registerbuttonb, true);

		driver.close();
	}

	@Test
	void search() {

		System.setProperty("webdriver.chrome.driver", "C:\\fire\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://52.89.7.185:3000/");

		System.out.println("Pet Details Page Testing:");

		WebElement petIdBox = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/input"));
		petIdBox.sendKeys("b6YJhHVk");

		WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/form/button"));
		searchButton.click();

		WebElement heading = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/h2"));
		boolean headingb = heading.isEnabled();
		System.out.println("Heading is Displayed: " + headingb);
		AssertJUnit.assertEquals(headingb, true);

		WebElement petid = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[1]/span"));
		boolean petidb = petid.isEnabled();
		System.out.println("PetID is Displayed: " + petidb);
		AssertJUnit.assertEquals(petidb, true);

		WebElement petName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[2]/span"));
		boolean petNameb = petName.isEnabled();
		System.out.println("Pet Name is Displayed: " + petNameb);
		AssertJUnit.assertEquals(petNameb, true);

		WebElement petCategory = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[3]/span"));
		boolean petCategoryb = petCategory.isEnabled();
		System.out.println("Pet Category is Displayed: " + petCategoryb);
		AssertJUnit.assertEquals(petCategoryb, true);

		WebElement petIdentifications = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/ul/li[4]/span"));
		boolean petIdentificationsb = petIdentifications.isEnabled();
		System.out.println("Pet Identifications is Displayed: " + petIdentificationsb);
		AssertJUnit.assertEquals(petIdentificationsb, true);

		WebElement petBreed = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/span"));
		boolean petBreedb = petBreed.isEnabled();
		System.out.println("Pet Breed is Displayed: " + petBreedb);
		AssertJUnit.assertEquals(petBreedb, true);

		WebElement petGender = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/span"));
		boolean petGenderb = petGender.isEnabled();
		System.out.println("Pet Gender is Displayed: " + petGenderb);
		AssertJUnit.assertEquals(petGenderb, true);

		WebElement petColour = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[3]/span"));
		boolean petColourb = petColour.isEnabled();
		System.out.println("Pet Colour is Displayed: " + petColourb);
		AssertJUnit.assertEquals(petColourb, true);

		WebElement petOwner = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/ul/li[4]/span"));
		boolean petOwnerb = petOwner.isEnabled();
		System.out.println("Pet Owner is Displayed: " + petOwnerb);
		AssertJUnit.assertEquals(petOwnerb, true);

		WebElement petButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/button"));
		boolean petButtonb = petButton.isEnabled();
		System.out.println("Contact Owner is Displayed and Enabled: " + petButtonb);
		AssertJUnit.assertEquals(petButtonb, true);

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
