package BaiThucHanh7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Quản lý danh sách đối tượng Sach bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        System.out.println("=== KIỂM TRA ĐỐI TƯỢNG SÁCH VÀ ENCAPSULATION ===");
        
        // Tạo đối tượng sách (có kiểm tra ràng buộc năm xuất bản và số lượng nhờ Setter)
        Sach sach1 = new Sach("B01", "Lập trình Java nâng cao", "Nguyễn Văn A", 2024, 12);
        sach1.hienThiThongTin();

        // Thêm vào danh sách
        danhSachSach.add(sach1);

        // Nhập thêm sách từ bàn phím
        System.out.print("\nNhập số lượng sách muốn thêm vào danh sách: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cuốn sách thứ " + (i + 1) + ":");
            System.out.print("Nhập mã sách: ");
            String ma = scanner.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập tác giả: ");
            String tg = scanner.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int nam = scanner.nextInt();
            System.out.print("Nhập số lượng: ");
            int sl = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            Sach sachMoi = new Sach(ma, ten, tg, nam, sl);
            System.out.println("\n--> Thông tin sách vừa nhập:");
            sachMoi.hienThiThongTin();
            
            danhSachSach.add(sachMoi);
        }

        // Hiển thị toàn bộ danh sách sách trong kho
        System.out.println("\n=== TOÀN BỘ DANH SÁCH SÁCH TRONG THƯ VIỆN ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println("Cuốn sách thứ " + (i + 1) + ":");
            danhSachSach.get(i).hienThiThongTin();
        }

        scanner.close();
    }
}