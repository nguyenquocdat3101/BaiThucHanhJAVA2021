package baithuchanh1605;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App54 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volovo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        
        System.out.println("Cac phan tu co trong mang hashSetString: ");
        System.out.println(hashSetString);
        
        System.out.println("Nhap phan tu can xoa:");
        name = sc.nextLine();
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Caac phan tu con lai trong mang hashSetString:");
        }else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
