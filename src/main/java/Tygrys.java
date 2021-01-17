import org.w3c.dom.ls.LSOutput;

public class Tygrys extends Animal {

    public Tygrys() {
        super(4);
    }

    public void wyswietl() {
        System.out.println("Jestem Tygrys i mam "+getIloscLap()+" łapy");
    }

}