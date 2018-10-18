import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delete all cookies

		driver.get("https://www.youtube.com/watch?v=JDL6ggn6Ldc&t=14s");

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// create the object of Screen class - sikuli
		Screen s = new Screen();

		// settings:
		Pattern settingsImg = new Pattern("Settings.PNG");
		s.wait(settingsImg, 2000);
		s.click();
		// s.click();

		// pixel icon:
		Pattern AutoImg = new Pattern("1080p.PNG");
		s.wait(AutoImg, 2000);
		s.click();
		s.click();

		// pause icon:
		Pattern pauseImg = new Pattern("Pause.PNG");
		s.wait(pauseImg, 2000);
		s.click();
		s.click();

		// play icon:
		Pattern playImg = new Pattern("Play.PNG");
		s.wait(playImg, 2000);
		s.click();
		s.click();

	}

}
