import java.util.HashMap;
import java.util.Set;

public class App86 {
    public static void main(String[]args){
        HashMap<String, String> hashMap= new HashMap<>();
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");
        
        Set<HashMap.Entry<String , String>> setHashMap =  hashMap.entrySet();
        System.out.println("CaC entry co trong setHashMap");
        System.out.println(setHashMap);
    }
}
