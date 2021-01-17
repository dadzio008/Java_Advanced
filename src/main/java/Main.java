public class Main {
    public static void main(String[] args) {


        Tygrys tygrys = new Tygrys();
        tygrys.wyswietl();
        tygrys.setIloscLap(3);
        tygrys.wyswietl();
        tygrys = new Tygrys();
        tygrys.setIloscLap(5);
        Animal zwierze = new Tygrys();
        Animal zwierze1 = new Animal(2);
        if (zwierze1 instanceof Tygrys)

            System.out.println();
        Tygrys tygrys1 = (Tygrys) zwierze;
        tygrys1.wyswietl();



    }
}