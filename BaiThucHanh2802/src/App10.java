import java.util.Scanner;
public class App10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n=sc.nextInt();
		int dem=0;
		sc.close();
		while(n>0)
		{
			dem++;
			n=n/10;
		}
		System.out.println("So vua nhap co "+dem+" chu so");
	}
}