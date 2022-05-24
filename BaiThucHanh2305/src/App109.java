import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App109 {
	public static void main(String[] args) {
	    int n;
	    int number;
	    ArrayList<Integer> arrListInteger = new ArrayList<>();
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Nhập vào số phần tử của ArrayList: ");
	    n = sc.nextInt();  
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
	        number = sc.nextInt();
	        arrListInteger.add(number);
	    }
	    int max = arrListInteger.get(0);    
	    for (int i = 1; i < arrListInteger.size(); i++) {
	        if (arrListInteger.get(i).compareTo(max) > 0) {
	            max = arrListInteger.get(i);
	        }
	    }
	    System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);
	    Integer s;
	    System.out.println("Nhập vào số nguyên cần xóa: ");
	    s=sc.nextInt();
	    if(arrListInteger.contains(s)) {
		    arrListInteger.remove(s);
		    System.out.println("Xóa thành công");
		    System.out.println("ArrayList sau khi xóa phần tử");
		    for(Integer t :arrListInteger) {
		    	System.out.println(t);
		    }
	    }
	    else {
	    	System.out.println("Ko tồn tại");
	    }
	    arrListInteger.sort(Comparator.naturalOrder());
	    System.out.println("ArrayList sau khi sắp xếp: "+arrListInteger);
	}
}
