import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import page.MainPage;

/**
 * Created by Artem on 03.08.2017.
 */
public class Main {
    private final static String webDriversPath="src\\main\\resources\\WebDriver\\";
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Strart");
        System.setProperty("webdriver.chrome.driver", webDriversPath+"chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//         chromeOptions.addArguments("--disable-gpu");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://lit-era.com/");
        MainPage page = new MainPage(driver);
        page.state();
        page.login();
        page.state();
//        Thread.sleep(5000);
        driver.quit();
        System.out.println("End");
    }
}
