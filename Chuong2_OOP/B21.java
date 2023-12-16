package chuong2_NgoVanHiep;
import java.util.*;

public class B21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = s.nextInt();
	    int[] a = new int[n];
	    for(int i=0; i< n; i++) {
	    	System.out.print("a["+(i) + "] = ");
	    	a[i] = s.nextInt();
	    }
	    System.out.println("Mang da nhap la: ");
	    for(int i=0; i<n; i++) {
	    	System.out.println("a["+(i) + "] = "+a[i]);
	    }
	    s.close();
	}
}