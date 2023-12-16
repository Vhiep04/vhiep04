package B11;
import java.util.*;
public class GVCoHuu extends GiangVien {
	private double luongCoBan,heSoLuong;
	private int thamNienCongTac;
	public GVCoHuu() {
	}

	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien,double luongCoBan, double heSoLuong, int thamNienCongTac) {
		super(hoTen,diaChi,loaiGiangVien);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNienCongTac = thamNienCongTac;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap luong co ban :");
		luongCoBan=sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		heSoLuong=sc.nextDouble();
		System.out.println("Nhap so nam tham nien: ");
		thamNienCongTac=sc.nextInt();
		}
		
	@Override
	public double tinhLuong() {
		if(thamNienCongTac<5) {
			return luongCoBan*heSoLuong;
		} else {
			return luongCoBan*heSoLuong+ (1.0*thamNienCongTac/100)*luongCoBan;
		}
	}

	@Override
	public void inThongTin() {
		super.inThongTin();
	}

}