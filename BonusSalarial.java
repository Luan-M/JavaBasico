import java.util.Scanner;

public class BonusSalarial {
	
	static final Double PORCENTAGEM = 80.0;
	static final Double DIVISAO = 100.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dependendo da meta alcançada o bônus do");
		System.out.println("salário do funcionário vai mudar.");
		
		System.out.println();
		
		System.out.print("Digite a meta da empresa: ");
		Double metaEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o faturamento da empresa: ");
		Double faturamentoEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o salário do funcionário: ");
		Double salarioFuncionario = scanner.nextDouble();
		
		Double oitentaPorcentoMeta = (metaEmpresa * PORCENTAGEM) / DIVISAO;
		Double oitentaPorcentoSalario = (salarioFuncionario * PORCENTAGEM) / DIVISAO;
		
		Boolean cemPorcentoBonus = faturamentoEmpresa >= metaEmpresa;
		Boolean oitentaPorcentoBonus = faturamentoEmpresa >= oitentaPorcentoMeta;
		
		if(cemPorcentoBonus) {
			salarioFuncionario += salarioFuncionario;
			System.out.println();
			System.out.println("O funcionário tem 100% de bônus do salário.");
			System.out.println("Salário: R$ " + salarioFuncionario);
			
		} else if (oitentaPorcentoBonus) {
			salarioFuncionario += oitentaPorcentoSalario;
			System.out.println();
			System.out.println("O funcionário tem 80% de bônus do salário.");
			System.out.println("Salário: R$ " + salarioFuncionario);
			
		} else {
			System.out.println();
			System.out.println("O funcionário não tem bônus no salário.");
			System.out.println("Salário: R$ " + salarioFuncionario);
			
		}
		
		scanner.close();
	}

}
