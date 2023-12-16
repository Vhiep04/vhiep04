package B11;
import java.util.Scanner;
public class GVThinhGiang extends GiangVien {
	private int soTietDay;
	private double donGia;
	public GVThinhGiang() {
	}

	public GVThinhGiang (String hoTen, String diaChi, String loaiGiangVien, int soTietDay, double donGia) {
		super(hoTen,diaChi,loaiGiangVien);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}
	@Override
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so tiet day: ");
		soTietDay=sc.nextInt();
		System.out.println("Nhap don gia: ");
		donGia=sc.nextDouble();

	}
	
	@Override
	public double tinhLuong() {
		return soTietDay*donGia - 0.15*soTietDay*donGia;
	}

	@Override
	public void inThongtin(){
		super.inThongtin();
	}
}