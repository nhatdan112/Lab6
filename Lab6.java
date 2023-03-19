/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author nhatm
 */


    /**
     * @param args the command line arguments
     */
public class Lab6 {
    
public static class hocsinh{
    public String hoten;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;
        public String getHoten() {
            return hoten;
        }
        public void setHoten(String hoten) {
            this.hoten = hoten;
        }
        public String getLop() {
            return lop;
        }
        public void setLop(String lop) {
            this.lop = lop;
        }
        public double getToan() {
            return toan;
        }
        public void setToan(double toan) {
            this.toan = toan;
        }
        public double getLy() {
            return ly;
        }
        public void setLy(double ly) {
            this.ly = ly;
        }
        public double getHoa() {
            return hoa;
        }

        public void setHoa(double hoa) {
            this.hoa = hoa;
        }
        public hocsinh(){}
        public hocsinh(String hoten, String lop, double toan, double ly, double hoa) {
            this.hoten = hoten;
            this.lop = lop;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }
    public double diemtrungbinh(){
        return (toan+hoa+ly)/3;
    }
    }
    public static class hocsinhchuyentoan extends hocsinh{
        public hocsinhchuyentoan(String hoten, String lop, double toan, double ly, double hoa) {
            super(hoten, lop, toan, ly, hoa);
        }
        public hocsinhchuyentoan(){}
        @Override
        public double diemtrungbinh(){
            return ((toan*2)+ly+hoa)/4;
        }
        
    }

      class main{
        public static void main(String[] args){
            hocsinh hs = new hocsinh();
            hs.getHoten();
            hs.getLop();
            hs.getToan();
            hs.getLy();
            hs.getHoa();
            hs.diemtrungbinh();
            hocsinh hs1=new hocsinhchuyentoan();
            hs1.diemtrungbinh();
        }
    }
}

