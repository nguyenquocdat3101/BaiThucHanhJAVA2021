package shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc {

    public float bankinh;

    public  HinhTron(){
        ten = "Hinh Tron";
    }
    public void nhapbankinh(){
        System.out.println("Ban Kinh = ");
        Scanner scanner= new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tichchuvi(){
        chuvi=2 *PI*bankinh;
    }
    public void tinhdientich(){
        dientich=PI*bankinh*bankinh;
    }
}
