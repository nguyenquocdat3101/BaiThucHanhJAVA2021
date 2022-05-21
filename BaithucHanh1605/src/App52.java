import java.util.HashSet;
import java.util.Scanner;

public class App52 {

    public static void main(String[] args) {
        int number, n;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Cac phan tu co trong hashSetInteger la :");
        System.out.println(hashSetInteger);
        System.out.println("Nhap so phan tu can them n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            number = sc.nextInt();
            if (!hashSetInteger.contains(number)) {
                hashSetInteger.add(number);
            }else{
                System.out.println("nhap lai number: ");
                number = sc.nextInt();
                hashSetInteger.add(number);
            }
        }
        System.out.println("Them thanh cong!");
        System.out.println("Cac phan tu co trong hashSetInteger sau khi them : ");
        System.out.println(hashSetInteger);
    }
}
