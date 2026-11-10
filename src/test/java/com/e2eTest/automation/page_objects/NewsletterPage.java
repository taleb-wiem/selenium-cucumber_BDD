
package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NewsletterPage extends BasePage {

    @FindBy(how = How.CSS, using = "#newsletter-email")
    private WebElement newsletter;

    @FindBy(how = How.CSS, using = "#newsletter-subscribe-button")
    private WebElement subscribeButton;

    @FindBy(how = How.CSS, using = "#newsletter-result-block")
    private WebElement successMessage;

    public NewsletterPage() {
        super(Setup.getDriver());
    }

    public WebElement getnewsletter() {
        return newsletter;
    }

    public WebElement getsubscribeButton() {
        return subscribeButton;
    }

    public WebElement getsuccessMessage() {
        return successMessage;
    }
}
