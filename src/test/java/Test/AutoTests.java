package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "vladbernikovronaldo@gmail.com";
    private final String PASSWORD = "ronaldoreal70000";
    private final String name = "T_iama_T";
    private final String searchworld = "холодильник";
    private final String TEXT = "TEST NG";
    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }

//вход
    @Test(description = "Login to onliner.by")
    public void logInOnliner() {
        steps.logInTUT(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
    }
//выход
    @Test(description = "LogOut to onliner.by")
    public void logOutOnliner(){
        steps.logOutTUT(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedOut());
    }
//поиск
    @Test(description = "Search onliner.by")
    public void Search(){
        steps.Search(searchworld);
        Assert.assertTrue(steps.isSearched());
    }

  //отзыв
    @Test(description = "Recall onliner.by")
    public void Recall(){
        steps.Recall(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.isRecall());
    }

   //отправка сообщения
    @Test(description = "SendMessage onliner.by")
    public void SendMessage(){
        steps.SendMessage(name,USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.isSendMessage());
    }

 //добавить в корзину
    @Test(description = "EnterBasket onliner.by")
    public void EnterBasket() throws InterruptedException {
        steps.EnterBasket(USERNAME,PASSWORD);
        Assert.assertTrue(steps.isEnterBasket());
    }


//создание темы
    @Test(description = "CreateTheme onliner.by")
    public void CreateTheme(){
        steps.CreateTheme(USERNAME,PASSWORD,TEXT,TEXT);
        Assert.assertTrue(steps.isCreateTheme());
    }

 //удалить из корзины
    @Test(description = "DeleteBasket onliner.by")
    public void DeleteBasket() throws InterruptedException {
        steps.DeleteBasket(USERNAME,PASSWORD);
        Assert.assertTrue(steps.isDeleteBasket());
    }

  //оставить коментарий
    @Test(description = "Comment onliner.by")
    public void Comment() throws InterruptedException {
        steps.Comment(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.isComment());
    }
    //сравнение товаров
    @Test(description = "Compare onliner.by")
    public void Compare() throws InterruptedException {
        steps.Compare(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.isCompare());
    }
}

