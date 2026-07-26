package escola;

import java.util.Scanner;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);

		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos ");
        //RESULTADO NO CONSOLE

        scanner.close();

        System.out.println("E o aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");

	}


}
