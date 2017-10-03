package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.blocks.LoginPopup;
import page.blocks.TopBarBlock;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class TopBar {
    private WebDriver driver;
    private TopBarBlock topBarBlock;
    private LoginPopup loginPopup;

    public TopBar(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(driver), this);
        this.driver = driver;
    }

    public MainPage doLogin(){
        topBarBlock.login();
//        driver.get()
        return new MainPage(driver);
    }
}
