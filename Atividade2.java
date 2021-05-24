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
		System.out.println("O rendimento mensal da conta eh:" +(saldo*0.1) + "R$");
	}
}

class Cliente{
	String nome;
	String sobrenome;
	String cpf;
}


class TestaConta{
	public static void main(String[] args){
		ContaB minhaconta = new ContaB();
		Cliente c1 = new Cliente();
		minhaconta.titular = c1;
		c1.nome = "Lucas";
		c1.sobrenome = "Bulhões";
		c1.cpf = "999.999.666-66";
		System.out.println(minhaconta.titular.nome);
		System.out.println(minhaconta.titular.sobrenome);
		System.out.println(minhaconta.titular.cpf);
		minhaconta.saldo = 13000.0;
		minhaconta.saca(200.3);
		System.out.println(minhaconta.saldo);
		minhaconta.deposita(100203);
		System.out.println(minhaconta.saldo);
		minhaconta.rendimento();
		
		
	
	}
}	
