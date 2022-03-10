package steps;

import io.cucumber.java;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumberTest;

public class AcessoPortalBRQ extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);


    @Dado("^que estou no site do portal da brq$")
    public void que_estou_no_site_do_portal_da_brq() {
        loginPage.acessarAplicacao();
    }
    @Quando("^eu digito meu nome do usuário$")
    public void eu_digito_meu_nome_do_usuario() {
        loginPage.nomeUsuario();
    }
    @E("^digitar a senha$")
    public void digitar_a_senha() {
        loginPage.digitarSenha();
    }
    @Quando("^clico no botão entrar$")
    public void clico_no_botão_entrar() {
        loginPage.clicarEntrar();
    }
    @Então("^Sou redirecionado para a home do portal da BRQ$")
    public void sou_redirecionado_para_a_home_do_portal_da_BRQ() {

    }

}

