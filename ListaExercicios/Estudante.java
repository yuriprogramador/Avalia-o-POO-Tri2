package ListaExercicios;

import java.util.Scanner;

public class Estudante {
    // Atributos privados [cite: 18]
    private String nome; // [cite: 19]
    private double[] notas; // [cite: 20]

    // Construtor: recebe o nome e dimensiona o array de notas em 5 
    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5]; // 
    }

    // Método para ler do teclado as 5 notas 
    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Digite as 5 notas do estudante " + this.nome + " ---");
        
        for (int i = 0; i < this.notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            this.notas[i] = scanner.nextDouble();
        }
    }

    // Método que calcula e devolve a média aritmética 
    public double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    // Getter para o nome
    public String getNome() {
        return this.nome;
    }

    // Getter para as notas (devolve o array de notas) 
    public double[] getNotas() {
        return this.notas;
    }

    // Método que devolve o valor da menor nota 
    public double menorNota() {
        double menor = this.notas[0];
        for (int i = 1; i < this.notas.length; i++) {
            if (this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }
}