package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name="aluno")
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAluno;
	@Column	
	private String nome;
	@Column
	private String disciplina;
	@Column
	@Min(value=0, message="Não pode ser valor negativo!")
	@Max(value=10, message="Não pode ser valor maior que 10!")
	private Double nota1;
	@Column
	@Min(value=0, message="Não pode ser valor negativo!")
	@Max(value=10, message="Não pode ser valor maior que 10!")
	private Double nota2;
	@Column
	private Double media=0.;
	
	public Aluno() {
	}

	public Aluno(Long idAluno, String nome, String disciplina, Double nota1, Double nota2) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", media=" + media + "]";
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
