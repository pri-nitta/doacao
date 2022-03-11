package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.CentroColeta;
import br.com.fiap.entity.Doacao;
import br.com.fiap.entity.Doador;

public class TestesDoador {
	
	// Test CRUD Doador
	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
		
//		try {

			// Criando objetos doador
			Doador doador1 = new Doador(0, "Alexandre", "Alexandre@gmail","qwer123", "912345678", "Av melchert, 50", "03208000",
					85.00F, 1.75F, "123456789", new GregorianCalendar(1992, Calendar.NOVEMBER, 26), "Casado", "RH+",
					"O", null);
			Doador doador2 = new Doador(0, "Priscila", "Priscila@gmail", "asdf456", "955555555", "Av cpto, 12", "01234566",
					70.00F, 1.60F, "963852741", new GregorianCalendar(1991, Calendar.JANUARY, 01), "Solteira", "RH+",
					"A", null);
			Doador doador3 = new Doador(0, "Vitor", "Vitor@gmail", "zxcv789", "95555777", "Av abcd, 12", "01234577",
					85.00F, 1.80F, "741852963", new GregorianCalendar(1992, Calendar.FEBRUARY, 02), "Casado", "RH-",
					"B", null);
			Doador doador4 = new Doador(0, "Gabriela", "Gabriela@gmail", "poiuy852", "955556666", "Av pçlkj, 12", "01234588",
					55.00F, 1.65F, "852963741", new GregorianCalendar(1993, Calendar.MARCH, 03), "Casada", "RH+",
					"AB", null);
			Doador doador5 = new Doador(0, "Guilherme", "Guilherme@gmail", "ujkl963", "955558888", "Av rfds, 12", "01234599",
					90.00F, 1.85F, "789456123", new GregorianCalendar(1994, Calendar.APRIL, 04), "Solteiro", "RH-",
					"A", null);

			List<Doador> listaCliente = new ArrayList<Doador>();
			
			listaCliente.add(doador1);
			listaCliente.add(doador2);
			listaCliente.add(doador3);
			listaCliente.add(doador4);
			listaCliente.add(doador5);
			
			em.persist(doador1);
			em.persist(doador2);
			em.persist(doador3);
			em.persist(doador4);
			em.persist(doador5);
			
			CentroColeta centroColeta1 = new CentroColeta(0,"Hemocentro Unifesp"," xx.xxx.xxx/xxxx-xx", "Rua Botucatu, 620","04023-062","(11) 5539-7289", null);
			CentroColeta centroColeta2 = new CentroColeta(0,"Banco de Sangue Paulista"," xx.xxx.xxx/xxxx-xx", " Rua Iguatinga, 396","04744-040","(11) 5681-6222", null);
			CentroColeta centroColeta3 = new CentroColeta(0,"Hospital Cruz Azul"," xx.xxx.xxx/xxxx-xx", "Av. Lins de Vasconcelos, 356","01538-900","(11) 3348-4109", null);
			CentroColeta centroColeta4 = new CentroColeta(0,"Hospital São Luiz Gonzaga"," xx.xxx.xxx/xxxx-xx", "Rua Michel Ouchana, 94","02276-140","(11) 3466-1000", null);
			CentroColeta centroColeta5 = new CentroColeta(0,"Hemocentro Unifesp"," xx.xxx.xxx/xxxx-xx", "Av. Nazaré, 28 - subsolo","04263-200","(11) 2061-2229", null);
			
			List<CentroColeta> listaCentro = new ArrayList<CentroColeta>();
			
			listaCentro.add(centroColeta1);
			listaCentro.add(centroColeta1);
			listaCentro.add(centroColeta3);
			listaCentro.add(centroColeta4);
			listaCentro.add(centroColeta5);
			
			em.persist(centroColeta1);
			em.persist(centroColeta2);
			em.persist(centroColeta3);
			em.persist(centroColeta4);
			em.persist(centroColeta5);
			
			
			Doacao doacao1 = new Doacao(0, Calendar.getInstance(), "400", "segunda doacao", doador1, centroColeta1 );
			Doacao doacao2 = new Doacao(0, Calendar.getInstance(), "450", "passou mal", doador2, centroColeta2 );
			Doacao doacao3 = new Doacao(0, Calendar.getInstance(), "420", " ", doador3, centroColeta1 );
			Doacao doacao4 = new Doacao(0, Calendar.getInstance(), "430", "ok ", doador4, centroColeta3 );
			Doacao doacao5 = new Doacao(0, new GregorianCalendar(2022, Calendar.FEBRUARY, 02), "410", "usa remedio cronico ", doador1, centroColeta1 );
			
			em.persist(doacao1);
			em.persist(doacao2);
			em.persist(doacao3);
			em.persist(doacao4);
			em.persist(doacao5);
			
			
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			em.close();
			
		

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

//		try {
//
//			int idDoador = 2;
//
//			em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//			Doador doador = em.find(Doador.class, idDoador);
//			
//			
//			System.out.println(doador.toString());
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}

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
