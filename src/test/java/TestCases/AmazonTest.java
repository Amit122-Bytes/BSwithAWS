package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.AmazonPageObjects;
import TestData.TestData;

public class AmazonTest extends BaseTest {

    @Test
    public void amazonEndToEndTest() {
        // Open Amazon
        driver.get(TestData.AMAZON_URL);

        // Create object for AmazonPageObjects
        AmazonPageObjects amazon = new AmazonPageObjects(driver);

        // Search for the product
        amazon.searchProduct(TestData.SEARCH_KEYWORD);

        // Select the first product
        amazon.selectFirstProduct();

        // Add the product to the cart
        amazon.addToCart();

        // Go to cart
        amazon.goToCart();

        // Validate cart page is displayed
        String cartPageTitle = driver.getTitle();
        Assert.assertTrue(cartPageTitle.contains("Amazon.com Shopping Cart"), "Cart page not displayed.");
    }
}

