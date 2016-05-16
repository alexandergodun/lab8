package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class DeleteBasket extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public DeleteBasket(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void DeleteBasket(String username,String password) throws InterruptedException {
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
        driver.findElement(By.linkText("1 товар")).click();
        driver.findElement(By.cssSelector("a.cart-product__remove")).click();

    }
    public boolean isDeleteBasket(){
        boolean DeleteBasketIsTrue=false;
        if ((driver.findElement(By.cssSelector("div.cart-message__description > p")).getText().contains("Ваша корзина пуста. Перейдите в каталог")))
            DeleteBasketIsTrue = true;

        return  DeleteBasketIsTrue;
    }
}
