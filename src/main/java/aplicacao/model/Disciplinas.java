package aplicacao.model;

public class Disciplinas {
	
	private String nome;
	private String notaPrimeiroBimestre;
	private String notaSegundoBimestre;
	private String faltas;
	private String sub;
	
	public Disciplinas(String nome, String nota1, String nota2, String faltas, String sub){
		this.nome = nome;
		this.notaPrimeiroBimestre = nota1;
		this.notaSegundoBimestre = nota2;
		this.faltas = faltas;
		this.sub = sub;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNotaPrimeiroBimestre() {
		return notaPrimeiroBimestre;
	}
	public void setNotaPrimeiroBimestre(String notaPrimeiroBimestre) {
		this.notaPrimeiroBimestre = notaPrimeiroBimestre;
	}
	public String getNotaSegundoBimestre() {
		return notaSegundoBimestre;
	}
	public void setNotaSegundoBimestre(String notaSegundoBimestre) {
		this.notaSegundoBimestre = notaSegundoBimestre;
	}

	public String getFaltas() {
		return faltas;
	}

	public void setFaltas(String faltas) {
		this.faltas = faltas;
	}

	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	

}
