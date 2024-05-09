package celular;

import java.util.Scanner;

import funcoes.MultiFuncoes;

public class Celular {
	public static void main(String[] args) {
		String funcoes;
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha qual funcao deseja realizar:navegar, musica ou telefone");
		funcoes = input.nextLine();
		
		if (funcoes.equals("navegar")) {
			System.out.println("Navegador de internet");
			 MultiFuncoes navegador = new MultiFuncoes();
			 navegador.adicionarNovaAba();
			 navegador.atualizarPagina();
			 navegador.exibirPagina();
		}else if (funcoes.equals("musica")) {
			System.out.println("App de musica");
			 MultiFuncoes musica = new  MultiFuncoes();
			 musica.selecionarMusica();
			 musica.tocarMusica();
			 musica.pausarMusica();
		}else if(funcoes.equals("telefone")) {
			System.out.println("Chamadas telefonicas");
			 MultiFuncoes telefone = new  MultiFuncoes();
			 telefone.atender();
			 telefone.ligar();
			 telefone.iniciarCorreioVoz();
		};
		 	
	}
	
}
