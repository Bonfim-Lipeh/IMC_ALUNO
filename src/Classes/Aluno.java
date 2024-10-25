package Classes;

public class Aluno extends Pessoa {
	
	private double nota;
	private double presencapercentual;

	public Aluno(String nome, String cpf, double peso, double altura, double nota, double presencapercentual) {
		
		super(nome, cpf, peso, altura);
		this.nota = nota;
		this.presencapercentual = presencapercentual;
	}
	
	@Override
	public double getpresencapercentual() {
		return presencapercentual;
	}
	
	@Override
	public double getNota() {
		return nota;
	}
	


}