package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class Appjava54 {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatten();
        hinhTron.nhapbankinh();
        hinhTron.tichchuvi();
        hinhTron.tinhdientich();
        hinhTron.inchuvi();
        hinhTron.indientich();

        // Thử nghiệm với lớp Hình trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatten();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inthetich();

        // Thử nghiệm với lớp Hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatten();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inchuvi();
        hinhChuNhat.indientich();

        // Thử nghiệm với lớp Hình vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatten();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inchuvi();
        hinhVuong.indientich();
    }
}