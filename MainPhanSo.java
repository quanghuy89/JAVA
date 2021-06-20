package Test1;

public class MainPhanSo {
     
    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(16,7);    
        PhanSo phanSo2=new PhanSo(9,5);
         

        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
     
}