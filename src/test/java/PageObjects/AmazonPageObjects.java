package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPageObjects {
    WebDriver driver;

    public AmazonPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    // Search Bar
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    // Search Results
    private By firstProduct = By.id("nav-search-submit-button");
    
    // Add to Cart
    private By addToCartButton = By.id("a-autoid-1-announce");
    private By cartIcon = By.id("nav-cart-count");

    // Methods for actions
    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void selectFirstProduct() {
        driver.findElement(firstProduct).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
