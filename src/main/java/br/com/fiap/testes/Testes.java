package br.com.fiap.testes;

import javax.persistence.Persistence;

public class Testes {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("doacao").createEntityManager();
	}

}
