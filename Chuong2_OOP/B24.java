package chuong2_NgoVanHiep;
import java.util.*;
public class B24{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so sinh vien n = ");
		int n = s.nextInt();
	    int[] a = new int[n];
	    for(int i=0; i< n; i++) {
	    	do{
	    		System.out.print("sv["+(i+1)+"] = ");
	    		a[i] = s.nextInt();
	    	}
	    	while(a[i]<0 || a[i]>100);
	    }
	    System.out.print("Nhap diem can tim: ");
	    int c = s.nextInt();
	    for(int i=0; i<n; i++){
	    	if(c == a[i]){
	    		System.out.print("sv["+(i+1)+"] co diem = "+c);
	    	}
	    	else {
	    		System.out.print("Khong co sv nao co diem "+c);
	    		break;
	    	}	
	    }
	}
}