package Task9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        title("https://ithillel.ua/");
    }

    public static void title(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.quit();
    }

}

