package B10;
import java.util.*;
public class Test10 {
	public static void main(String[]args) {
		HocvienDH hvdh=new HocvienDH();
		HocvienLT hvlt= new HocvienLT();
		System.out.println("Nhap thong tin hoc vien do hoa: ");
		hvdh.nhapThongTin();
		System.out.println("---------------------------Thong tin hv do hoa da nhap: ");
		hvdh.hienThongTin();
		System.out.println("Nhap thong tin hoc vien lap trinh: ");
		hvlt.nhapThongTin();
		System.out.println("---------------------------Thong tin hv lap trinh da nhap: ");
		hvlt.hienThongTin();
	}
}