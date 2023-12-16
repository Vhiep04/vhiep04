package B10;
import java.util.Scanner;
public class HocvienDH extends HocVien {
	private int loaiUuTien, soBuoi;
	private double donGia;
	public HocvienDH() {
	}
	public HocvienDH(String hoTen, String diaChi, int loaiChuongTrinh, int loaiUuTien,int soBuoi, double donGia) {
		super(hoTen,diaChi,loaiChuongTrinh);
		this.loaiUuTien = loaiUuTien;
		this.soBuoi=soBuoi;
		this.donGia=donGia;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		do {
			System.out.println("Nhap loai uu tien: ");
			loaiUuTien=sc.nextInt();
		} while(loaiUuTien!=1 && loaiUuTien!=2);
		System.out.println("Nhap so buoi hoc: ");
		soBuoi= sc.nextInt();
		System.out.println("Nhap don gia: ");
		donGia=sc.nextDouble();
	}

	@Override
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("loai uu tien: "+loaiUuTien);
	}
	
	@Override
	public double hocPhi() {
		if(loaiUuTien == 1) {
			double hocphi=soBuoi*donGia-1000000;
			if(hocphi<0) {
				return 0;
			} else {
				return hocphi;
			}
		} else {
			double hocphi=soBuoi*donGia-500000;
			if(hocphi<0) {
				return 0;
			} else {
				return hocphi;
			}
		}

	}
	
}