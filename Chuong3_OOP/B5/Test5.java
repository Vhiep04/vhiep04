package B5;

public class Test {
	public static void main(String[]args) {
		Truong tr =new Truong("Haui", "HN", "A");
		SinhVien sv = new SinhVien("Ngo Van Hiep",19,'M',"Cntt02","Cntt",tr);
		System.out.println(sv);
		tr.setTen("Dai hoc Cong nghiep");
		System.out.println("Ten truong: "+ tr.getTen());
	}
}