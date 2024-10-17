import Classe.Alunos;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando um objeto da classe Aluno
        Alunos aluno = new Alunos("", "");
        
        // Pergunte o nome e a turma do aluno
        System.out.print("Digite o nome do aluno: ");
        String Nome = scanner.next();
        System.out.print("Digite a turma do aluno: ");
        String Turma = scanner.next();
        // Pergunta o número de avaliações
        System.out.print("Digite o número de avaliações que o aluno realizou: ");
        int numeroAvaliacoes = scanner.nextInt();

        // Chamando o método calcularNotaFinal
        aluno.calcularNotaFinal(numeroAvaliacoes);

        // Exiber os valores dos atributos
        System.out.println("Nome do Aluno: " + Nome);
        System.out.println("Turma do Aluno: " + Turma);
        System.out.println("Nota Final: " + aluno.getNotaFinal());
    }
}
