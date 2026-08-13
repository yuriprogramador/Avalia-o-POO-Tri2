package avaliacao.lamp;

public class Lamp{

    //Atributo que controla se a lampada esta acesa(true) ou apagada(false)
    private boolean state;
    //Atributo para definir a quantidade de watts da lampada
    private int watts;

    //Construtor de Lamp com watts padrao de 60, e recebe de parametro o seu estado inicial(acesa/true ou apagada/false)
    public Lamp(boolean beginState){

        state = beginState;
        watts = 60;

    }

    //Construtor de Lamp com que recebe de parametro o seu estado inicial(acesa/true ou apagada/false) e watts(potencia)
    public Lamp(boolean beginState, int watts){

        state=beginState;
        this.watts=watts;
    }

    //Metodo get, que retorna estado da lampada(acesa/true ou apagada/false)
    public boolean getState(){
        return state;
    }

    //Metodo set, que altera o estado da lampada
    public void setState(boolean change) {
        if (change) {
            state = !state;
            System.out.print("A lampada agora está ");
        }
        else{
            System.out.print("A lampada continuará ");
        }

    }

    //Metodo utilizado para mostrar estado da lampada
    public void showState(boolean state){

        if(state){
            System.out.println("acesa");
        }
        else if(!state){
            System.out.println("apagada");
        }

    }

    //Metodo get, que retorna a quantidade de watts da lampada
    public int getWatts() {
        return watts;
    }

    //Metodo set, que altera a quantidade de watts da lampada
    public void setWatts(int watts) {
        this.watts = watts;
    }
}
