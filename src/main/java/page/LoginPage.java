package page;

import etc.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.blocks.LoginBlock;
import page.blocks.TopBarBlock;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by Artem on 05.08.2017.
 */
public class LoginPage {
    private WebDriver driver;
    private TopBarBlock topBarBlock;
    private LoginBlock loginBlock;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(new HtmlElementDecorator(driver),this);
        this.driver=driver;
    }

    public void doLogin(){
        loginBlock.doLogin(Constants.LOGIN,Constants.PASSWORD);
    }
}
