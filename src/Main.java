import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("|----------------------------------------------|");
            System.out.println("|         Bem vindo ao Portal do Aluno         |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|               1 - Cadastrar aluno            |");
            System.out.println("|         2 - Exibir informações de alunos     |");
            System.out.println("|                     3 - Sair                 |");
            System.out.println("|----------------------------------------------|\n");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do Aluno: ");
                String nome = in.nextLine();

                System.out.println("Digite a idade do Aluno: ");
                int idade = in.nextInt();
                in.nextLine();

                System.out.println("Digite o Curso do Aluno: ");
                String curso = in.nextLine();

                System.out.println("Digite a Matrícula do Aluno: ");
                String matricula = in.nextLine();

                try {
                    Aluno novoAluno = new Aluno(nome, idade, curso, matricula);
                    Aluno.alunos.add(novoAluno);
                    System.out.println("Aluno criado com sucesso!\n");
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (opcao == 2) {
                if (Aluno.alunos.isEmpty()) {
                    System.out.println("Nenhum Aluno Cadastrado!\n");
                }

                else {
                    System.out.println("Lista de Alunos:");
                    for (Aluno aluno : Aluno.alunos) {
                        aluno.exibirInformacoes();
                    }
                }
            }

            else if (opcao != 3) {
                System.out.println("Opção inválida! Tente novamente.\n");
            }

        }

        while (opcao != 3); {
            System.out.println("Programa encerrado.");
            in.close();
        }


    }
}