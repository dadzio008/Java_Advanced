package Exceptions.Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(665, 77));
    }
    public static float divide(float a, float b){
        if(b==0){
            throw new CannotDivideBy0Exception();
        } else{
        return a/b;
    }
}
}
