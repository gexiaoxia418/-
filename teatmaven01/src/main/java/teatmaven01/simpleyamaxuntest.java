package teatmaven01;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleyamaxuntest {
	public static void main(String[] args) throws InterruptedException {
		// 先引入chromedriver
		System.setProperty("webdriver.chrome.driver", "E:/eclipse/chromedriver（1）.exe");
		// 创建的对象
		WebDriver driver = new ChromeDriver();
		// 需要测试的网址
		driver.get("https://www.baidu.com/");
		// 输出网站的title和url
		System.out.println("Home page title:" + driver.getTitle());
		System.out.println("Home page title url" + driver.getCurrentUrl());

		// 控制浏览器窗口大小
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 使用css选择器进行定位
		String assertest = driver.getTitle();
		WebElement element = driver.findElement(By.cssSelector("#kw"));

		// 使用id进行定位
		// WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		// 在搜索框输入key
		element.sendKeys("Java");
		// 对搜索框进行清除
//		element.clear();
		// 在搜索框输入
//		element.sendKeys("Selenium");

		// 进行提交
		element.submit();
		// 反映时间1000s
		Thread.sleep(1000);
		// 清理缓存
		WebElement result = driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a"));
		System.out.println(result.getText());

//		System.out.println(element.getText());
		assertEquals(assertest, "百度一啊下，你就知道");
		driver.quit();
	}

}
