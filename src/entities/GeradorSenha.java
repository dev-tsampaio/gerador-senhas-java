package entities;

import java.util.Random;

public class GeradorSenha {

	public static String gerarSenha(int tamanho, boolean usarMaiusculas, boolean usarMinusculas, boolean usarNumeros,
			boolean usarEspeciais) {
		
		String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "0123456789";
		String especiais = "!@#$%&*()_-+=<>?/";

		StringBuilder caracteresPermitidos = new StringBuilder();
		if (usarMaiusculas)
			caracteresPermitidos.append(maiusculas);
		if (usarMinusculas)
			caracteresPermitidos.append(minusculas);
		if (usarNumeros)
			caracteresPermitidos.append(numeros);
		if (usarEspeciais)
			caracteresPermitidos.append(especiais);

		if (caracteresPermitidos.length() == 0)
			return "";

		StringBuilder senha = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < tamanho; i++) {
			int index = random.nextInt(caracteresPermitidos.length());
			senha.append(caracteresPermitidos.charAt(index));
		}

		return senha.toString();
	}
}
