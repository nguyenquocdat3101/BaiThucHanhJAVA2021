import java.util.ArrayList;
import java.util.Scanner;

public class Max {
public static void main(String[] args) {
        ArrayList<Integer> arrListInteger=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; // phần tử của mảng

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();
       // nhập và thêm phần tử cho ArrayList
        for (int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ" + i + ":");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
       // tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
        // giá sử phần từ lớn nhất là phần tử đầu tiên trong ArrayList
        int max = arrListInteger.get(0);

        for (int i = 1; i < arrListInteger.size(); i++){
            // nếu kết quả của phép so sánh này lớn hơne
            // tức biến max nhỏ hơn phần tử tại vị trí thứitrong ArrayList
           // thì gán max=phần từ tại vị tríi
           // và đó chính là phần tử lớn nhất
            if (arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrListInteger = "+ max);
}
}