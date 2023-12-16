package B14;
import java.util.*;
public class CNTCN extends CongNhan{
	private double luongCB;
	private double heSL;
	private double soNC;
	public CNTCN(){

	}
	public CNTCN(String hoTen, String diaChi, String loaiCN, double luongCB, double heSL){
		super(hoTen, diaChi, loaiCN);
		this.luongCB = luongCB;
		this.heSL = heSL;
		this.soNC = soNC;
	}

	@Override
	public void nhapTT(){
		Scanner sc = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhap luong co ban: ");
		luongCB = sc.nextDouble();
		System.out.print("Nhap he so luong: ");
		heSL = sc.nextDouble();
		System.out.print("Nhap so ngay cong: ");
		soNC = sc.nextDouble();

	}

	@Override
	public double tinhLuong(){
		double luongThang;
		if(soNC>0 && soNC<x0) {
			luongThang = luongCB * heSL;
		}
		else{
			luongThang = luongCB * heSL + 1.2*luongCB;
		} 

		return luongThang;
	}

	@Override
	public void inTT(){
		super.inTT();
	}
	
}