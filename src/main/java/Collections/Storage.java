//package Collections;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//@Deprecated
//public class Storage {
//    public static void main(String[] args) {
//        Storage storage = new Storage();
//
//        storage.addToStorage("a", "p");
//        storage.addToStorage("b", "o");
//        storage.addToStorage("c", "i");
//
//    }
//    private final Map<String, List<String>> map;
//
//    public Storage() {
//        this.map = new HashMap<>();
//    }
//
//    public void addToStorage(String key, String value)  {
//        if(!map.containsKey(key)) {
//
//            List<String> list = new ArrayList<>();
//            map.put(key, list);
//        }
//
//
//    public void printValues(String key, String value){
//
//        System.out.println(map.get(key));
//
//        }
//
//    }
//}
