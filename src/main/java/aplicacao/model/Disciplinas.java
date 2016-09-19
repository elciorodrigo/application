package aplicacao.model;

public class Disciplinas {
	
	private String nome;
	private String notaPrimeiroBimestre;
	private String notaSegundoBimestre;
	private String faltas;
	private String sub;
	
	public Disciplinas(String nome, String nota1, String nota2, String sub, String faltas){
		this.nome = this.verifidaInformacaoNula(nome);
		this.notaPrimeiroBimestre = this.verifidaInformacaoNula(nota1);
		this.notaSegundoBimestre = this.verifidaInformacaoNula(nota2);
		this.faltas = this.verifidaInformacaoNula(faltas);
		this.sub = this.verifidaInformacaoNula(sub);
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
	
	
	private String verifidaInformacaoNula(String input){
		if(input!=null && !input.isEmpty()){
			return input;
		}else return "Sem Lançamento";
	}

}
