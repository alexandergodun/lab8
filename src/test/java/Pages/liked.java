package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class liked extends abstractPage{
    public liked(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Liked() {
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("robin4-v@mail.ru");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("1042380qwasqw");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"Леска BERKLEY Nanofil Lo-vis Green; размотка 50м.; 1278175 , арт.: Nanofil-Green-50\"]")).click();
        driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[3]/div[6]/ul/li/a/span[2]")).click();
    }
    public boolean isLiked() {
        boolean CreateThemeIsTrue = false;
        if ((driver.findElement(By.className("col-main grid12-9 grid-col2-main no-gutter")).isDisplayed()))
            CreateThemeIsTrue = true;
        return CreateThemeIsTrue;
    }
}