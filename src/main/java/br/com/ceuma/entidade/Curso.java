package br.com.ceuma.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade Curso – mapeamento JPA seguindo o mesmo padrão da entidade Aluno.
 * O Hibernate criará automaticamente a tabela "curso" no PostgreSQL.
 *
 * Campos:
 *   - id       : chave primária gerada automaticamente
 *   - descricao: nome/descrição do curso
 *   - turno    : turno em que o curso é oferecido (ex.: Manhã, Tarde, Noite)
 */
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String turno;

    // -------------------------------------------------------
    // Construtores
    // -------------------------------------------------------

    /** Construtor vazio – obrigatório pelo JPA. */
    public Curso() {
    }

    /** Construtor completo. */
    public Curso(String descricao, String turno) {
        this.descricao = descricao;
        this.turno = turno;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // -------------------------------------------------------
    // toString
    // -------------------------------------------------------

    @Override
    public String toString() {
        return "Curso{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", turno='" + turno + '\'' +
               '}';
    }
}
