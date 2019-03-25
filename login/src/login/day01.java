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
		  //����ȸ������ 
	    System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	    driver = new ChromeDriver();	    	
	    baseUrl= "http://localhost:8080/examsys/login.thtml";
	    //ȫ�ֵȴ�
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @Test	 //��������������
	  	public void testUntitled() throws Exception {
	    driver.get(baseUrl); //����ַ
	    
	    //�����û���
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    //��������
	    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	    
	    //ѡ������
	    WebElement  s=driver.findElement(By.name("usertype"));
	    Select s1=new Select(s);//����һ��
	    s1.selectByValue("1");
	    Thread.sleep(10000);
	    
	    //�����¼
	    driver.findElement(By.className("tm_btn")).click();	    
}
}
