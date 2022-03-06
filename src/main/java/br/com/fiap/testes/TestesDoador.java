package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


import br.com.fiap.entity.Doador;

public class TestesDoador {
	
	// Test CRUD Doador
	// CTRL + 7 = comenta/descomenta bloco de codigo, testa ai povo!
	public static void main(String[] args) {

		EntityManager em = null;
		
		// ====================================--Create--=======================================
//		try {
//
//			em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//			em.getTransaction().begin();
//
//			// Criando objetos doador
//			Doador doador1 = new Doador(0, "Alexandre", "Alexandre@gmail", "(xx)xxxxx-xxxx", "Av melchert", "03508000",
//					"85kg", "1,75", "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+",
//					"O", null);
//			Doador doador2 = new Doador(0, "Priscila", "Priscila@gmail", "(xx)xxxxx-xxxx", "Av melchert", "03208000",
//					"70kg", "1,68", "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+",
//					"AB", null);
//			Doador doador3 = new Doador(0, "Vitor", "Vitor@gmail", "(xx)xxxxx-xxxx", "Av melchert", "03108000", "85kg",
//					"1,75", "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+", "O",
//					null);
//			Doador doador4 = new Doador(0, "Gabriela", "Gabriela@gmail", "(xx)xxxxx-xxxx", "Av melchert", "03808000",
//					"70kg", "1,68", "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+",
//					"A", null);
//			Doador doador5 = new Doador(0, "Guilherme", "Guilherme@gmail", "(xx)xxxxx-xxxx", "Av melchert", "03408000",
//					"85kg", "1,75", "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+",
//					"B", null);
//
//			// Persistindo objetos doador
//			em.persist(doador1);
//			em.persist(doador2);
//			em.persist(doador3);
//			em.persist(doador4);
//			em.persist(doador5);
//
//			em.getTransaction().commit();
//			
//			System.out.println("doador: "+ doador1 +" inserido com sucesso!" );
//			System.out.println("doador: "+ doador2 +" inserido com sucesso!" );
//			System.out.println("doador: "+ doador3 +" inserido com sucesso!" );
//			System.out.println("doador: "+ doador4 +" inserido com sucesso!" );
//			System.out.println("doador: "+ doador5 +" inserido com sucesso!" );
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (em != null && em.getTransaction().isActive()) {
//				em.getTransaction().rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}

		// ====================================--Read--=======================================

		try {

			int idDoador = 5;

			em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
			Doador doador = em.find(Doador.class, idDoador);
			
			
			System.out.println(doador.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

//		// ====================================--Update--=======================================
//
//		try {
//			
//			
//			int idDoador = 2;
//
//			em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//			Doador doador = em.find(Doador.class, idDoador);
//			
//			
//
//			System.out.println(doador.toString()); // antes
//			System.out.println("============================== Alterado para: ===========================================");
//			
//			
//			em.getTransaction().begin();
//			doador.setEstadoCivil("Solteiro");
//			em.getTransaction().commit();
//
//			System.out.println(doador.toString());
//			
//			} catch (Exception e) {
//			e.printStackTrace();
//			if (em != null && em.getTransaction().isActive()) {
//				em.getTransaction().rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
		// ====================================--Delete--=======================================
		
//		try {
//
//			int idDoador = 4;
//
//			em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//			Doador doador = em.find(Doador.class, idDoador);
//
//			em.getTransaction().begin();
//			em.remove(doador);
//			em.getTransaction().commit();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			if (em != null && em.getTransaction().isActive()) {
//				em.getTransaction().rollback();
//			}
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}

	}

}
