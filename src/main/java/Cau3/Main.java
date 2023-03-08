package Cau3;

public class Main {
    public static void main(String[] args) {
        VanBan st=new VanBan("   Chúc   mừng ngày 8/3");
        System.out.println(st);
        System.out.println("\nSo tu trong doan van: "+st.demSoTu());
        System.out.println("\nChuan hoa tu: "+st.chuanHoaVanBan());
        System.out.println("\nChuyen thanh viet hoa: "+st.vietHoaToanBo());
        System.out.println("\nChuyen toan bo thanh viet thuong: "+st.vietThuongToanBo());
        System.out.println("\nViet hoa chu cai dau: "+st.vietHoaChuCaiDauTien());
    }
}
