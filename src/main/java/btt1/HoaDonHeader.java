
package btt1;

public class HoaDonHeader {
    String mahoadon, ngayban, tenkhachhang;

    public HoaDonHeader(String mahoadon, String ngayban, String tenkhachhang) {
        this.mahoadon = mahoadon;
        this.ngayban = ngayban;
        this.tenkhachhang = tenkhachhang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "mahoadon=" + mahoadon + ", ngayban=" + ngayban + ", tenkhachhang=" + tenkhachhang + '}';
    }
    
}