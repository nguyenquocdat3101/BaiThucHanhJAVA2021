package baithuchanh1605;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class App95 {
    public static void show(LinkedHashMap<Integer, String> linkedHashMap){
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer sc : keySet){
            System.out.println(sc + " " + linkedHashMap.get(sc));
        }
    }
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Java" );
        linkedHashMap.put(2, "C++" );
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");
        
        System.out.println("Before remove: ");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("After remove: ");
        show(linkedHashMap);
    }
    
}
