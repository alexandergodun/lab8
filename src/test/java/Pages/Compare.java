package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class compare extends abstractPage{

    public compare(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void compare() throws InterruptedException {
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.cssSelector("img[alt=\"Леска BERKLEY Nanofil Lo-vis Green; размотка 50м.; 1278175 , арт.: Nanofil-Green-50\"]")).click();
        driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[3]/div[6]/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.cssSelector("a.level-top > span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[24]")).click();
        driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[3]/div[6]/ul/li[2]/a/span[2]")).click();

        driver.findElement(By.xpath("//div[@id='mini-compare']/div/span/span[3]")).click();
        driver.findElement(By.cssSelector("button.button.btn-inline")).click();
    }
    public boolean isCompare(){
        boolean CompareIsTrue=false;
        if ((driver.findElement(By.className("page-title title-buttons")).getText().contains("Сравнение товаров"))) CompareIsTrue = true;
        return  CompareIsTrue;
    }
}
