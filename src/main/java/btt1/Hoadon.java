
package btt1;

import java.util.ArrayList;

public class Hoadon {
   HoaDonHeader hoaDonHeader;
   ArrayList<CTHD> cthds = new ArrayList<>();
     
   protected Hoadon(Builder builder){
       this.hoaDonHeader = builder.hoaDonHeader;
       this.cthds = builder.cthds;
   }

    @Override
    public String toString() {
        return "Hoadon{" + "hoaDonHeader=" + hoaDonHeader + ", cthds=" + cthds + '}';
    }
   
   public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> cthds = new ArrayList<>();

        public Builder() {
        }
    
        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addCthds(ArrayList<CTHD> cthds) {
            this.cthds = cthds;
            return this;
        }
    
        public Hoadon build(){
            return new Hoadon(this);
        }
   }
}
