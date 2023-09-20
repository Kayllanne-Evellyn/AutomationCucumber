package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto, String passo) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro ao tentar executar" + passo);
			System.out.println("Causa do erro:" + e.getCause());
			System.out.println("Mensagem do erro:" + e.getMessage());
		}
	}

	public void clicar(By elemento, String passo) {

		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro ao clicar executar" + passo);
			System.out.println("Causa do erro:" + e.getCause());
			System.out.println("Mensagem do erro:" + e.getMessage());
		}
	}

	public void validarTexto(By elemento, String msgEsperada) {

		try {
			assertEquals(msgEsperada, driver.findElement(elemento).getText());
		} catch (Exception e) {
			System.out.println("Erro ao validar texto");
			System.out.println("Causa do erro:" + e.getCause());
			System.out.println("Mensagem do erro:" + e.getMessage());
		}
	}
}
