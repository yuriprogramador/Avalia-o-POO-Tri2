class CarroF1 {
    int numero;
    int posicao;
    Equipe equipe;
    Piloto piloto;
    Engenheiro engenheiro;


    CarroF1(int numero, int posicao, Equipe e, Piloto p, Engenheiro eng) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = e;
        this.piloto = p;
        this.engenheiro = eng;
    }

    void imprimirRelatorio() {
        System.out.println("Pos: " + posicao + " | Carro #" + numero);
        System.out.println("Piloto: " + piloto.nome + " (" + piloto.nacionalidade + ") - Vitórias: " + piloto.vitorias);
        System.out.println("Engenheiro Responsável: " + engenheiro.nome); // Exibe o engenheiro
        System.out.println("Equipe: " + equipe.nome + " (Fundada em " + equipe.fundacao + ")");
        System.out.print("Patrocinadores: ");
        for (int i = 0; i < equipe.qtdPatrocinadores; i++) {
            System.out.print("[" + equipe.patrocinadores[i].nome + " | R$ " + equipe.patrocinadores[i].valor + "] ");
        }
        System.out.println("\n---------------------------------");
    }
}