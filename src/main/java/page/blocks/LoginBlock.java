package page.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


@Name("Login via phone or email")
@Block(@FindBy(id = "w0"))
public class LoginBlock extends HtmlElement {
    @Name("phone or email")
    @FindBy(id = "loginform-LOGIN")
    private TextInput loginInput;

    @Name("Password")
    @FindBy(id = "loginform-PASSWORD")
    private TextInput passwordInput;

    @Name("Login button")
    @FindBy(xpath="//button[type='submit']")
    private Button loginButton;

    public void doLogin(String login,String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
