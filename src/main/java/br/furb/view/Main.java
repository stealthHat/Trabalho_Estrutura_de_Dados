package br.furb.view;

import java.io.File;
import java.io.IOException;

import br.furb.controller.ValidadorHtmlFacade;

public class Main {

	public static void main(String[] args) {
		ValidadorHtmlFacade valida = new ValidadorHtmlFacade();
		File arquivo = new File("html.txt");
		try {
			valida.facede(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}