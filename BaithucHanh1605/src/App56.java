import java.util.HashSet;
import java.util.Scanner;

public class App56 {

    public static void main(String[] args) {
        String name;
        String nameDelete;
        int n;
        HashSet<String> HashStrings = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử trong HashStrings: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào tên thứ " + (i + 1) + ":");
            name = sc.nextLine();
            HashStrings.add(name);
        }

        System.out.println("Các phần tử trong HashStrings: ");
        System.out.println(HashStrings);
        System.out.println("Nhập các phần tử cần xóa: ");
        nameDelete = sc.nextLine();
        if (HashStrings.contains(nameDelete)) {
            HashStrings.remove(nameDelete);
            System.out.println("Xóa thành công");
            System.out.println("Các phần tử trong HashStrings: ");
            System.out.println(HashStrings);

        } else
            System.out.println("Xóa không thành công");
    }
}
