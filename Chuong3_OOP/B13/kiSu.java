package B13;
import java.util.*;
public class KiSu extends NguoiLaoDong {
	private double lCB;
	private double hSL;
	private int sNC;
	public KiSu() {

	}
	public KiSu(String hoTen,String diaChi,String loaiLaoDong,int sNC,double lCB, double hSL) {
		super(hoTen,diaChi,loaiLaoDong);
		this.sNC = sNC;
		this.lCB = lCB;
		this.hSL = hSL;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so ngay cong: ");
		sNC=sc.nextInt();
		System.out.println("Nhap luong co ban: ");
		lCB=sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		hSL=sc.nextDouble();
	}

	@Override
	public double tinhLuong() {
		double luongThang;
		if(sNC>=25)
			luongThang=lCB*hSL+2000000;
		else if(sNC<25 && sNC>15)
			luongThangluongThang=lCB*hSL+1000000;
			else
				luongThang=lCB*hSL+500000;

		return luongThang;
	}

	@Override
	public void inThongTin(){
		super.inThongTin();
	}
}