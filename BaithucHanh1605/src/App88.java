package baithuchanh1605;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class App88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity  = new HashMap<>();
        hashMapCity.put("Qng", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh Pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong HashMapCity : ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        
        System.out.println("Qng:" + hashMapCity.get("Qng"));
        
        System.out.println("NT: " + hashMapCity.get("NT"));
    }
}
