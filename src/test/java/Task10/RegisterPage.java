package Task10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        fillForm("Jhon", "Doe", "test@ts.ts", "+380xxxxxxx", "s");

    }


    public static void fillForm(String name, String surname, String mail, String mobileT, String subjectI) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        By firstName = By.xpath("//input[@placeholder =\"First Name\"]");
        By lastName = By.xpath("//input[@placeholder =\"Last Name\"]");
        By email = By.xpath("//input[@placeholder =\"name@example.com\"]");
        By mobile = By.xpath("//input[@placeholder =\"Mobile Number\"]");
        By subject = By.xpath("//input[@id =\"subjectsInput\"]");
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(lastName).sendKeys(surname);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(mobile).sendKeys(mobileT);
        driver.findElement(subject).sendKeys(subjectI);
        driver.quit();
    }


}
