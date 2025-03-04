package TestCases;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void validatePageTitle() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Page Title is: " + driver.getTitle());
    }
}
