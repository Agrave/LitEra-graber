package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.blocks.LoginPopup;
import page.blocks.TopBarBlock;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class MainPage {
    private TopBarBlock topBarBlock;
    private LoginPopup loginPopup;
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new HtmlElementDecorator((driver)), this);
    }

    public MainPage login(){
        topBarBlock.login();
        loginPopup.loginViaEmail();
        LoginPage page=new LoginPage(driver);
        page.doLogin();
        return new MainPage(driver);
    }

    public void state(){
        System.out.println(topBarBlock.isLoged());
    }
}
