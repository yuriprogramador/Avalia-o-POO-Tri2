class Pessoa {
    String nome;
    int idade;
    String nacionalidade;

    Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }
}

class Piloto extends Pessoa {
    int vitorias;

    Piloto(String nome, int idade, String nacionalidade, int vitorias) {
        super(nome, idade, nacionalidade);
        this.vitorias = vitorias;
    }
}

class Engenheiro extends Pessoa {
    Piloto pilotoVinculado;

    Engenheiro(String nome, int idade, String nacionalidade, Piloto p) {
        super(nome, idade, nacionalidade);
        this.pilotoVinculado = p;
    }
}