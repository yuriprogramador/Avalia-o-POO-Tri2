package ListaExercicios;

public class Main {
    public static void main(String[] args) {
        // Criando um estudante
        Estudante e1 = new Estudante("João");

        // Solicitando a inserção das 5 notas via teclado
        e1.insereNotas();

        // Exibindo os resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Média: " + e1.calculaMedia());
        System.out.println("Menor Nota: " + e1.menorNota());
    }
}