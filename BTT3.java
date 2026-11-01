import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhap thong tin sach
        System.out.println("===== CHUONG TRINH QUAN LY SACH THU VIEN =====");

        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia (VND): ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        // 2. Tinh toan
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // 3. Hien thi thong tin sach
        System.out.println("\n========== THONG TIN SACH ==========");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %,.0f VND%n", donGia);
        System.out.println("So luong: " + soLuong);

        // 4. Hien thi ket qua tinh toan
        System.out.println("\n========== KET QUA NHAP KHO ==========");
        System.out.printf("Thanh tien: %,.0f VND%n", thanhTien);
        System.out.printf("Phi van chuyen (5%%): %,.0f VND%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %,.0f VND%n", tongTienNhap);

        sc.close();
    }
}