package B14;
import java.util.*;
public class CNKSP extends CongNhan{
	private int soSP;
	private double dGSP;
	public CNKSP(){

	}
	public CNKSP(String hoTen, String diaChi, String loaiCN, int soSP, double dGSP){
		super(hoTen, diaChi, loaiCN);
		this.soSP = soSP;
		this.dGSP = dGSP;
	}

	@Override
	public void nhapTT(){
		Scanner sc = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhap so san pham: ");
		soSP = sc.nextInt();
		System.out.print("Nhap don gia san pham: ");
		dGSP = sc.nextDouble();
	}

	@Override
	public double tinhLuong(){
		double luongThang;
		if(soSP>0 && soSP<100) {
			luongThang = soSP * dGSP;
		}
		else if(soSP>100 && soSP<150) {
			luongThang = soSP * dGSP + 1000000;
		}
			else {
				luongThang = soSP * dGSP + 1500000;
			}

		return luongThang;
	}

	@Override
	public void inTT(){
		super.inTT();
	}

}