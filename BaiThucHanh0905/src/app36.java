import java.util.ArrayList;
import java.util.Scanner;
public class App36 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu cua ArrayList: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu "+i+": ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);

        for (int i = 0; i < arrListInteger.size(); i++) {
            if ( arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrListInteger: "+ max);
    }
}