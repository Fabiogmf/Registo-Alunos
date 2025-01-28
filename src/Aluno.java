import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula;


    public static ArrayList <Aluno> alunos = new ArrayList<Aluno>();
    public static Set<String> matriculasUtilizadas = new HashSet<>();

    public Aluno() {
        this.nome = "Desconhecido";
        this.idade = 16;
        this.curso = "Indefinido";
        this.matricula = "000000";
    }

    public Aluno (String nome, int idade, String curso, String matricula) {
        if (idade < 16 || idade > 120 ) {
            throw new IllegalArgumentException("Idade inválida! A idade deve ser entre 16 e 120.");
        }

        if (matricula.length() != 6 || Integer.parseInt(matricula) <= 24000) {
            throw new IllegalArgumentException("Número de matrícula inválido! Deve ter 6 dígitos.");
        }

        if (matriculasUtilizadas.contains(matricula)) {
            throw new IllegalArgumentException("Matrícula já utilizada e cadastrada! Escolha uma matrícula diferente.");
        }

        matriculasUtilizadas.add(matricula);

        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;

    }


    public void exibirInformacoes (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("-------------------------------");
    }
}
