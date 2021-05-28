class Conta{
	
	private int numero;
	Cliente titular = new Cliente();
	private double saldo;
	private double rendimento;

	public int getNumero(){
		return this.numero;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public double getRendimento(){
		return this.rendimento;
	}
	
	public void deposita(double valor){
		if(0 < valor){
			this.saldo += valor;
		}
		else{
			System.out.println("Nao eh possivel depositar valores negativos.");
		}	
	}

}


class Cliente{
	private String nome;
	private String CPF;
	
}


class TestaConta{
	public static void main(String[] args){
		Conta c = new Conta();
		c.deposita(100);
		System.out.println(c.getSaldo());
	}
}
