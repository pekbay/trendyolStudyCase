import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest{

    @Test
    public void loginTestWithWrongFormatEmail() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("fancybox-close")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("navigation-icon-favorites")).click();
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("asdfghgf");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("123456789123456789");
        Thread.sleep(2000);
        driver.findElement(By.id("loginSubmit")).click();
        Thread.sleep(5000);
        String errorT = driver.findElement(By.className("error-box")).getText();

        Assertions.assertEquals(errorT, "Lütfen email adresinizi giriniz.");
    }

    @Test
    public void loginTestSuccess() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("fancybox-close")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("navigation-icon-favorites")).click();
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("testuser_studycase@mail.com");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.id("loginSubmit")).click();
        Thread.sleep(5000);
        String errorT = driver.findElement(By.id("logged-in-container")).getText();

        Assertions.assertEquals(errorT, "Hesabım");
    }
}
