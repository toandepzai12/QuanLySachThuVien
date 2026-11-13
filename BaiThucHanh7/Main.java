package BaiThucHanh7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Yêu cầu 4: Quản lý danh sách sách bằng ArrayList
        ArrayList<String> danhSachSach = new ArrayList<>(); // Hoặc ArrayList<Sach> nếu quản lý đối tượng sách

        // Yêu cầu 3: Xây dựng lớp Test để tạo đối tượng từ lớp Sach
        System.out.println("=== TẠO VÀ HIỂN THỊ ĐỐI TƯỢNG SÁCH ===");
        Sach sach1 = new Sach("B01", "Lập trình Java căn bản", "Nguyễn Văn A", 2023, 15);
        sach1.hienThiThongTin();

        Sach sach2 = new Sach("B02", "Cơ sở dữ liệu", "Trần Văn B", 2022, 8);
        sach2.hienThiThongTin();

        // Thêm thông tin vào ArrayList để quản lý danh sách sách
        danhSachSach.add(sach1.getTieuDe());
        danhSachSach.add(sach2.getTieuDe());

        // Cho phép nhập thêm sách mới từ bàn phím vào danh sách
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
            
            danhSachSach.add(sachMoi.getTieuDe());
        }

        // Hiển thị toàn bộ tiêu đề sách trong ArrayList
        System.out.println("\n=== DANH SÁCH CÁC TIÊU ĐỀ SÁCH TRONG KHO ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSach.get(i));
        }

        scanner.close();
    }
}