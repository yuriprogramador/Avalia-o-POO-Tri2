package ListaExercicios;

public class Periodico extends ItemAcervo {
    private int volume;

    // Construtor: recebe o título e o número do volume
    public Periodico(String titulo, int volume) {
        super(titulo);
        this.volume = volume;
    }

    // Getter para o volume
    public int getVolume() {
        return this.volume;
    }
}