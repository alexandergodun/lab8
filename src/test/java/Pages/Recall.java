package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Recall extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public Recall(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Recall(String username,String password,String text)
    {
        driver.findElement(By.cssSelector("div.auth-bar__item.auth-bar__item--text")).click();
        driver.findElement(By.cssSelector("input.auth-box__input")).clear();
        driver.findElement(By.cssSelector("input.auth-box__input")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.cssSelector("#widget-61 > a.b-tile-main > h3.b-tile-header > span.txt.max-lines-4")).click();
        driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).click();
        driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).click();
        driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
        driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys(text);
        driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/div/div[2]/div/div/form[2]/div/div[3]/button")).click();

    }



    public boolean isRecall(){
        boolean recInIsTrue=false;
        if(driver.findElement(By.cssSelector("#last_comment > strong.author > a")).getText().contains("automation_test")) recInIsTrue=true;
        return  recInIsTrue;
    }
}