package pl.stqa.pft.sandbox;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FillFormTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void signIn(String username, String password) {
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void fillEditPersonForm(PersonData personData) {
        wd.findElement(By.linkText("add new")).click();
        wd.findElement(By.name("firstname")).sendKeys(personData.getFirstName());

        wd.findElement(By.name("lastname")).sendKeys(personData.getLastName());

        wd.findElement(By.name("title")).sendKeys(personData.getTitle());

        wd.findElement(By.name("company")).sendKeys(personData.getCompany());

        wd.findElement(By.name("address")).sendKeys(personData.getAddress());

        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillEditGroupForm(GroupData groupData) {
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("submit")).click();
    }

    @Test
    public void addPerson() {
        wd.get("http://localhost/addressbook/index.php");

        signIn("admin", "secret");
        fillEditPersonForm(new PersonData("Jan", "Kowalski", "Pan", "Com", "Słowika 21\n11-111 Krakow"));
    }

    @Test
    public void addGroup() {
        wd.get("http://localhost/addressbook/group.php");
        signIn("admin", "secret");
        fillEditGroupForm(new GroupData("Jola", "Jolanta", ""));

    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
