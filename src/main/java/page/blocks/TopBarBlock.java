package page.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;




@Name("Top bar")
@Block(@FindBy(xpath = "//div[@class='topbar']"))
public class TopBarBlock extends HtmlElement {
    @Name("Login button")
    @FindBy(xpath = "//div/div[1]/a")
    private HtmlElement loginButton;

    public void login() {
        loginButton.click();
    }

    public boolean isLoged() {
        By loginLinkXpath= new By.ByXPath("//div/div[1]/*[1]"); //element that contains user name(<div class="authed">) or login link (<a onclick="showLoginPopup();">
        if (loginButton.findElement(loginLinkXpath).getTagName().equals("a")) {
            return false;
        } else {
            return true;
        }
    }
}
