import java.util.Scanner;

public class AlunoAprovadoOuReprovado {
	
	static final Integer NOTA_MINIMA_PORTUGUES = 70;
	static final Integer NOTA_MINIMA_MATEMATICA = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Para o aluno passar de ano, é preciso passar nas duas matérias e as duas");
		System.out.println("tem que ter no mínimo 70 de nota.");
		
		System.out.println();
		
		System.out.print("Digite o nome do(a) aluno(a): ");
		String nomeAluno = scanner.nextLine();
		
		System.out.print("Digite a nota de português: ");
		Integer notaPortugues = scanner.nextInt();
		
		System.out.print("Digite a note de matemática: ");
		Integer notaMatematica = scanner.nextInt();
		
		Boolean portuguesAprovado = notaPortugues >= NOTA_MINIMA_PORTUGUES;
		Boolean matematicaAprovado = notaMatematica >= NOTA_MINIMA_MATEMATICA;
		
		Boolean aprovado = portuguesAprovado && matematicaAprovado;
		
		if(aprovado) {
			System.out.println();
			System.out.println("Aluno(a) " + nomeAluno + " aprovado");
			System.out.println("Nota de português: " + notaPortugues);
			System.out.println("Nota de matemática: " + notaMatematica);
		} else {
			System.out.println();
			System.out.println("Aluno(a) " + nomeAluno + " reprovado");
			System.out.println("Nota de português: " + notaPortugues);
			System.out.println("Nota de matemática: " + notaMatematica);
		}
		
		scanner.close();
	}

}
