package Main;

import Classes.Aluno;
import Classes.FuncoesUteis;
import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
    	
        Aluno aluno = new Aluno("João da Silva", "12345678909", 70.0, 1.75, 8.5, 80);

        // Validando CPF
        if (FuncoesUteis.cpftrue(aluno.getCpf())) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }

        // Calculando IMC
        double imc = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("IMC: " + imc);

        // Avaliando o aluno
        if (FuncoesUteis.avaliarAluno(aluno.getNota(), aluno.getpresencapercentual())) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}