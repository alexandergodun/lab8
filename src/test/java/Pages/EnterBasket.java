package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EnterBasket extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public EnterBasket(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void EnterBasket(String username,String password) throws InterruptedException {
        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.cssSelector("span.b-main-navigation__text")).click();
        driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/div/div/ul/li[4]/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Холодильники")).click();
        driver.findElement(By.cssSelector("div.schema-product__title > a > span")).click();
        Thread.sleep(6000);
        driver.findElement(By.linkText("В корзину")).click();
    }
    public boolean isEnterBasket(){
        boolean EnterBasketIsTrue=false;
        if ((driver.findElement(By.linkText("1 товар")).isDisplayed()))
            EnterBasketIsTrue = true;

        return  EnterBasketIsTrue;
    }
}
