import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) throws Exception {
        HashSet<String> Fruit = new HashSet<>();

        Fruit.add("Cam");
        Fruit.add("Quyt");
        Fruit.add("Xoai");
        Fruit.add("Dao");
        Fruit.add("Le");
        Fruit.add("Buoi");
        Fruit.add("Mit");

        int size = Fruit.size();
        System.out.println("Co " + size + " loai trai cay");
        System.out.println("Nhap loai trai cay can tim:");
        Scanner sc = new Scanner(System.in);
        String fruitNeed = sc.next();

        for (String item : Fruit) {
            if (item == fruitNeed) {
                System.out.println("Ton tai ");
            } else
                System.out.println("Khong ton tai");
        }
        Fruit.remove("Buoi");
        for (String item : Fruit) {
            System.out.println(item);
        }
        HashSet<String> NewFruit = new HashSet<>();
        NewFruit.add("Dua hau");
        NewFruit.add("Vai");

        for (String item : NewFruit) {
            Fruit.add(item);
        }
        Iterator<String> iterator = Fruit.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}