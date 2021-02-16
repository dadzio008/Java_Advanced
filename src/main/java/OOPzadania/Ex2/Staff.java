package OOPzadania.Ex2;

import static OOPzadania.Ex2.Typ.*;

public class Staff {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Jan", "Aleje Ujazdowskie", PROFESSOR, 8000f);
        Student student1 = new Student("Dawid", "Pl.Kopernika 1", MAGISTER, 2008, 20000f);
        System.out.println(lecturer1);
        System.out.println(student1);
    }
}
