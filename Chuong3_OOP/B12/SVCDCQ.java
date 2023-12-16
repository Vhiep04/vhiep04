package B12;
import java.util.*;

public class SVCDCQ extends Nguoi {
	private double tDKT;
	private int sMKT;
	private double dTKTHP;
	public SVCDCQ() {
	}
	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien,double tDKT, int sMKT, double dTKTHP) {
		super(hoTen,ngaySinh,diaChi,loaiSinhVien);
		this.tDKT = tDKT;
		this.sMKT = sMKT;
		this.dTKTHP=dTKTHP;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		super.nhapThongTin();
		setLoaiSinhVien("Sinh vien cao dang chinh quy ");
		System.out.println("Nhap tong diem kiem tra: ");
		tDKT=sc.nextDouble();
		System.out.println("Nhap so mon kiem tra: ");
		sMKT=sc.nextInt();
		System.out.println("Nhap diem thi ket thuc hoc phan: ");
		dTKTHP=sc.nextDouble();
	}
	@Override
	public double tinhDiem() {
		return ((1.0*tDKT)/sMKT+dTKTHP)/3;
	}

	@Override
	public void inThongTin(){
		super.inThongTin();
	}
}