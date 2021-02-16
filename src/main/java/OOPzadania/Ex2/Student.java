package OOPzadania.Ex2;

public class Student extends Person{
    Typ typ;
    int rok;
    float koszt;

    public Student(String name, String address, Typ typ, int rok, float koszt) {
        super(name, address);
        this.typ = typ;
        this.rok = rok;
        this.koszt = koszt;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public float getKoszt() {
        return koszt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typ='" + typ + '\'' +
                ", rok=" + rok +
                ", koszt=" + koszt +
                '}';
    }

    public void setKoszt(float koszt) {
        this.koszt = koszt;
    }
}
