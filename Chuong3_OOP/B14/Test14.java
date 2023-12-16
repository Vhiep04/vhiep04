package B14;
import java.util.*;
public class Test14{
	public static void main(String[] args) {
		CNKSP cnksp = new CNKSP();
		CNTCN cntcn = new CNTCN();
		System.out.println("Cong nhan khoan san pham.");
		cnksp.nhapTT();
		System.out.println("---------------------------Thong tin cnksp da nhap: ");
		cnksp.inTT();
		System.out.println("Cong nhan tinh cong nhat.");
		cntcn.nhapTT();
		System.out.println("---------------------------Thong tin cntcn da nhap: ");
		cntcn.inTT();
	}
}