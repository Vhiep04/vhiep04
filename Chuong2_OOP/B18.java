package chuong2_NgoVanHiep;
import java.util.*;
public class B18{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = s.nextInt();
		int d=0;
		for(int i=1; i<=n; i++){
			if (n%i==0){
				d++;
			}
		}
		if(d==2 ) 
			System.out.println(n+ " la so nguyen to");
		else {
			System.out.println(n+" khong la so nguyen to");
		}
	}
}