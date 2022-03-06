package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.CentroColeta;

public class TestesCentroColeta {
	
	// Test CRUD centroColeta
	// CTRL + 7 = comenta/descomenta bloco de codigo, testa ai povo!
		public static void main(String[] args) {

			EntityManager em = null;
			
			// ====================================--Create--=======================================
//			try {
//
//				em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//				em.getTransaction().begin();
//
//				// Criando objetos CentroColeta
//		
//				CentroColeta centroColeta1 = new CentroColeta(0,"Hemocentro Unifesp"," xx.xxx.xxx/xxxx-xx", "Rua Botucatu, 620","04023-062","(11) 5539-7289", null);
//				CentroColeta centroColeta2 = new CentroColeta(0,"Banco de Sangue Paulista"," xx.xxx.xxx/xxxx-xx", " Rua Iguatinga, 396","04744-040","(11) 5681-6222", null);
//				CentroColeta centroColeta3 = new CentroColeta(0,"Hospital Cruz Azul"," xx.xxx.xxx/xxxx-xx", "Av. Lins de Vasconcelos, 356","01538-900","(11) 3348-4109", null);
//				CentroColeta centroColeta4 = new CentroColeta(0,"Hospital São Luiz Gonzaga"," xx.xxx.xxx/xxxx-xx", "Rua Michel Ouchana, 94","02276-140","(11) 3466-1000", null);
//				CentroColeta centroColeta5 = new CentroColeta(0,"Hemocentro Unifesp"," xx.xxx.xxx/xxxx-xx", "Av. Nazaré, 28 - subsolo","04263-200","(11) 2061-2229", null);
//
//				// Persistindo objetos centroColeta
//				em.persist(centroColeta1);
//				em.persist(centroColeta1);
//				em.persist(centroColeta3);
//				em.persist(centroColeta4);
//				em.persist(centroColeta5);
//
//				em.getTransaction().commit();
//				
//				System.out.println("Centro Coleta: "+ centroColeta1 +" inserido realizada com sucesso!" );
//				System.out.println("Centro Coleta: "+ centroColeta2 +" inserido realizada com sucesso!" );
//				System.out.println("Centro Coleta: "+ centroColeta3 +" inserido realizada com sucesso!" );
//				System.out.println("Centro Coleta: "+ centroColeta4 +" inserido realizada com sucesso!" );
//				System.out.println("Centro Coleta: "+ centroColeta5 +" inserido realizada com sucesso!" );
//				
//
//			} catch (Exception e) {
//				e.printStackTrace();
//				if (em != null && em.getTransaction().isActive()) {
//					em.getTransaction().rollback();
//				}
//			} finally {
//				if (em != null) {
//					em.close();
//				}
//			}
//
			// ====================================--Read--=======================================
	
			try {
	
				int idCentroCol = 5;
	
				em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
				CentroColeta centroColeta = em.find(CentroColeta.class, idCentroCol);
				
				
				System.out.println(centroColeta.toString());
	
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (em != null) {
					em.close();
				}
			}

		// ====================================--Update--=======================================

//			try {
//				
//				
//				int idCentroCol = 2;
//	
//				em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//				CentroColeta centroColeta = em.find(CentroColeta.class, idCentroCol);
//				
//				
//	
//				System.out.println(centroColeta.toString()); // antes
//				System.out.println("============================== Alterado para: ===========================================");
//				
//				
//				em.getTransaction().begin();
//				centroColeta.setTelefoneCentroCol("(yy)yyyyy-yyyy");
//				em.getTransaction().commit();
//	
//				System.out.println(centroColeta.toString());
//				
//				} catch (Exception e) {
//				e.printStackTrace();
//				if (em != null && em.getTransaction().isActive()) {
//					em.getTransaction().rollback();
//				}
//			} finally {
//				if (em != null) {
//					em.close();
//				}
//			}
			// ====================================--Delete--=======================================
//			
//			try {
//	
//				int idcentroColeta = 4;
//	
//				em = Persistence.createEntityManagerFactory("doacao").createEntityManager();
//				CentroColeta centroColeta = em.find(CentroColeta.class, idcentroColeta);
//	
//				em.getTransaction().begin();
//				em.remove(centroColeta);
//				em.getTransaction().commit();
//	
//			} catch (Exception e) {
//				e.printStackTrace();
//				if (em != null && em.getTransaction().isActive()) {
//					em.getTransaction().rollback();
//				}
//			} finally {
//				if (em != null) {
//					em.close();
//				}
//			}
		}


}
