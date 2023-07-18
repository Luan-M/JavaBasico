import java.util.Scanner;

public class TrocoDoCliente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor do pagamento: ");
		Double valorPagamento = scanner.nextDouble();
		
		Boolean maiorQuePagamento = valorProduto > valorPagamento;
		
		if(maiorQuePagamento) {
			Double valor = valorProduto - valorPagamento;
			System.out.println("Falta: R$ " + valor);
		} else {
			Double valor = valorPagamento - valorProduto;
			System.out.println("Troco: R$ " + valor);
		}
		
		
		scanner.close();
	}
	
}
