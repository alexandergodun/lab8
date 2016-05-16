package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CreateTheme extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public CreateTheme(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void CreateTheme(String username,String password,String text,String header)
    {
        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
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
        driver.findElement(By.id("submit_text")).click();
        driver.findElement(By.id("subject")).clear();
        driver.findElement(By.id("subject")).sendKeys(header);
        driver.findElement(By.id("message")).click();
        driver.findElement(By.id("message")).clear();
        driver.findElement(By.id("message")).sendKeys(text);
        driver.findElement(By.id("post")).click();
        driver.findElement(By.cssSelector("span.project-navigation__sign")).click();


    }
    public boolean isCreateTheme(){
        boolean CreateThemeIsTrue=false;
        if(driver.findElement(By.linkText("меньше минуты назад")).isDisplayed()) CreateThemeIsTrue=true;
        return  CreateThemeIsTrue;
    }
}