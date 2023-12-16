package Chuong3_NgoVanHiep;

public class Test3 {
	public static void main(String[] args) {
		DiaChi address = new DiaChi("Hoi Quan", "Tuong Giang", "Tu Son", "Bac Ninh");
		NhanVien nv = new NhanVien("Ngo Van Hiep" , address, "27/09/2004", 'M');
		System.out.println(nv);
		address.setHuyen("Tu Son city");
		System.out.print(address.getHuyen());
	}
}