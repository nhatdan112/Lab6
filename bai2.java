/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author nhatm
 */
public class bai2{
public static class nhanvien {
    public String ten;
    public long luong;

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    public nhanvien(){}
    public nhanvien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }
    public void tinhluong(){
        System.out.println("luong "+luong);
    }
    public void xuatthongtin(){
        System.out.println("ten:"+ten);
    }
}
    public static class nhanvienfulltime extends nhanvien{
        public int loaichucvu;
        public int ngaylamthem;

        public int getLoaichucvu() {
            return loaichucvu;
        }

        public void setLoaichucvu(int loaichucvu) {
            this.loaichucvu = loaichucvu;
        }

        public int getNgaylamthem() {
            return ngaylamthem;
        }

        public void setNgaylamthem(int ngaylamthem) {
            this.ngaylamthem = ngaylamthem;
        }
        public nhanvienfulltime(int loaichucvu, int ngaylamthem, String ten ,long luong) {
            super(ten,luong);
            this.loaichucvu = loaichucvu;
            this.ngaylamthem = ngaylamthem;
        }
        public nhanvienfulltime(){}
        public String loainhanvien(){
        return "nhan vien full time";
    }
        @Override 
        public void tinhluong(){
        System.out.println("muc luong nhan vien full time la"+ (ngaylamthem*luong));
    }
    } 
    public static class nhanvienparttime extends nhanvien{
        public int gioLamViec;

        public int getGioLamViec() {
            return gioLamViec;
        }

        public void setGioLamViec(int gioLamViec) {
            this.gioLamViec = gioLamViec;
        }

        public nhanvienparttime(int gioLamViec, String ten, long luong) {
            super(ten, luong);
            this.gioLamViec = gioLamViec;
        }
        public nhanvienparttime(){}
        public String loainhanvien(){
        return "nhan vien parttime";
    }
        @Override
        public void tinhluong()
        {
            System.out.println("luong la"+(gioLamViec*luong));
        }
    }
class main{
        public static void main(String[] args){
        nhanvien nhanvien = new nhanvien();
        nhanvien.getTen();
        nhanvien nhanvienfulltime=new nhanvienfulltime();
        nhanvienfulltime.xuatthongtin();
        nhanvien nhanvienparttime=new nhanvienparttime();
        nhanvienparttime.tinhluong();
    }
    }
}


