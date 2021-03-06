package Exercise6;

/*
Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, czy każdy z rozmiarów nie
jest mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true. W
przypadku błędów, powinien o nich poinformować użytkownika.
 */

import java.util.ArrayList;
import java.util.List;



    /*
    Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, czy każdy z rozmiarów nie
    jest mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true. W
    przypadku błędów, powinien o nich poinformować użytkownika.
     */
    class Zadanie6 implements Validator {
        public static void main(String[] args) {
            Parcel parcel1 = new Parcel(35, 45, 60, 20, true);
            Parcel parcel2 = new Parcel(32, 100, 200, 20, true);
            Parcel parcel3 = new Parcel(15, 5, 35, 20, true);
            Parcel parcel4 = new Parcel(35, 45, 60, 34, false);
            Validator validator = new Zadanie6();
            validator.validate(parcel1);
            validator.validate(parcel2);
            validator.validate(parcel3);
            validator.validate(parcel4);
        }
        @Override
        public boolean validate(Parcel input) {
            List<String> validationErrors = new ArrayList<>();
            if (isDimensionsSumCorrect(input)) {
                validationErrors.add("Suma wymiarów (x,y,z) przekracza 300");
            }
            if (areDimensionsCorrect(input)) {
                validationErrors.add("Nie każdy wymiar jest większy od 30");
            }
            if (isWeightCorrect(input)) {
                validationErrors.add("Waga nie jest poprawna");
            }
            if (validationErrors.isEmpty()) {
                return true;
            } else {
                System.out.println(validationErrors);
                return false;
            }
        }
        private boolean isWeightCorrect(Parcel input) {
            return (input.getWeight() > 30 && !input.isExpress()) || (input.getWeight() > 15 && input.isExpress());
        }
        private boolean areDimensionsCorrect(Parcel input) {
            //tutaj trzeba dodać Listę jako parametr i przerobić tę metodę i isDimensionsSumCorrect w ten sam sposób
            return (input.getzLength() < 30) || (input.getyLength() < 30) || (input.getxLength() < 30);
        }
        private boolean isDimensionsSumCorrect(Parcel input) {
            return input.getxLength() + input.getyLength() + input.getzLength() > 300;
        }
    }

