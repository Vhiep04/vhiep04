package B10;
import java.util.*;
public abstract class Hocvien {
	Scanner sc= new Scanner(System.in);
	private String hoTen, diaChi;
	private int loaiChuongTrinh;
	// constructor
	public HocVien() {
	}

	public HocVien(String hoTen, String diaChi, int loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	// phuong thuc nhap
	public void nhapThongTin() {
		System.out.print("Nhap ho ten: "); 
		hoTen= sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi= sc.nextLine();
		System.out.print("Loai CT (1.do hoa / 2.lap trinh) : ");
		loaiChuongTrinh=sc.nextInt();
		while(loaiChuongTrinh!=1 && loaiChuongTrinh!=2) {
			System.out.println("Loai CT (1.do hoa / 2.lap trinh) : ");
			loaiChuongTrinh=sc.nextInt();
		}
	// phuong thuc xuat	
	}
	public void hienThongTin() {
		System.out.println("Ho ten: "+ hoTen);
		System.out.println("Dia chi: "+ diaChi);
		if(loaiChuongTrinh==1) {
			System.out.println("Loai CT: doa hoa");
		}else {
			System.out.println("Loai CT: lap trinh");
		}
		System.out.println("Hoc phi: "+hocPhi());
	}
	//pt truu tuong tinh hoc phi
	public abstract double hocPhi();
}