import java.util.Scanner;

public class AposentarUsuario {
	
	static final Integer ANO_ATUAL = 2023;
	
	static final Integer IDADE_MINIMA_HOMEM = 67;
	static final Integer TEMPO_MINIMO_HOMEM = 26;
	
	static final Integer IDADE_MINIMA_MULHER = 63;
	static final Integer TEMPO_MINIMO_MULHER = 22;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 - Iniciar o software | 2 - Informações para se aposentar: ");
		Integer menuInicial = scanner.nextInt();
		
		if(menuInicial.equals(1)) {
			System.out.print("Qual o seu nome?: ");
			String nomeUsuario = scanner.next();
			
			System.out.print("Digite o ano que você nasceu: ");
			Integer anoNascimento = scanner.nextInt();
			
			Integer idadeUsuario = ANO_ATUAL - anoNascimento;
			
			System.out.println("Qual o seu sexo?");
			System.out.print("(M)asculino ou (F)eminino: ");
			String sexoUsuario = scanner.next().toUpperCase();
			
			System.out.print("Digite o tempo/anos de carteira de trabalho assinado: ");
			Integer tempoTrabalho = scanner.nextInt();
			
			if(sexoUsuario.equals("M")) {
				
				Boolean idadeAposentarHomem = idadeUsuario >= IDADE_MINIMA_HOMEM;
				Boolean tempoAposentarHomem = tempoTrabalho >= TEMPO_MINIMO_HOMEM;
				Boolean homemPodeAposentar = idadeAposentarHomem && tempoAposentarHomem;
				
				if(homemPodeAposentar) {
					
					System.out.println(nomeUsuario + ", o senhor pode se aposentar.");
					
				} else {
					
					System.out.println(nomeUsuario + ", o senhor não pode se aposentar.");
					
				}
				
			} else if(sexoUsuario.equals("F")) {
				
				Boolean idadeAposentarMulher = idadeUsuario >= IDADE_MINIMA_MULHER;
				Boolean tempoAposentarMulher = tempoTrabalho >= TEMPO_MINIMO_MULHER;
				Boolean mulherPodeAposentar = idadeAposentarMulher && tempoAposentarMulher;
				
				if(mulherPodeAposentar) {
					
					System.out.println(nomeUsuario + ", a senhora pode se aposentar.");
					
				} else {
					
					System.out.println(nomeUsuario + ", a senhora não pode se aposentar.");
					
				}
				
			}  else if(menuInicial.equals(2)) {
				System.out.println("Para se aposentar você precisar ter no mínimo....");
				System.out.println("Homens: ");
				System.out.println("67 anos de idade.");
				System.out.println("26 anos de registro na carteira.");
				
				System.out.println();
				
				System.out.println("Mulheres: ");
				System.out.println("65 anos de idade");
				System.out.println("24 anos de registro na carteira.");
				
				
			} else {
				System.out.println("Você tem que escolher 1 para começar o software ou 2 para saber");
				System.out.println("O que é preciso para se aposentar.");
			}
		
		
		
		
		
		scanner.close();
	}
	
	}

}
