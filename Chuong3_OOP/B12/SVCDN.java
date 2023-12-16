package bai12;
import java.util.*;

public class SVCDN extends Nguoi {
	private double tDKT;
	private int sMKT;
	public SVCDN() {
	}
	public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien,double tDKT, int sMKT) {
		super(hoTen,ngaySinh,diaChi,loaiSinhVien);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
	}
	
	@Override
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		super.nhapThongTin();
		setLoaiSinhVien("Sinh vien cao dang nghe ");
		System.out.println("Nhap tong diem kiem tra: ");
		tDKT=sc.nextDouble();
		System.out.println("Nhap so mon kiem tra: ");
		sMKT=sc.nextInt();
	}

	@Override
	public double tinhDiem() {
		return (1.0*tDKT)/sMKT;
	}

	@Override
	public void inThongTin(){
		super.inThongTin();
	}
}