package Classes;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private double peso;
	private double altura;
	
public Pessoa(String nome, String cpf, double peso, double altura) {
	
	this.nome = nome;
	this.cpf = cpf;
	this.peso = peso;
	this.altura = altura;
	
}
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    
}
    public String getCpf() {
    	return cpf;
    }
    
    public double getPeso(){
    	return peso;
    }
    
    public double getAltura() {
    	return altura;
    }
    
    public abstract double getNota();
    
    public abstract double getpresencapercentual();

}
