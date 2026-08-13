class Patrocinador {
    String nome;
    double valor;

    Patrocinador(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}

class Equipe {
    String nome;
    int fundacao;
    Patrocinador[] patrocinadores = new Patrocinador[5]; // Limite de 5
    int qtdPatrocinadores = 0;

    Equipe(String nome, int fundacao) {
        this.nome = nome;
        this.fundacao = fundacao;
    }

    void addPatrocinador(Patrocinador p) {
        if (qtdPatrocinadores < 5) {
            patrocinadores[qtdPatrocinadores] = p;
            qtdPatrocinadores++;
        }
    }
}