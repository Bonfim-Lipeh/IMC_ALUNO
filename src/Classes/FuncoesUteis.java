package Classes;

public class FuncoesUteis {
	
	public static boolean cpftrue(String cpf) {
	    // Remove caracteres não numéricos
	    cpf = cpf.replaceAll("\\D", "");

	    // Verifica  se tem 11 dígitos
	    if (cpf.length() != 11) {
	        return false;
	    }

	    // Verifica se todos os dígitos são iguais
	    boolean todosIguais = true;
	    char digito = cpf.charAt(0);
	    for (int i = 1; i < cpf.length(); i++) {
	        if (digito != cpf.charAt(i)) {
	            todosIguais = false;
	            break;
	        }
	    }
	    if (todosIguais) {
	        return false;
	    }

	    // Calcula os dígitos verificadores
	    int dv1 = 0, dv2 = 0;
	    int peso = 10;
	    for (int i = 0; i < 9; i++) {
	        dv1 += (cpf.charAt(i) - '0') * peso;
	        peso--;
	    }
	    dv1 = 11 - (dv1 % 11);
	    dv1 = (dv1 == 10 || dv1 == 11) ? 0 : dv1;

	    peso = 11;
	    for (int i = 0; i < 10; i++) {
	        dv2 += (cpf.charAt(i) - '0') * peso;
	        peso--;
	    }
	    dv2 = 11 - (dv2 % 11);
	    dv2 = (dv2 == 10 || dv2 == 11) ? 0 : dv2;

	    // Verifica se os dígitos verificadores calculados são iguais aos dígitos verificadores do CPF
	    if (dv1 == Character.getNumericValue(cpf.charAt(9)) &&
	        dv2 == Character.getNumericValue(cpf.charAt(10))) {
	        return true;
	    } else {
	        return false;
	    }
	    
	    
	}
		public static double calcularIMC(double peso, double altura) {
				if (peso <= 0 || altura <= 0) {
					throw new IllegalArgumentException("Peso e altura devem ser positivos.");
	    }
				return peso / (altura * altura);
	}
		 public static boolean avaliarAluno(double nota, double presenca) {
		        return nota >= 5 && presenca >= 75;
		 }

}
