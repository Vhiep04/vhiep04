package B11;
import java.util.*;
public abstract class GiangVien {
	private String hoTen;
	private String diaChi;
	private String loaiGiangVien;
	// constructor
	public GiangVien() {
	}

	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	// setter && getter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}

	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}
	// pt nhap tt 
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ho ten giang vien: ");
		hoTen= sc.nextLine();
		System.out.print("Nhap dia chi cua giang vien: ");
		diaChi= sc.nextLine();
		System.out.print("Loai GV: ");
		loaiGiangVien=sc.nextLine();
	}
	// pt tinh luong
	public abstract double tinhLuong();
	// pt xuat tt
	public void inThongTin() {
		System.out.println("Thong tin cua giang vien: ");
		System.out.println("Ho ten: "+ hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai giang vien : "+loaiGiangVien);
		System.out.println("Luong thang: "+tinhLuong());
	}
}