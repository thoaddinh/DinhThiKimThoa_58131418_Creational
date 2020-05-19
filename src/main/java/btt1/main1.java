
package btt1;

import java.util.ArrayList;

public class main1 {

    public static void main(String[] args) {
        ArrayList<CTHD> cthds = new ArrayList<>();
        cthds.add(new CTHD("Caphe", "2", "20000", "5%"));
        cthds.add(new CTHD("Dua", "5", "25000", "5%"));
        HoaDonHeader hd1 = new HoaDonHeader("Hd1", "19/05/2020", "thoa dinh");
        Hoadon hoadon1 = new Hoadon.Builder()
                        .addHoaDonHeader(hd1)
                        .addCthds(cthds).build();
        System.out.println(hoadon1.toString());
    }
    
}
