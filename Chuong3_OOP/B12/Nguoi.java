package B12;
import java.util.*;

public abstract class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private String loaiSinhVien;
	// constructor
	public Nguoi() {
	}

	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
	}
	//setter and getter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiSinhVien() {
		return loaiSinhVien;
	}

	public void setLoaiSinhVien(String loaiSinhVien) {
		this.loaiSinhVien = loaiSinhVien;
	}
	// pt nhap tt
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh= sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi= sc.nextLine();
	}
	// tinh diem
	public abstract double tinhDiem();
	// pt xuat tt
	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai sinh vien: "+loaiSinhVien);
		System.out.println("DTB: "+ tinhDiem());
	}
	
}