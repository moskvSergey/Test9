import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;


public class MainClass {

    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moskv\\IdeaProjects\\TestProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.ru/");
        driver.manage().window().setSize(new Dimension(1024, 720));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(
                By.xpath("//*[@class='resplash-btn resplash-btn_primary cej-clke__1ebh38x']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class, 'ag-popup__frame__layout__iframe')]")));

        WebElement loginField = driver.findElement(By.name("username"));
        loginField.clear();
        loginField.sendKeys("moskvin.sergey2016");

        driver.findElement(By.xpath("//button[@data-test-id='next-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//button[@data-test-id='bind-screen-vkid-change-restore-type-btn']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys("");


        driver.findElement(By.xpath("//button[@data-test-id='submit-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//img[@class='ph-avatar-img svelte-1qa2g89']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement newDiv = driver.findElement(By.xpath("//div[@data-testid='custom-scroll-box']"));


        WebElement exitButton = newDiv.findElement(By.xpath(".//div[@data-testid='whiteline-account-exit']"));
        exitButton.click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[@class='resplash-btn resplash-btn_outlined-themed cej-clke__1ebh38x']")).isDisplayed());

        //driver.quit();
    }
}
