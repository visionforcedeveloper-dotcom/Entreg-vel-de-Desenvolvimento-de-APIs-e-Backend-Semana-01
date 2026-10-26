package br.com.ceuma;

import br.com.ceuma.entidade.Aluno;
import br.com.ceuma.entidade.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("semana01PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Aluno aluno = new Aluno("João Vitor", "2024001");
        em.persist(aluno);

        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", "Noite");
        em.persist(curso);

        em.getTransaction().commit();

        System.out.println(aluno);
        System.out.println(curso);

        em.close();
        emf.close();
    }
}
