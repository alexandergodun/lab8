package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class enterBasket extends abstractPage{

    public enterBasket(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void enterBasket() throws InterruptedException {
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("button.button.btn-cart")).click();
        driver.findElement(By.name("super_group[11986]")).clear();
        driver.findElement(By.name("super_group[11986]")).sendKeys("1");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }

    public boolean isEnterBasket(){
        boolean EnterBasketIsTrue=false;
        if ((driver.findElement( By.className("count")).getText().contains("1"))) EnterBasketIsTrue = true;
        return  EnterBasketIsTrue;
    }
}
