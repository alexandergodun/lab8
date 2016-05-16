package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password)
    {

        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }
    public void logOut(String username, String password){

        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }

    public boolean isLogOut(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).isDisplayed()) logOutIsTrue=true;
        return  logOutIsTrue;
    }

    public boolean isLogIn(){
        boolean logInIsTrue=false;
        if(driver.findElement(By.linkText("automation_test")).isDisplayed()) logInIsTrue=true;
        return  logInIsTrue;
    }
}