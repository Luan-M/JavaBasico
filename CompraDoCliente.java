import java.util.Scanner;

public class CompraDoCliente {
	
	static final Double DESCONTO_PIX = 5.0;
	static final Double DESCONTO_DINHEIRO = 5.0;
	
	static final Double JUROS_CREDITO = 7.0;
	
	static final Double DIVISAO = 100.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		Double valorCompra = scanner.nextDouble();
		
		System.out.println("Escolha a forma de pagamento");
		System.out.print("1 - Pix | 2 - Dinheiro | 3 - Cartão: ");
		Integer formaPagamento = scanner.nextInt();
		
		if(formaPagamento.equals(1)) {
			Double pix = (valorCompra * DESCONTO_PIX) / DIVISAO;			
			valorCompra -= pix;
			
			System.out.println();
			System.out.println("Pix tem 5% de desconto.");
			
			System.out.println("Valor: R$ " + valorCompra);
			
		} else if(formaPagamento.equals(2)) {
			Double dinheiro = (valorCompra * DESCONTO_DINHEIRO) / DIVISAO;
			valorCompra -= dinheiro;
			
			System.out.println();
			System.out.println("Dinheiro tem 5% de desconto.");
			
			System.out.println("Valor: R$ " + valorCompra);
			
		} else if(formaPagamento.equals(3)) {
			System.out.println();
			
			System.out.print("1 - Débito | 2 - Crédito: ");
			Integer pagamentoCartao = scanner.nextInt();
			
			if(pagamentoCartao.equals(1)) {
				System.out.println("Cartão de débito, o valor é inteiro");
				System.out.println("Valor: R$ " + valorCompra);
				
			} else if (pagamentoCartao.equals(2)) {
				Double juros = (valorCompra * JUROS_CREDITO) / DIVISAO;
				valorCompra += juros;
				
				System.out.println("Cartão de crédito tem 7% de juros.");
				System.out.println("Valor: R$ " + valorCompra);
				
			} else {
				System.out.println("Você tem que escolher 1 para débito ou 2 para crédito.");
				
			}
			
		} else {
			System.out.println("Você tem que escolher 1 para pix, 2 para dinheiro ou 3 para cartão.");
			
		}
		
		scanner.close();
	}

}
