package Exceptions.Ex1;

public class CannotDivideBy0Exception extends RuntimeException {
    public CannotDivideBy0Exception(){
        System.err.println("Pamiętaj cholero by nie dzielić przez zero!!!");
    }
}
