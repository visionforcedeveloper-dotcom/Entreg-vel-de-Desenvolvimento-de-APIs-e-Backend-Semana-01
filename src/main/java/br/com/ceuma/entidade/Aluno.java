package br.com.ceuma.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade Aluno – referência de padrão para o mapeamento JPA.
 * O Hibernate criará automaticamente a tabela "aluno" no PostgreSQL.
 */
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String matricula;

    // -------------------------------------------------------
    // Construtores
    // -------------------------------------------------------

    /** Construtor vazio – obrigatório pelo JPA. */
    public Aluno() {
    }

    /** Construtor completo. */
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // -------------------------------------------------------
    // Getters e Setters
    // -------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // -------------------------------------------------------
    // toString
    // -------------------------------------------------------

    @Override
    public String toString() {
        return "Aluno{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", matricula='" + matricula + '\'' +
               '}';
    }
}
