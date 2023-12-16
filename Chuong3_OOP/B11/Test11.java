package bai11;

public class Test11{
	public static void main(String[]args) {
		GVCoHuu gvch= new GVCoHuu();
		GVThinhGiang gvtg= new GVThinhGiang();
		System.out.println("Giang vien co huu");
		gvch.nhapThongTin();
		System.out.println("---------------------------Thong tin gv co huu da nhap: ");
		gvch.inThongTin();
		System.out.println(" Giang vien thing giang ");
		gvtg.nhapThongTin();
		System.out.println("---------------------------Thong tin gv thinh giang da nhap: ");
		gvtg.inThongTin();
	}
}