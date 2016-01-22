import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Config {
    WebDriver driver = new FirefoxDriver();

    @Before
        public void setUp(){
        driver.get("http://price.ua");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
        public void tearDown(){
        driver.close();
    }



}
