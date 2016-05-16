package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Compare extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public Compare(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Compare(String username,String password,String text) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/div/div/div/div/ul/li[8]/a/span")).click();
        driver.findElement(By.cssSelector("span.i-checkbox.i-checkbox_yellow > span.i-checkbox__faux")).click();
        driver.findElement(By.xpath("//div[@id='schema-products']/div[2]/div/div/div/div/label/span/span")).click();
        driver.findElement(By.linkText("2 товара в сравнении")).click();

    }
    public boolean isCompare(){
        boolean CompareIsTrue=false;
        if ((driver.findElement(By.cssSelector("h1.b-offers-title")).getText().contains("Сравнение товаров"))) CompareIsTrue = true;
        return  CompareIsTrue;
    }
}
