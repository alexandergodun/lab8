package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Comment extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public Comment(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Comment(String username,String password,String text) throws InterruptedException {

        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='container']/div/div[2]/header/div/div/nav/ul/li[6]/a/span")).click();
        driver.findElement(By.linkText("Операторы связи")).click();
        driver.findElement(By.linkText("Задай вопрос VELCOM")).click();
        driver.findElement(By.xpath("//div[@id='minWidth']/div/div[2]/div[2]/div/div[4]/span/a/span/span")).click();
        driver.findElement(By.id("postmessage")).clear();
        driver.findElement(By.id("postmessage")).sendKeys(text);
        driver.findElement(By.cssSelector("button[name=\"post\"]")).click();


    }
    public boolean isComment(){
        boolean CommentIsTrue=false;
        if ((driver.findElement(By.cssSelector("big.mtauthor-nickname.userid_1936650 > span > a._name.star-notes")).isDisplayed())) CommentIsTrue = true;
        return  CommentIsTrue;
    }
}
