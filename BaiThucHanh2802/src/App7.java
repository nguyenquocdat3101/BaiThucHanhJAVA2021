import java.util.Scanner;
public class App7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		float n,max=0;
		do 
		{
			System.out.println("nhập số thực: ");
			n=sc.nextFloat();
			if(n>max)
			{
				max=n;
			}
		}
		while(n!=0);
		System.out.println("số lớn nhất trong các số vừa nhập là: "+max);
			
		

	}

}