package ListaExercicios;

public class Livro extends ItemAcervo {
    private boolean disponivel;

    // Construtor: Todo livro começa como disponível por padrão
    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro '" + getTitulo() + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + getTitulo() + "' já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro '" + getTitulo() + "' devolvido com sucesso.");
    }

    // Getter do estado
    public boolean isDisponivel() {
        return this.disponivel;
    }
}