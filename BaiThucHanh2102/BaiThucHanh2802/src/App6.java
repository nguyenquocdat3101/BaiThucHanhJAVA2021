import java.util.Scanner;
public class Main {
  //hàm kiểm tra số hoàn hảo với tham số a
  public static boolean ktraSoHH(int a){
    int sum = 0;
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        //tổng các ước số của a
        sum+=i;
    }
    if(sum==a)return true;
    return false;
  }
  public static void main(String[] args) {
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner scanner = new Scanner(System.in);
    int n;
    // nhập số lượng phần tử cho mảng
    System.out.println("
Nhập các phần tử cho mảng: ");
    n = scanner.nextInt();
    // khai báo mảng với size n
    int array[] = new int[n];
    //sử dụng vòng lặp for để nhập từng phần tử cho mảng
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
    System.out.print("Các số hoàn hảo trong các số vừa nhập là: ");
    // sử dụng vòng lặp for để duyệt từng phần tử và kiểm tra, nếu thỏa mãn thì in ra màn hình
    for (int i = 1; i < n;i++) {
      if(ktraSoHH(array[i])){
        System.out.print(array[i] + "   ");
      }
    }
    System.out.println("

  
  }
}