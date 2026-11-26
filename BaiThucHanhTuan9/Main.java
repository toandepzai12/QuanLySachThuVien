package BaiThucHanhTuan9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong sach can quan ly: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap thong tin sach thu " + (i + 1) + " ---");
            System.out.print("Chon loai sach (1: Sach giao khoa, 2: Sach tham khao): ");
            int loai = Integer.parseInt(scanner.nextLine());

            System.out.print("Ma sach: ");
            String maSach = scanner.nextLine();

            System.out.print("Ngay nhap (dd/mm/yyyy): ");
            String ngayNhap = scanner.nextLine();

            System.out.print("Don gia: ");
            double donGia = Double.parseDouble(scanner.nextLine());

            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(scanner.nextLine());

            System.out.print("Nha xuat ban: ");
            String nhaXuatBan = scanner.nextLine();

            if (loai == 1) {
                System.out.print("Tinh trang (moi/cu): ");
                String tinhTrang = scanner.nextLine();
                danhSach.add(new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang));
            } else if (loai == 2) {
                System.out.print("Thue: ");
                double thue = Double.parseDouble(scanner.nextLine());
                danhSach.add(new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thue));
            } else {
                System.out.println("Loai sach khong hop le, bo qua cuon nay.");
            }
        }

        System.out.println("\n=== DANH SACH CAC LOAI SACH ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }

        double tongTienSGK = 0;
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        int demSTK = 0;

        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa) {
                tongTienSGK += ((SachGiaoKhoa) s).tinhThanhTien();
            } else if (s instanceof SachThamKhao) {
                SachThamKhao stk = (SachThamKhao) s;
                tongTienSTK += stk.tinhThanhTien();
                tongDonGiaSTK += stk.getDonGia();
                demSTK++;
            }
        }

        System.out.println("\n=== THONG KE TIEN ===");
        System.out.println("Tong thanh tien Sach giao khoa: " + tongTienSGK);
        System.out.println("Tong thanh tien Sach tham khao: " + tongTienSTK);

        if (demSTK > 0) {
            System.out.println("Trung binh cong don gia Sach tham khao: " + (tongDonGiaSTK / demSTK));
        } else {
            System.out.println("Khong co sach tham khao de tinh trung binh cong don gia.");
        }

        System.out.print("\nNhap ten nha xuat ban X can tim sach giao khoa: ");
        String nxbX = scanner.nextLine();

        System.out.println("=== SACH GIAO KHOA CUA NXB " + nxbX + " ===");
        boolean timThay = false;
        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(nxbX)) {
                s.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa nao cua nha xuat ban nay.");
        }

        scanner.close();
    }
}