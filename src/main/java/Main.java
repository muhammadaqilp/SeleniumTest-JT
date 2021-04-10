import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver84_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/JohnTravoltaJS");

        johnBisaNabung();
        johnTidakBisaNabung();
        johnCariTambahan();
    }

    private static void johnBisaNabung() {
        //input jam kerja dan total gaji
        driver.findElement(By.id("jam-kerja")).sendKeys("52");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(3)")).click();

        //input pengeluaran dan pesan untuk John
        driver.findElement(By.id("pengeluaran")).sendKeys("500000");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(12)")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void johnTidakBisaNabung() {

        driver.findElement(By.id("jam-kerja")).clear();
        driver.findElement(By.id("pengeluaran")).clear();

        //input jam kerja dan total gaji
        driver.findElement(By.id("jam-kerja")).sendKeys("60");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(3)")).click();

        //input pengeluaran dan pesan untuk John
        driver.findElement(By.id("pengeluaran")).sendKeys("1050000");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(12)")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void johnCariTambahan() {

        driver.findElement(By.id("jam-kerja")).clear();
        driver.findElement(By.id("pengeluaran")).clear();

        //input jam kerja dan total gaji
        driver.findElement(By.id("jam-kerja")).sendKeys("45");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(3)")).click();

        //input pengeluaran dan pesan untuk John
        driver.findElement(By.id("pengeluaran")).sendKeys("800000");
        driver.findElement(By.cssSelector(".button-daftar:nth-child(12)")).click();

        driver.close();
    }
}
