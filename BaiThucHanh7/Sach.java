package BaiThucHanh7;

import java.time.Year;

public class Sach {
    // Yêu cầu 1: Tất cả các thuộc tính được khai báo với từ khóa private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Yêu cầu 4: Thêm constructor có tham số đầy đủ vào lớp Sach
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); // Gọi setter để kiểm tra ràng buộc năm
        setSoLuong(soLuong);       // Gọi setter để kiểm tra ràng buộc số lượng
    }

    // Yêu cầu 2 & 3: Cung cấp đầy đủ các phương thức public getters và setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3: Đảm bảo namXuatBan không lớn hơn năm hiện tại và hợp lệ (> 0)
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại tự động (2026)
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản không hợp lệ (Phải từ 0 đến " + currentYear + ")!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3: Đảm bảo soLuong không âm (>= 0)
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng sách không được âm!");
        }
    }

    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tiêu đề      : " + tieuDe);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Số lượng     : " + soLuong);
        System.out.println("----------------------------------------");
    }
}