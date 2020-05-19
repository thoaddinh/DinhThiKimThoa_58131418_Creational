
package btt1;

public class CTHD {
    String sanpham, soluong, dongia, chietkhau;

    public CTHD(String sanpham, String soluong, String dongia, String chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "sanpham=" + sanpham + ", soluong=" + soluong + ", dongia=" + dongia + ", chietkhau=" + chietkhau + '}';
    }
   
}
