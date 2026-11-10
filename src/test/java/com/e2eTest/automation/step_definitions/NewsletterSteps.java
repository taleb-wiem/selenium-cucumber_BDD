
package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.e2eTest.automation.page_objects.NewsletterPage;

public class NewsletterSteps {

    NewsletterPage newsletterPage = new NewsletterPage();

    @When("Je saisis une adresse email valide")
    public void jeSaisisUneAdresseEmailValide() {

        newsletterPage.getnewsletter()
            .sendKeys("wiemtaleb2212@gmail.com");

    }

    @When("Je clique sur le bouton Subscribe")
    public void jeCliqueSurLeBoutonSubscribe() {

        newsletterPage.getsubscribeButton().click();

    }

    @Then("Je vérifie que mon inscription à la newsletter est confirmée")
    public void jeVerifieQueMonInscriptionALaNewsletterEstConfirmee() {

        Assert.assertTrue(
            newsletterPage.getsuccessMessage().isDisplayed()
        );

    }
}
