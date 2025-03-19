package org.example;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nota4 = nota4;
    this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + nome + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Nota 3: " + nota3 + "\n" +
                "Nota 4: " + nota4 + "\n" +
                "Média: " + media + "\n";
    }
}