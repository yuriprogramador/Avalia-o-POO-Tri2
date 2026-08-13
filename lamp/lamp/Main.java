package avaliacao.lamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Atributo utilizado para leitura de estado inicial da lampada
        boolean beginState;
        //Atributo utilizado para escolher qual construtor utilizar(com watts padrao ou watts definido pelo usuario)
        boolean chooseConstructor;

        //Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        //Definir estado inicial da lampada
        System.out.print("Informe o estado inicial da lampada(true/false)\n--> ");
        beginState = scanner.nextBoolean();

        //Pergunta para definir qual construtor utilizar/se o usuario que informar a quantidade de watts
        System.out.print("Você quer especificar a quantidade de watts?(true/false)\n-->");
        chooseConstructor = scanner.nextBoolean();

        //if-else para escolher construtor a partir da varial chooseConstrutor
        if(chooseConstructor){ //Cria uma Lamp com watts lidos do usuario

            //leitura de dados
            int qtdWatts;
            System.out.println("Informe a quantidade de watts que lampada terá: ");
            qtdWatts = scanner.nextInt();

            //Criando objeto
            Lamp lampada = new Lamp(beginState,qtdWatts);
            lampada.showState(lampada.getState());
            System.out.println(lampada.getWatts() + "W");

            //Troca estado da lampada se o usuario quiser
            System.out.print("Você quer mudar o estado da lampada?(true/false)\n--> ");
            lampada.setState(scanner.nextBoolean());

            //Mostra estado da lampada
            lampada.showState(lampada.getState());
        }
        else { //Cria uma Lamp com watts padrao de 60
            Lamp lampada = new Lamp(beginState);
            lampada.showState(lampada.getState());
            System.out.println(lampada.getWatts() + "W");

            //Troca estado da lampada se o usuario quiser
            System.out.print("Você quer mudar o estado da lampada?(true/false)\n--> ");
            lampada.setState(scanner.nextBoolean());

            //Mostra estado da lampada
            lampada.showState(lampada.getState());
        }


    }
}
