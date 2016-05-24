package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class steps {

    private WebDriver driver;

    public void initBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void closeDriver()
    {
        driver.close();
    }

    public void logInMyFish(String username, String password) {
        loginPage loginPage = new loginPage(driver);
        loginPage.openPage("http://www.myfish.by");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn() {
        loginPage loginPage = new loginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logOutMyFish(String username, String password){
        loginPage loginPage = new loginPage(driver);
        loginPage.openPage("http://www.myfish.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut() {
        loginPage loginPage = new loginPage(driver);
        return (loginPage.isLogOut());
    }
    public void search(String searcword){
        search search = new search(driver);
        search.openPage("http://www.myfish.by");
        search.search(searcword);
    }
    public boolean isSearched() {
        search search = new search(driver);
        return (search.isSearch());
    }
    public void enterBasket() throws InterruptedException {
        enterBasket enterbasket = new enterBasket(driver);
        enterbasket.openPage("http://www.myfish.by");
        enterbasket.enterBasket();
    }
    public boolean isEnterBasket() {
        enterBasket enterbasket = new enterBasket(driver);
        return (enterbasket.isEnterBasket());
    }
    public void recall(String username,String password){
        recall recall = new recall(driver);
        recall.openPage("http://www.myfish.by");
        recall.Recall(username,password);
    }
    public boolean isRecall() {
        recall recall = new recall(driver);
        return (recall.isRecall());
    }
    public void changePassword(String username,String password,String newPassword){
        changePassword changePassword1 = new changePassword(driver);
        changePassword1.openPage("http://www.myfish.by");
        changePassword1.changePassword(username,password,newPassword);
    }
    public boolean isChangePassword() {
        changePassword isChangePassword1 = new changePassword(driver);
        return (isChangePassword1.isChangePassword());
    }
    public void subscribe(String username,String password){
        subscribe subscribe1 = new subscribe(driver);
        subscribe1.openPage("http://www.myfish.by");
        subscribe1.subscribe(username,password);
    }
    public boolean isSubscribe() {
        subscribe isSubscribe1 = new subscribe(driver);
        return (isSubscribe1.isSubscribe());
    }
    public void liked(){
        liked liked1 = new liked(driver);
        liked1.openPage("http://www.myfish.by");
        liked1.Liked();
    }
    public boolean isLiked() {
        liked isLiked1 = new liked(driver);
        return (isLiked1.isLiked());
    }
    public void deleteBasket() throws InterruptedException {
        deleteBasket deletebasket = new deleteBasket(driver);
        deletebasket.openPage("http://www.myfish.by");
        deletebasket.deleteBasket();
    }
    public boolean isDeleteBasket() {
        deleteBasket isDeletebasket = new deleteBasket(driver);
        return (isDeletebasket.isDeleteBasket());
    }
    public void compare() throws InterruptedException {
        compare compare = new compare(driver);
        compare.openPage("http://www.myfish.by");
        compare.compare();
    }
    public boolean isCompare() {
        compare compare = new compare(driver);
        return (compare.isCompare());
    }
}


