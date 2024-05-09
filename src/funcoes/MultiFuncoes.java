package funcoes;

import funcoes.musica.Musica;
import funcoes.navegador.Navegador;
import funcoes.telefone.Telefone;

public class MultiFuncoes implements Musica, Navegador,Telefone {
	//musica 
	public void tocarMusica() {
		System.out.println("tocando musica");
	}
	public void pausarMusica() {
		System.out.println("pausando musica");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}
	
	//navegador
	public void adicionarNovaAba() {
		
		System.out.println("Adicionando nova aba");
	}
	public void atualizarPagina() {
		verificarInternet();
		System.out.println("Atualizando pagina web");
	}
	public void exibirPagina() {
		verificarInternet();
		System.out.println("Exibindo pagina web");
	}
	public void verificarInternet() {
		System.out.println("Testando conexao com a internet");
	}
	
	//telefone
	public void ligar() {
		ConexaoChip();
		System.out.println("Ligando");
	}
	public void atender() {
		ConexaoChip();
		System.out.println("Atendendo");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciou-se correio de voz");
	}
	public void ConexaoChip() {
		System.out.println("Testando conexao de rede do chip");
	}
}
