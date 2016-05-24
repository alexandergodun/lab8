package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class search extends abstractPage{

    public search(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void search(String searchworld) {
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys(searchworld);
        driver.findElement(By.cssSelector("button.button")).click();
    }
    public boolean isSearch(){
        boolean serInIsTrue=false;
        if(driver.findElement(new By.ByClassName("page-title")).isDisplayed()) serInIsTrue=true;
        return  serInIsTrue;
    }
}