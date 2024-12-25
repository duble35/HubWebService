package com.app.main;

public class Main {
	public static void main(String[] args) {
		ClasseListar objListar = new ClasseListar();
		objListar.listarClasse();
		
		ClasseCriar objCriar = new ClasseCriar();
		objCriar.inserirDados();
		
		objListar.listarClasse();
	}
}
