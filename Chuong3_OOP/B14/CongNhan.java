package B14;
import java.util.*;
public abstract class CongNhan{
	private String hoTen;
	private String diaChi;
	private String loaiCN;
	public CongNhan(){

	}
	// constructor
	public CongNhan(String hoTen, String diaChi, String loaiCN){
		this.hoTen=hoTen;
		this.diaChi=diaChi;
		this.loaiCN=loaiCN;
	}
	// getter && setter
	public  String getHoten(){
		return hoTen;
	}
	public void setHoten(String hoten){
		this.hoTen=hoTen;
	}
	public String getDiachi(){
		return diaChi;
	}
	public void setDiachi(String diachi){
		this.diaChi=diaChi;
	}
	public String getLoaiCN(){
		return loaiCN;
	}
	public void setLoaiCN(String loaiCN){
		this.loaiCN=loaiCN;
	}
	// nhap thong tin
	public void nhapTT(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap loai CN: ");
		loaiCN = sc.nextLine();
	}
	// phuong thuc truu tuong tinh luong
	public abstract double tinhLuong();
	// xuat thong tin
	public void inTT(){
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dia chi: "+ diaChi);
		System.out.println("Loai CN: "+loaiCN);
		System.out.println("Luong thang: "+tinhLuong());

	}
}