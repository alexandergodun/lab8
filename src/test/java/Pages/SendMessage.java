package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertEquals;

public class SendMessage extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public SendMessage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void SendMessage(String name,String username,String pass,String text)
    {
        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.linkText("Cообщения")).click();
        driver.findElement(By.linkText("Написать")).click();
        driver.findElement(By.id("compose_uname")).clear();
        driver.findElement(By.id("compose_uname")).sendKeys(name);
        driver.findElement(By.id("compose_subject")).click();
        driver.findElement(By.id("compose_subject")).clear();
        driver.findElement(By.id("compose_subject")).sendKeys(text);
        driver.findElement(By.id("compose_text")).click();
        driver.findElement(By.id("compose_text")).clear();
        driver.findElement(By.id("compose_text")).sendKeys(text);
        driver.findElement(By.name("post")).click();
        driver.findElement(By.linkText("Отправленные")).click();

    }

    public boolean isSendMessage(){
        boolean sendMessageInIsTrue=false;
        if(driver.findElement(By.id("l_sentbox_tm")).getText().contains("1")) sendMessageInIsTrue=true;
        return  sendMessageInIsTrue;
    }


}