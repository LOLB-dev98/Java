class ContaB{
	int numero;
	Cliente titular;
	String dataAbertura;
	String agencia;
	double saldo;
	
	boolean saca(double quantidade){
		if(saldo < quantidade){
			System.out.println("Saldo insuficiente! Tente novamente mais tarde");
			return false;
		}
		else{
			saldo -= quantidade;
			System.out.println("Você sacou" +quantidade + "R$");
			return true;
		}
		
	}
	
	void deposita(double quantidade){
		saldo +=quantidade;
	}
	
	void rendimento(){
		System.out,println("O rendimento mensal da conta eh:" + saldo*0.1 + "R$");
	}
}

class Cliente{
	String nome;
	String sobrenome
	String cpf
}


