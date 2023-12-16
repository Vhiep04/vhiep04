package B4;

public class Test4 {
	public static void main(String[]args) {
		BenhVien bv= new BenhVien("ABC", "Bac Ninh", "Ngo Van Hiep");
		BenhNhan bn= new BenhNhan("Hiep", 19, 'M', "abc", "abc", bv);
		System.out.println(bn);
		bv.setDiaChi("Ha Noi");
		System.out.println("Dia chi benh vien: "+bv.setDiaChi());
	}
}