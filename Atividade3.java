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
	
	void recuperaDadosParaImpressao(){
		System.out.println("O numero da conta eh:" + numero);
		System.out.println("O nome completo do titular eh:" + titular.nome + " " + titular.sobrenome);
		System.out.println("O cpf do titular eh:" +titular.cpf);
		System.out.println("A data de abertura da conta eh:" + dataAbertura);
		System.out.println("A agencia da conta eh" + agencia);
		System.out.println("O saldo da conta eh:" +saldo);
		rendimento();
	
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
		minhaconta.saldo = 13000.0;
	
		minhaconta.recuperaDadosParaImpressao();
	}
}	
