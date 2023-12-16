package chuong2_NgoVanHiep;
import java.util.*;
public class B23{
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
    	int max=a[0];
    	int b = 0;
	    for(int i=0;i<n;i++){
	    	if(max < a[i]){
	    		max = a[i];
	    		b=i+1;
	    	}
	    }	
	    System.out.println("Diem cao nhat la sv["+b+"] = "+max);

  		for(int i=0;i<n;i++){
  			for(int j=0;j<n;j++){
  				if(a[i]<a[j]){
  					int t=a[i];
  					a[i]=a[j];
  					a[j]=t;
  				}
  			}
  		}
  		System.out.println("Diem tang dan: ");
	    for(int i=0; i<n; i++) {
	    	System.out.println("sv["+(i+1)+"] = "+a[i]);
	    }
	}
}