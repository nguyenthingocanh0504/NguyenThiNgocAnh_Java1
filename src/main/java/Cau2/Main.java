package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KyThuat k=new KyThuat("SS6976407","Nguyen Thi Ngoc Anh","05/04/2000","Bac Giang","CNTT");
        System.out.println(k);
        System.out.println(k.moTaCongViec());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap ma nhan vien: ");
        String maNV=sc.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        String hoTen=sc.nextLine();
        System.out.println("Nhap nam sinh nhan vien: ");
        String namSinh=sc.nextLine();
        System.out.println("Nhap dia chi nhan vien: ");
        String diaChi=sc.nextLine();
        System.out.println("Nhap nganh nhan vien: ");
        String nganh=sc.nextLine();
        KyThuat k1=new KyThuat(maNV,hoTen,namSinh,diaChi,nganh);
        System.out.println(k1);
        System.out.println(k1.moTaCongViec());
    }
}
