package stepDefinitions;

import com.pages.TestPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;
import com.qa.util.ElementUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestSteps {
    private TestPage testPage = new TestPage(DriverFactory.getDriver());

    @Given("user access URL link.")
    public void userAccessURLLink() {
        DriverFactory.getDriver().get(Constants.URL);
    }

    @When("Wait for the page to load and close the ads popup.")
    public void waitForThePageToLoadAndCloseTheAdsPopup() {
        ElementUtil.waitUntilClickable(testPage.getPopupQC);
        testPage.closedPopupQC();

    }

    @Then("user check menu items are displayed")
    public void userCheckMenuItemsAreDisplayed() {
        Assert.assertTrue(testPage.GetMenuText("BITI").contains("VỀ BITI'S"));
        Assert.assertTrue(testPage.GetMenuText("NHÃN HIỆU").contains("NHÃN HIỆU"));
        Assert.assertTrue(testPage.GetMenuText("NAM").contains("NAM"));
        Assert.assertTrue(testPage.GetMenuText("NỮ").contains("NỮ"));
        Assert.assertTrue(testPage.GetMenuText("TEEN NAM").contains("TEEN NAM"));
        Assert.assertTrue(testPage.GetMenuText("TEEN NỮ").contains("TEEN NỮ"));
        Assert.assertTrue(testPage.GetMenuText("BÉ TRAI").contains("BÉ TRAI"));
        Assert.assertTrue(testPage.GetMenuText("BÉ GÁI").contains("BÉ GÁI"));
        Assert.assertTrue(testPage.GetMenuText("PHỤ KIỆN").contains("PHỤ KIỆN"));
    }
}
