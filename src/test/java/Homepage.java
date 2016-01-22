import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;
    String goods = "iphone 6 64gb";
    By searchButtonLocator = By.xpath(".//*[@id='search-block-submit']");
    By inputField = By.xpath(".//*[@id='SearchForm_searchPhrase']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputData(){
        driver.findElement(inputField).sendKeys(goods);
    }

    public void clickSearchButton(){
        driver.findElement(searchButtonLocator).click();
    }
}
