package br.com.glandata;

public class MainString {

	public static void main(String[] args) {
		String textoDinamico = "Olá Ailton\n";
		String momentoDia = "Manhã";

		if (momentoDia.equals("Manhã")) {
			textoDinamico = textoDinamico + "Bom dia!\n";
		} else if (momentoDia.equals("Tarde")) {
			textoDinamico = textoDinamico + "Boa tarde!\n";
		} else {
			textoDinamico = textoDinamico + "Boa noite!\n";
		}
		textoDinamico = textoDinamico + "Bem vindo!";
		System.out.println(textoDinamico);
	}

}
