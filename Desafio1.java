class Fibonacci{		
	int calculaFibonacci(int termo){
		if(termo == 0){
			return 0;
		}
		if(termo == 1){
			return 1;
		}
		return calculaFibonacci(termo -1) + calculaFibonacci(termo -2);
	}

}


class FibonacciRecursivo{
	public static void main(String[] args){
	
		Fibonacci fibonacci = new Fibonacci();
		for(int i = 0; i <= 30; i++){
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
		
	}
}
