package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search extends AbstractPage{
    private final String BASE_URL = "https://www.onliner.by";


    public Search(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Search(String searcworld)
    {
        driver.findElement(By.name("query")).click();
        driver.findElement(By.name("query")).clear();
        driver.findElement(By.name("query")).sendKeys(searcworld);

    }

    public boolean isSearch(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.linkText("Холодильники")).isDisplayed()) serInIsTrue=true;
        return  serInIsTrue;
    }

    }