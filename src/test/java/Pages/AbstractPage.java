package Pages;
import org.openqa.selenium.WebDriver;

public abstract class abstractPage
{
    protected WebDriver driver;
    public abstract void openPage(String URL);
    public abstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
