
import java.util.ArrayList;
import java.util.Scanner;

// Lop Sach
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;
}

// Chuong trinh chinh
public class Baithuchanhtuan5 {

    static Scanner sc = new Scanner(System.in);

    // Danh sach luu tru nhieu sach
    static ArrayList<Sach> danhSach = new ArrayList<>();

    public static void main(String[] args) {

        int chon;

        // Bai 3: Menu lap den khi chon Thoat
        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tinh tong so luong va tong gia tri sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.println("======================================");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                case 1:
                    nhapSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    tinhTong();
                    break;

                case 4:
                    timSachTheoMa();
                    break;

                case 0:
                    System.out.println("Ban da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }

    // Bai 1: Nhap n sach bang vong lap
    static void nhapSach() {

        System.out.print("Nhap so sach can them: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            Sach s = new Sach();

            System.out.println("\nNhap thong tin sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            s.maSach = sc.nextLine();

            System.out.print("Ten sach: ");
            s.tenSach = sc.nextLine();

            System.out.print("So luong: ");
            s.soLuong = Integer.parseInt(sc.nextLine());

            System.out.print("Don gia: ");
            s.donGia = Double.parseDouble(sc.nextLine());

            danhSach.add(s);
        }

        System.out.println("\nNhap sach thanh cong!");
    }

    // Hien thi danh sach sach
    static void hienThiSach() {

        if (danhSach.isEmpty()) {
            System.out.println("Thu vien chua co sach!");
            return;
        }

        System.out.println("\n========== DANH SACH SACH ==========");

        for (Sach s : danhSach) {

            System.out.println("Ma sach: " + s.maSach);
            System.out.println("Ten sach: " + s.tenSach);
            System.out.println("So luong: " + s.soLuong);
            System.out.println("Don gia: " + s.donGia);
            System.out.println("------------------------------------");
        }
    }

    // Bai 2: Tinh tong so luong va tong gia tri sach
    static void tinhTong() {

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (Sach s : danhSach) {

            tongSoLuong += s.soLuong;

            tongGiaTri += s.soLuong * s.donGia;
        }

        System.out.println("\n========== TONG KET ==========");
        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }

    // Bai 4: Tim sach theo ma
    static void timSachTheoMa() {

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (Sach s : danhSach) {

            if (s.maSach.equalsIgnoreCase(ma)) {

                System.out.println("\n========== KET QUA TIM KIEM ==========");
                System.out.println("Ma sach: " + s.maSach);
                System.out.println("Ten sach: " + s.tenSach);
                System.out.println("So luong: " + s.soLuong);
                System.out.println("Don gia: " + s.donGia);

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach co ma: " + ma);
        }
    }
}
