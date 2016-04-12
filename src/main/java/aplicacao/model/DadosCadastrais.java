package aplicacao.model;

import java.util.ArrayList;
import java.util.List;

public class DadosCadastrais {
	
	private String nome;
	private String rA;
	private String turma;
	private String situacao;
	private List<Disciplinas> disciplinas;
	
	public List<Disciplinas> getDisciplinas() {

		if (disciplinas == null) {
			disciplinas = new ArrayList<Disciplinas>();
		}
		
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getrA() {
		return rA;
	}
	public void setrA(String rA) {
		this.rA = rA;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	

}
