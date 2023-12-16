package B13;
import java.util.*;
public class LaoDongPhoThong extends NguoiLaoDong {
	private int sNC;
	private double dGNC;
	public LaoDongPhoThong(){

	}
	public LaoDongPhoThong(String hoTen,String diaChi,String loaiLaoDong,int sNC, double dGNC) {
		super(hoTen,diaChi,loaiLaoDong);
		this.sNC = sNC;
		this.dGNC = dGNC;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so ngay cong: ");
		sNC=sc.nextInt();
		System.out.println("Nhap don gia ngay cong: ");
		dGNC=sc.nextDouble();
	}

	@Override
	public double tinhLuong() {
		double luongThang;
		if(sNC>=25)
			luongThang=sNC*dGNC+1000000;
		else if(sNC<25 && sNC>15)
			luongThang=sNC*dGNC+500000;
		else
			luongThang=sNC*dGNC;
		return luongThang;
	}

	@Override
	public void inThongTin(){
		super.inThongTin();
	}
}