import java.util.Scanner;
public class App8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int max=0,n;
		do
		{
			System.out.println("nhập số nguyên: ");
			n=sc.nextInt();
			if(n%5==0 && n>max)
			{
				max=n;
			}
		}while(n!=0);
		System.out.println("số lón nhất chia hết cho 5 trong các số vừa nhập là: "+max);
		

	}
}