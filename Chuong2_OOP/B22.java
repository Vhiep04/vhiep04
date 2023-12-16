package chuong2_NgoVanHiep;
import java.util.*;
public class B22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang n = ");
		int n = s.nextInt();
	    double[] a = new double[n];
	    for(int i=0; i< n; i++) {
	    	System.out.print("a["+(i)+"] = ");
	    	a[i] = s.nextInt();
	    }
	    System.out.println("Mang da nhap la: ");
	    for(int i=0; i<n; i++) {
	    	System.out.println("a["+(i)+"] = "+a[i]);
	    }
	    int tong = 0;
	    for(int i=0; i<n; i++) {
	    	tong+= a[i];
	    }
	    System.out.print("Tong cac  phan tu trong mang la: " + tong);
	    s.close();
}
}