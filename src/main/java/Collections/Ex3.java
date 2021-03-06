package Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        Ex3 ex3 = new Ex3();
        ex3.printMap(map);
    }
    public void printMap(Map<String, Integer> map){

        StringBuilder sb = new StringBuilder();
        for (String key: map.keySet()){
            sb.append("Klucz ").append(key).append(",wartość ").append(map.get(key));

//            System.out.println("Klucz " + key + ",wartość " + map.get(key));
        }
        sb.replace(sb.length() - 2, sb.length()-1, ".");
    }
}
