package manager;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import entity.Aluno;
import persistence.AlunoDao;

@RequestScoped
@ManagedBean(name="mb")
public class ManagerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Aluno aluno;
	private List<Aluno> alunos;
	
	public ManagerBean() {
		this.aluno = new Aluno();
	}
	
	public void media() {
		try {
			this.aluno.setMedia((this.aluno.getNota1()+this.aluno.getNota2())/2);
		}catch(Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
	
	public void gravar() {
		try {
			media();
			new AlunoDao().create(this.aluno);
			this.aluno = new Aluno();			
			
		}catch(Exception ex) {
		}
	}
	

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunos() {
		try {
			this.alunos = new AlunoDao().findAll();
		}catch(Exception ex) {
			ex.printStackTrace();
		}		
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}	
	
}
