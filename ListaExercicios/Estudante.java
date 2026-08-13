package ListaExercicios;

import java.util.Scanner;

public class Estudante {
    // --- ATRIBUTOS PRIVADOS (Exercício 2) ---
    private String nome;
    private double[] notas;

    // --- CONSTRUTOR (Exercício 2) ---
    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    // --- MÉTODOS DO EXERCÍCIO 2 ---
    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Digite as 5 notas do estudante " + this.nome + " ---");
        
        for (int i = 0; i < this.notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            this.notas[i] = scanner.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    public String getNome() {
        return this.nome;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public double menorNota() {
        double menor = this.notas[0];
        for (int i = 1; i < this.notas.length; i++) {
            if (this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }

    // --- MÉTODO DO EXERCÍCIO 3 ---
    public static Estudante[] filtraAprovados(Estudante[] turma) {
        if (turma == null || turma.length == 0) {
            return null;
        }

        // 1. Conta quantos estudantes foram aprovados (média >= 6.0)
        int quantidadeAprovados = 0;
        for (Estudante e : turma) {
            if (e != null && e.calculaMedia() >= 6.0) {
                quantidadeAprovados++;
            }
        }

        // 2. Se nenhum foi aprovado, devolve null (requisito da questão)
        if (quantidadeAprovados == 0) {
            return null;
        }

        // 3. Cria o novo array com o tamanho exato dos aprovados
        Estudante[] aprovados = new Estudante[quantidadeAprovados];
        int indice = 0;

        // 4. Preenche o novo array apenas com os aprovados
        for (Estudante e : turma) {
            if (e != null && e.calculaMedia() >= 6.0) {
                aprovados[indice] = e;
                indice++;
            }
        }

        return aprovados;
    }
}