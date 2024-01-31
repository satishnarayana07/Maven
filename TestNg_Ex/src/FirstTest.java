import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority =1)
    void start(){
        System.out.println("Browser started");
    }

    @Test(priority=2)
    void login()
    {
        System.out.println("Logged in successful");
        //Assert.assertEquals(12,13);
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("logged out successful");
    }

}