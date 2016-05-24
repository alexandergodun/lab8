package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends abstractPage{

    public loginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password) {
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }
    public void logOut(String username, String password){
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }
    public boolean isLogIn(){
        boolean logInIsTrue=false;
        if(driver.findElement(By.linkText("Выйти")).isDisplayed()) logInIsTrue=true;
        return  logInIsTrue;
    }
    public boolean isLogOut(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.linkText("Войти")).isDisplayed()) logOutIsTrue=true;
        return  logOutIsTrue;
    }
}