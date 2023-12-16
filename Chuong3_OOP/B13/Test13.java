package B13;
import java.util.*;
public class Test13{
	public static void main(String[] args) {
		NguoiLaoDong ldpt=new LaoDongPhoThong();
		KiSu ks=new KiSu();
		System.out.println(" Lao dong pho thong ");
		ldpt.nhapThongTin();
		System.out.println("---------------------------Thong tin ld pho thong da nhap: ");
		ldpt.inThongTin();
		System.out.println("Ki su ");
		ks.nhapThongTin();
		System.out.println("---------------------------Thong tin ki su da nhap: ");
		ks.inThongTin();
	}
}