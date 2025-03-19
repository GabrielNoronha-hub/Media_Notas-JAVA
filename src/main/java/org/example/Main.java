package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Quarta nota do aluno: ");
        double nota4 = scanner.nextDouble();

        System.out.println("------------------------");
        Aluno aluno =  new Aluno(nome,nota1,nota2,nota3,nota4);
        System.out.println(aluno);

        double media = aluno.getMedia();
        Aprovacao(media);
    }

    public static void Aprovacao(double media) {
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5 && media <= 6.99) {
            System.out.println("Status: Está em recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}