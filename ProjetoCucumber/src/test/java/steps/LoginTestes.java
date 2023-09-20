package steps;

import executa.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginTestes {

	LoginPage login = new LoginPage();

	String msgEsperada = "Epic sadface: Username and password do not match any user in this service";

	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
		Executa.abrirNavegador();
	}

	@When("preencher os dados para login")
	public void preencher_os_dados_para_login() {
		login.login("standard_user", "secret_sauce");
	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {

	}

	@Given("que acesso tela de login")
	public void que_acesso_tela_de_login() {
		Executa.abrirNavegador();
	}

	@When("nao preencher os dados")
	public void nao_preencher_os_dados() {
		login.emBranco("", "");
	}

	@Then("mensagem em tela informando que os campos devem ser preenchidos")
	public void mensagem_em_tela_informando_que_os_campos_devem_ser_preenchidos() {

	}

	@Given("que estou em tela de login")
	public void que_estou_em_tela_de_login() {
		Executa.abrirNavegador();

	}

	@When("preencher os dados de login com dados invalidos")
	public void preencher_os_dados_de_login_com_dados_invalidos() {
		login.dadosInvalidos("ANA CLARA", "123456");
	}

	@Then("mensagem em tela informando que os dados estao incorretos")
	public void mensagem_em_tela_informando_que_os_dados_estao_incorretos() {

	}

	@Given("que acesso a tela de login")
	public void que_acesso_a_tela_de_login() {
		Executa.abrirNavegador();
	}

	@When("preencho os dados de login com dados invalidos")
	public void preencho_os_dados_de_login_com_dados_invalidos() {
		login.login("Maria da Silva", "123456");
       
	}

	@Then("mensagem em tela informando que os dados estao invalidos")
	public void mensagem_em_tela_informando_que_os_dados_estao_invalidos() {

	}

}
