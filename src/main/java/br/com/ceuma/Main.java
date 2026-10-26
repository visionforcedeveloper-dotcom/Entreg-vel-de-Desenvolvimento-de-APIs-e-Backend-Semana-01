package br.com.ceuma;

import br.com.ceuma.entidade.Aluno;
import br.com.ceuma.entidade.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe principal.
 * Ao ser executada, o Hibernate se conecta ao PostgreSQL e cria
 * automaticamente as tabelas "aluno" e "curso" (hbm2ddl.auto = update).
 */
public class Main {

    public static void main(String[] args) {

        // Cria o EntityManagerFactory usando a persistence-unit definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("semana01PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // --- Persistindo um Aluno de exemplo ---
        Aluno aluno = new Aluno("João Vitor", "2024001");
        em.persist(aluno);

        // --- Persistindo um Curso de exemplo ---
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", "Noite");
        em.persist(curso);

        em.getTransaction().commit();

        System.out.println("Registros inseridos com sucesso!");
        System.out.println(aluno);
        System.out.println(curso);

        em.close();
        emf.close();
    }
}
