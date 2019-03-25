package login;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day01 {

	  private WebDriver driver;
	  private String baseUrl;
	  @BeforeClass
	  public void setUp() throws Exception {
		  //定义谷歌浏览器 
	    System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	    driver = new ChromeDriver();	    	
	    baseUrl= "http://localhost:8080/examsys/login.thtml";
	    //全局等待
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @Test	 //操作，测试用例
	  	public void testUntitled() throws Exception {
	    driver.get(baseUrl); //打开网址
	    
	    //输入用户名
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    //输入密码
	    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	    
	    //选择类型
	    WebElement  s=driver.findElement(By.name("usertype"));
	    Select s1=new Select(s);//声明一个
	    s1.selectByValue("1");
	    Thread.sleep(10000);
	    
	    //点击登录
	    driver.findElement(By.className("tm_btn")).click();	    
}
}
