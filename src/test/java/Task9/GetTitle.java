package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitle {
    public static void main(String[] args) {
        title("https://ithillel.ua/");
    }

    public static void title(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriwers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
