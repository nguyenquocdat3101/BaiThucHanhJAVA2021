package baithuchanh1605;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class App106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');
        
        Set<Map.Entry<Integer, Character>> set = treeMap.entrySet();
        
        System.out.println("Cac entry co trong setTreeMap: ");
        System.out.println(set);
        
    }

}
