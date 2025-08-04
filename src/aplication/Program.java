package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.GeradorSenha;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||| Gerador de Senhas ||||||||||");	
		System.out.println("|||||||||||||||||||||||||||||||||||||||");
		System.out.println();
		System.out.println();
		
		System.out.print("Digite a quantidade de caracters que terá sua senha: ");
		int tamanho = sc.nextInt();
		
		System.out.print("Incluir letras maiúsculas? (s/n): ");
		boolean usarMaiusculas = sc.next().equalsIgnoreCase("s");
		System.out.print("Incluir letras minúsculas? (s/n): ");
		boolean usarMinusculas = sc.next().equalsIgnoreCase("s");
		System.out.print("Deseja Incluir números? (s/n): ");
		boolean usarNumeros = sc.next().equalsIgnoreCase("s");
		System.out.print("Incluir caracteres especiais? (s/n): ");
		boolean usarEspeciais = sc.next().equalsIgnoreCase("s");
		
		String senha =  GeradorSenha.gerarSenha(tamanho, usarMaiusculas, usarMinusculas, usarNumeros, usarEspeciais);
		
		if (senha.isEmpty()) {
            System.out.println("Erro: nenhum tipo de caractere foi selecionado.");
        } else {
        	System.out.println("####################################");
        	System.out.println("#### Não compartilhe sua senha! ####");
            System.out.println("---- Senha gerada: " + senha + " ----");
        	System.out.println("####################################");
        }
		
	
		sc.close();
		
	}

}
