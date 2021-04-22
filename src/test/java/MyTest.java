import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    public WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void quit() {
        driver.quit();
    }


    @Test
    public void test1() {
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");
        System.out.println("Hello Jenkins");

    }
}
