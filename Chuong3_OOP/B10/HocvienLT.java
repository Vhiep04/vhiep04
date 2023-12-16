package B10;

public class HocvienLT extends HocVien {
	private int loaiUuTien, soBuoi;
	private double donGia;
	public HocvienLT() {
	
	}
	public HocvienLT(String hoTen, String diaChi, int loaiChuongTrinh, int loaiUuTien,int soBuoi, double donGia) {
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
		System.out.println("----------------------------------------");
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
			double hocphi=soBuoi*donGia-800000;
			if(hocphi<0) {
				return 0;
			} else {
				return hocphi;
			}
		}

	}
	
}