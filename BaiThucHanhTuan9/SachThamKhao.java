package BaiThucHanhTuan9
;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        if (thue >= 0) {
            this.thue = thue;
        }
    }

    public double tinhThanhTien() {
        return getSoLuong() * getDonGia() + thue;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("   -> Loai: Sach tham khao | Thue: " + thue + " | Thanh tien: " + tinhThanhTien());
    }
}