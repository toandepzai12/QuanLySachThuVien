package BaiThucHanhTuan9;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double tinhThanhTien() {
        if (tinhTrang != null && (tinhTrang.trim().equalsIgnoreCase("moi") || tinhTrang.trim().equalsIgnoreCase("mới"))) {
            return getSoLuong() * getDonGia();
        }
        return getSoLuong() * getDonGia() * 0.5;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("   -> Loai: Sach giao khoa | Tinh trang: " + tinhTrang + " | Thanh tien: " + tinhThanhTien());
    }
}
