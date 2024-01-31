import org.testng.annotations.Test;

public class FirstTest {

    @Test
    void start(){
        System.out.println("Browser started");
    }

    @Test
    void login()
    {
        System.out.println("Logged in successful");
    }

    @Test
    void tearDown(){
        System.out.println("logged out successful");
    }

}
