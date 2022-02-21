package vong_lap_do_while;​
import java.util.Scanner;​
public class TinhTongCacSoNguyen {​
    public static void main(String[] args) {​
        int number, sum = 0;​
        Scanner scanner = new Scanner(System.in);      ​
        do {​
         System.out.println("Nhập vào số nguyên bất kỳ: ");​
         number = scanner.nextInt();​
        sum += number;//sum = sum + number;​
         } while (sum < 100); ​
        System.out.println("Tổng các số nguyên vừa nhập = "+sum);​} 
    }​

​