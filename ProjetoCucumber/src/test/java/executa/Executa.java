package executa;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		dryRun = false,//true estou em planejamento  - false estou em execucao
		tags = "@regressivos",
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-report.html"}
)

public class Executa extends Drivers {


	public static void abrirNavegador() {
		String ambiente = "https://www.saucedemo.com";
		String navegador = "Chrome";
		if (navegador.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get(ambiente);
		driver.manage().window().maximize();
	}

	public static void fecharNavegador() {

		driver.quit();

	}

}
