package baithuchanh1605;
import java.util.Set;
import java.util.LinkedHashSet;
/**
 *
 * @author DELL
 */
public class App60 {
    public static void main(String[] args) {
         Set<String> linkedHashSet = new LinkedHashSet<>();
         linkedHashSet.add("Java");
         linkedHashSet.add("C++");
         linkedHashSet.add("Java");
         linkedHashSet.add("PhP");
         for (String sc : linkedHashSet) {
             System.out.println(sc);
        }
    }
   
}
