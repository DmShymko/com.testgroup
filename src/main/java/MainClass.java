import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dmitrij.shymko\\IdeaProjects\\com.testgroup\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create webdriver

       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //ожидание 10 секунд

       // driver.manage().window().maximize(); //configuration window to the maximized size
       // driver.manage().window().setSize(new Dimension(900, 500)); //configuration window size

        driver.get("https://pl.wikipedia.org"); //open the page
        driver.manage().window().maximize(); //configuration window to the maximized size
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //ожидание 10 секунд
        //driver.findElement(By.xpath("//div[@id='cookieBoxClose']/a")).click();
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Belarus");
        //driver.findElement(By.xpath("//*[@id=\"Pass\"]")).sendKeys("Librus12");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Belarus");
        System.out.println(driver.findElement(By.xpath("//input[@id='searchInput']")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@id='searchInput']")).clear();



        //driver.findElement(By.xpath("//*[@id='main-section']/div/div/div/div[2]/div[5]/div/a")).click();
//          WebElement link = driver.findElement(By.linkText("LIBRUS Synergia")); //search link for text and create object
//          WebElement link2 = driver.findElement(By.partialLinkText("Spring"));//search link for part text and create object
//          WebElement description = driver.findElement(By.name("description"));// search element for name and create object
//          WebElement ID = driver.findElement(By.id("")); //search element for ID and create object
//          WebElement input = driver.findElement((By.tagName("input")));
//          WebElement element = driver.findElement(By.cssSelector("div#Simplsearch input#SearchButton"));
//          WebElement logo = driver.findElement(By.xpath("//div[@id='UQ0_62']"));
//

//        driver.navigate().to("https://portal.develop.test.librus.local/szkola/synergia/loguj"); //open the next page
//        driver.navigate().back(); //return to the back page
//        driver.navigate().forward(); //go to the next page
//        driver.navigate().refresh(); // refresh the page
//
//        System.out.println(driver.getTitle()); //show title
//        System.out.println(driver.getCurrentUrl()); //show link

       // driver.quit(); // exit browser
    }

}
