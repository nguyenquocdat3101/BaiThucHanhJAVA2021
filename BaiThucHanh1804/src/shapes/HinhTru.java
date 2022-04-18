package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    // Constructor
    public HinhTru() {
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapbankinh();

        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhdientich();
        thetich = thetich * chieuCao;
    }
}