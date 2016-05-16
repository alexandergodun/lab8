package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;




public class Steps {
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public void closeDriver()
    {
        driver.close();
    }

    public void logInTUT(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("https://www.onliner.by");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logOutTUT(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("https://www.onliner.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }

    public void Search(String searcword){
        Search search = new Search(driver);
        search.openPage("https://www.onliner.by");
        search.Search(searcword);
    }
    public boolean isSearched()
    {
        Search search = new Search(driver);
        return (search.isSearch());
    }

    public void EnterBasket(String username,String password) throws InterruptedException {
        EnterBasket enterbasket = new EnterBasket(driver);
        enterbasket.openPage("https://www.onliner.by");
        enterbasket.EnterBasket(username,password);
    }
    public boolean isEnterBasket()
    {
        EnterBasket enterbasket = new EnterBasket(driver);
        return (enterbasket.isEnterBasket());
    }



    public void Recall(String username,String password,String text){
        Recall recall = new Recall(driver);
        recall.openPage("https://www.onliner.by");
        recall.Recall(username,password,text);
    }
    public boolean isRecall()
    {
        Recall recall = new Recall(driver);
        return (recall.isRecall());
    }

    public void SendMessage(String name,String username,String pass,String text){
        SendMessage sendMessage = new SendMessage(driver);
        sendMessage.openPage("https://www.onliner.by");
        sendMessage.SendMessage(name,username,pass,text);
    }
    public boolean isSendMessage()
    {
        SendMessage sendMessage = new SendMessage(driver);
        return (sendMessage.isSendMessage());
    }


    public void CreateTheme(String name,String username,String text,String header){
        CreateTheme createtheme = new CreateTheme(driver);
        createtheme.openPage("https://www.onliner.by");
        createtheme.CreateTheme(name,username,text,header);
    }
    public boolean isCreateTheme()
    {
        CreateTheme createtheme = new CreateTheme(driver);
        return (createtheme.isCreateTheme());
    }

    public void DeleteBasket(String username,String password) throws InterruptedException {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        deletebasket.openPage("https://www.onliner.by");
        deletebasket.DeleteBasket(username,password);
    }
    public boolean isDeleteBasket()
    {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        return (deletebasket.isDeleteBasket());
    }

    public void Comment(String username,String password,String text) throws InterruptedException {
        Comment comment = new Comment(driver);
        comment.openPage("https://www.onliner.by");
        comment.Comment(username,password,text);
    }
    public boolean isComment()
    {
        Comment comment = new Comment(driver);
        return (comment.isComment());
    }

    public void Compare(String username,String password,String text) throws InterruptedException {
        Compare compare = new Compare(driver);
        compare.openPage("https://www.onliner.by");
        compare.Compare(username,password,text);
    }
    public boolean isCompare()
    {
        Compare compare = new Compare(driver);
        return (compare.isCompare());
    }


    }


