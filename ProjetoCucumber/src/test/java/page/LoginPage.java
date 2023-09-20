package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class LoginPage {

	Metodos metodos = new Metodos();

	By usuario = By.id("user-name");
	By senha = By.id("password");
	By enviar = By.id("login-button");
	By msgErro = By.xpath("//*[@data-test='error']");

	public void login(String nome, String senha) {
		metodos.escrever(this.usuario, nome, "Informar senha para login");
		metodos.escrever(this.senha, senha, "Informar a senha para login");
		metodos.clicar(this.enviar, "Enviar os dados");
	}

	public void emBranco(String nome, String senha) {
		metodos.clicar(this.enviar, "Enviar os dados");
	}

	public void dadosInvalidos(String nome, String senha) {
		metodos.escrever(this.usuario, nome, "Informar o usuario para login");
		metodos.escrever(this.senha, senha, "Informar a senha para login");
		metodos.clicar(this.enviar, "Enviar os dados");
	}

	public void validarMensagemErro(String msgEsperada) {
		metodos.validarTexto(msgErro, msgEsperada);

	}
}
