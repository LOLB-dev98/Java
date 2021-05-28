class Conta{
	
	private int numero;
	private String titular;
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
	
	Conta(String titular){
		this.titular = titular;
	}
}


class TestaConta{
	public static void main(String[] args){
		Conta c = new Conta("Carlos");
		c.deposita(100);
		System.out.println(c.getSaldo());
	}
}
