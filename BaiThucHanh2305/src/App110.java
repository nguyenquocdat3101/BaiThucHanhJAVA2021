import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class App110 {
	public static void main(String[] args) {
		int n, s, sum = 0, sophantu = 0;
		double tbCong;
		DecimalFormat dcf = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> linkedList = new LinkedList<>();

		System.out.println("Nhập vào số phần tử của danh sách: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào phần tử thứ " + (i + 1) + ": ");
			s = scanner.nextInt();
			linkedList.add(s);
		}
		for (int i = 0; i < n; i++) {
			if (linkedList.get(i) % 2 == 0) {
				sum += linkedList.get(i);
				sophantu++;
			}
		}
		tbCong = sum / sophantu;
		System.out.println("Trung bình cộng của các số chẵn trong danh sách = " +
				dcf.format(tbCong));
	}
}
