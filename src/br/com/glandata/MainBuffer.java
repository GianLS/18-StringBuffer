package br.com.glandata;

public class MainBuffer {

	public static void main(String[] args) {
		StringBuffer textoDinamico = new StringBuffer();
		textoDinamico.append("Ol� Ailton\n");
		String momentoDia = "Noite";

		if (momentoDia.equals("Manh�")) {
			textoDinamico.append("Bom dia!\n");
		} else if (momentoDia.equals("Tarde")) {
			textoDinamico.append("Boa tarde!\n");
		} else {
			textoDinamico.append("Boa Noite!\n");
		}
		textoDinamico.append("Bem vindo!");
		System.out.println(textoDinamico);
	}

}
