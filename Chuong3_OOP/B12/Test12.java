package B12;

public class Test12{
	public static void main(String[]args) {
		SVCDN svn= new SVCDN();
		SVCDCQ svcq=new SVCDCQ();
		System.out.println("Sinh vien cao dang nghe");
		svn.nhapThongTin();
		System.out.println("---------------------------Thong tin sv cao dang nghe da nhap: ");
		svn.inThongTin();
		System.out.println("Sinh vien cao dang chinh quy");
		svcq.nhapThongTin();
		System.out.println("---------------------------Thong tin sv cao dang chinh quy da nhap: ");
		svcq.inThongTin();
	}
}