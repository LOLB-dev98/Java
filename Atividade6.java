class ContaB{
	int numero;
	Cliente titular;
	Data dataDeAbertura = new Data();
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
		System.out.println("A data de abertura da conta eh:" + dataDeAbertura.dia + "/" +dataDeAbertura.mes + "/" + dataDeAbertura.ano);
		System.out.println("A agencia da conta eh" + agencia);
		System.out.println("O saldo da conta eh:" +saldo);
		rendimento();
	
	}
}

class Data{

	int dia;
	int mes;
	int ano;

}

class Cliente{
	String nome;
	String sobrenome;
	String cpf;
}


class TestaConta{
	public static void main(String[] args){
		ContaB c1 = new ContaB();
		Cliente cl1 = new Cliente();
		c1.titular = cl1;
		c1.titular.nome = "Hugo";
		c1.saldo = 100;
		c1.dataDeAbertura.dia = 20;
		c1.dataDeAbertura.mes = 11;
		c1.dataDeAbertura.ano = 2021;

		c1.recuperaDadosParaImpressao();
		
	}
}	
