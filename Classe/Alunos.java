package Classe;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class Alunos {
    private String nome;
    private String turma;
    private double notaFinal;

    // Construtor
    public Alunos(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
        this.notaFinal = 0.0; // Inicializa a notaFinal
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    //Instanciar
    public void leituraAlunos() {
        setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
        setTurma(JOptionPane.showInputDialog("Digite a turma do aluno"));
    }

    // Método para calcular a nota final
    public void calcularNotaFinal(int numeroAvaliacoes) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0.0;

        for (int i = 1; i <= numeroAvaliacoes; i++) {
            System.out.print("Digite a nota da avaliação " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        this.notaFinal = somaNotas / numeroAvaliacoes;
        System.out.println("Nota final calculada.");
    }
}
