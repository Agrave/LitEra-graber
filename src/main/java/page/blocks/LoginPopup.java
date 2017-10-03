package page.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by Artem on 05.08.2017.
 */
@Name("Login popup")
@Block(@FindBy(id = "authModal"))
public class LoginPopup extends HtmlElement {
    @Name("Login via phone or email")
    @FindBy(xpath = "//a[href='/auth/LOGIN?classic=1']")
    private Link loginViaEmail;

    public void loginViaEmail() {
        loginViaEmail.click();
    }
}
