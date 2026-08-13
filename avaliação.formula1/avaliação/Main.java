public class Main {
    public static void main(String[] args) {


        Equipe redbull = new Equipe("Red Bull", 2005);
        redbull.addPatrocinador(new Patrocinador("Oracle", 500.000));
        redbull.addPatrocinador(new Patrocinador("Tag Heuer", 200.000));

        Equipe mclaren = new Equipe("McLaren", 1963);
        mclaren.addPatrocinador(new Patrocinador("Google Chrome", 300.000));
        mclaren.addPatrocinador(new Patrocinador("Dell", 150.000));


        Piloto p1 = new Piloto("Verstappen", 26, "Holandês", 60);
        Piloto p2 = new Piloto("Lando Norris", 24, "Inglês", 1);


        Engenheiro e1 = new Engenheiro("Adrian Newey", 65, "Britânico", p1);
        Engenheiro e2 = new Engenheiro("Andrea Stella", 53, "Italiano", p2);


        CarroF1[] grid = new CarroF1[2];
        grid[0] = new CarroF1(1, 1, redbull, p1, e1);
        grid[1] = new CarroF1(4, 2, mclaren, p2, e2);

        System.out.println("=== GRID DE LARGADA ===\n");
        for (CarroF1 carroF1 : grid) {
            carroF1.imprimirRelatorio();
        }
    }
}