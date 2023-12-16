package chuong2_NgoVanHiep;

import java.util.Scanner; 
public class B6 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a,b;
		System.out.print("Nhap a = ");
		a = sn.nextInt();
		System.out.print("Nhap b = ");
		b = sn.nextInt();
		System.out.println("tong = "+ a+b);
		System.out.println("hieu = "+ (a-b));
		System.out.println("tich = "+ a*b);
		System.out.println("thuong = "+ (float)a/b);
	}
}