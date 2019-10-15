import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\lenovo\\IdeaProjects\\selenium\\src\\main\\resources\\chromedriver.exe");
    }

    @BeforeEach
    public void startUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.trendyol.com");
    }

    @AfterEach
    public void cleanUp(){
        driver.close();
    }
}
