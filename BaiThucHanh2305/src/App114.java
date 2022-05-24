import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import SinhVien.SinhVien;

public class App114 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SinhVien sv = new SinhVien();
        HashMap<Integer, SinhVien> SVMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + i + ": ");
            sv.masv = sc.next();
            sv.ten = sc.next();
            sv.lop = sc.next();
            SVMap.put(i, sv);
        }
        String lop;
        System.out.println("Nhap ten lop can tim: ");
        lop = sc.next();
        System.out.println("Cac sinh vien thuoc " + lop + " la: ");
        for (Map.Entry<Integer, SinhVien> item : SVMap.entrySet()) {
            if (item.getValue().getLop() == lop) {
                System.out.println(item.getValue());
            }
        }
        String masv;
        System.out.println("Nhap ma sinh vien can tim: ");
        masv = sc.next();
        System.out.println("Thong tin sinh vien co ma sinh vien " + masv + " la:");
        for (Map.Entry<Integer, SinhVien> item : SVMap.entrySet()) {
            if (item.getValue().getMasv() == masv) {
                System.out.println(item.getValue());
            }
        }

    }
}