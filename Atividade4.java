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
		ContaB ct1 = new ContaB();
		Cliente cl1 = new Cliente();
		ct1.titular = cl1;
		ct1.titular.nome = "Danilo";
		ct1.saldo = 200;
		
		ContaB ct2 = new ContaB();
		Cliente cl2 = new Cliente();
		ct2.titular = cl2;
		ct2.titular.nome = "Danilo";
		ct2.saldo = 200;
		
		if(ct1 == ct2){
			System.out.println("As contas sao iguais.");
		}
		else{
			System.out.println("As contas sao diferentes.");
		}
		
		
	}
}	
