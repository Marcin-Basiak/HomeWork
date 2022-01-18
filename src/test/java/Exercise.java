import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise {
    @Test
    public void openPage(){
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.bluealert.pl/ba/form/formularz-testowy");
        driver.manage().window().maximize();

        driver.findElement(By.id("id_first_name")).sendKeys("Adam");
        driver.findElement(By.id("id_last_name")).sendKeys("Nowak");
        driver.findElement(By.id("id_email")).sendKeys("adam@nowak.test");
        driver.findElement(By.id("id_phone")).sendKeys("123456789");
        driver.findElement(By.id("id_pesel")).sendKeys("00210192812");
        driver.findElement(By.id("id_id_numer")).sendKeys("AMT166301");
        driver.findElement(By.id("id_date")).sendKeys("2000-01-01");
        driver.findElement(By.id("fieldgroup_dane")).click();
        driver.findElement(By.id("form_button_next")).click();
    }
}
