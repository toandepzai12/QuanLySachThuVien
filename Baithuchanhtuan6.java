
import java.util.ArrayList;
import java.util.Scanner;

public class Baithuchanhtuan6 {

    static Scanner sc = new Scanner(System.in);

    // Bai 2: Danh sach ma sach
    static ArrayList<String> maSachList = new ArrayList<>();

    // Bai 3: Danh sach thong tin sach
    static ArrayList<String> danhSachSach = new ArrayList<>();

    // Bai 1: Mang so luong 5 cuon sach
    static int[] soLuong = new int[5];

    public static void main(String[] args) {

        // Thuc hien bai 1
        bai1();

        int chon;

        // Bai 4: Menu hoat dong lien tuc
        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.println("======================================");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    timSach();
                    break;

                case 4:
                    xoaSach();
                    break;

                case 5:
                    suaSach();
                    break;

                case 6:
                    tinhTongSoLuong();
                    break;

                case 7:
                    tinhTongGiaTri();
                    break;

                case 8:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }

    // =====================================
    // BAI 1: SU DUNG MANG INT[5]
    // =====================================

    static void bai1() {

        System.out.println("========== BAI 1 ==========");

        // Nhap so luong 5 cuon sach
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        // Hien thi so luong
        System.out.println("\nDanh sach so luong sach:");

        int tong = 0;
        int max = soLuong[0];

        for (int i = 0; i < 5; i++) {

            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);

            tong += soLuong[i];

            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // =====================================
    // BAI 2 VA BAI 3: THEM SACH
    // =====================================

    static void themSach() {

        System.out.println("\n========== THEM SACH ==========");

        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        if (maSachList.contains(ma)) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int sl = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        double gia = Double.parseDouble(sc.nextLine());

        // Luu ma sach vao ArrayList<String>
        maSachList.add(ma);

        // Luu thong tin sach vao ArrayList<String>
        String thongTin = ma + "|" + ten + "|" + sl + "|" + gia;

        danhSachSach.add(thongTin);

        System.out.println("Them sach thanh cong!");
    }

    // =====================================
    // BAI 2 VA BAI 3: HIEN THI SACH
    // =====================================

    static void hienThiSach() {

        if (danhSachSach.isEmpty()) {
            System.out.println("Thu vien chua co sach!");
            return;
        }

        System.out.println("\n========== DANH SACH SACH ==========");

        for (String sach : danhSachSach) {

            String[] data = sach.split("\\|");

            System.out.println("Ma sach: " + data[0]);
            System.out.println("Ten sach: " + data[1]);
            System.out.println("So luong: " + data[2]);
            System.out.println("Don gia: " + data[3]);
            System.out.println("------------------------------------");
        }
    }

    // =====================================
    // BAI 2 VA BAI 3: TIM SACH
    // =====================================

    static void timSach() {

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (String sach : danhSachSach) {

            String[] data = sach.split("\\|");

            if (data[0].equalsIgnoreCase(ma)) {

                System.out.println("\nDa tim thay sach!");
                System.out.println("Ma sach: " + data[0]);
                System.out.println("Ten sach: " + data[1]);
                System.out.println("So luong: " + data[2]);
                System.out.println("Don gia: " + data[3]);

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }

    // =====================================
    // BAI 2 VA BAI 3: XOA SACH
    // =====================================

    static void xoaSach() {

        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] data = danhSachSach.get(i).split("\\|");

            if (data[0].equalsIgnoreCase(ma)) {

                danhSachSach.remove(i);
                maSachList.remove(i);

                System.out.println("Xoa sach thanh cong!");

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach can xoa!");
        }
    }

    // =====================================
    // BAI 3: SUA THONG TIN SACH
    // =====================================

    static void suaSach() {

        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] data = danhSachSach.get(i).split("\\|");

            if (data[0].equalsIgnoreCase(ma)) {

                System.out.println("Nhap thong tin moi:");

                System.out.print("Ten sach moi: ");
                String ten = sc.nextLine();

                System.out.print("So luong moi: ");
                int sl = Integer.parseInt(sc.nextLine());

                System.out.print("Don gia moi: ");
                double gia = Double.parseDouble(sc.nextLine());

                String thongTinMoi =
                        data[0] + "|" + ten + "|" + sl + "|" + gia;

                danhSachSach.set(i, thongTinMoi);

                System.out.println("Cap nhat sach thanh cong!");

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach can sua!");
        }
    }

    // =====================================
    // BAI 4: TINH TONG SO LUONG
    // =====================================

    static void tinhTongSoLuong() {

        int tong = 0;

        for (String sach : danhSachSach) {

            String[] data = sach.split("\\|");

            int sl = Integer.parseInt(data[2]);

            tong += sl;
        }

        System.out.println("Tong so luong sach: " + tong);
    }

    // =====================================
    // BAI 4: TINH TONG GIA TRI
    // =====================================

    static void tinhTongGiaTri() {

        double tong = 0;

        for (String sach : danhSachSach) {

            String[] data = sach.split("\\|");

            int sl = Integer.parseInt(data[2]);
            double gia = Double.parseDouble(data[3]);

            tong += sl * gia;
        }

        System.out.println("Tong gia tri sach: " + tong);
    }
}
