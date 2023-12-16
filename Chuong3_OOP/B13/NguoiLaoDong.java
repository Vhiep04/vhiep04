package B13;
import java.util.*;
public abstract class NguoiLaoDong {
	private String hoTen;
	private String diaChi; 
	private String loaiLaoDong;
	// constructor
	public NguoiLaoDong(){

	}
	public NguoiLaoDong(String hoTen,String diaChi,String loaiLaoDong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}
	//setter && getter
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setLoaiLaoDong(String loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getLoaiLaoDong() {
		return loaiLaoDong;
	}
	// pt nhap tt
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi= sc.nextLine();
		System.out.print("Nhap loai lao dong: ");
		loaiLaoDong= sc.nextLine();
	}
	// tinh luong
	public abstract double tinhLuong();
	// pt xuat tt
	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai lao dong: "+loaiLaoDong);
		System.out.println("Luong thang: "+ tinhLuong());
	}
}