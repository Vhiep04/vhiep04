package chuong2_NgoVanHiep;

import java.util.*;

public class B19 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhap so gio: ");
		int h = sn.nextInt();
		System.out.print("Nhap so phut: ");
		int m = sn.nextInt();
		System.out.print("Nhap so giay: ");
		int s = sn.nextInt();

		System.out.println("So giay quy doi la: "+ (h*3600+ m*60+ s));
	}
}