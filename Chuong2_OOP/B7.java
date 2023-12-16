package chuong2_NgoVanHiep;

import java.util.Scanner;
public class b7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b;
		System.out.print("Nhap a = ");
		a = s.nextDouble();
		System.out.print("nhap b = ");
		b = s.nextDouble();
		System.out.print("Nhap 1 ky tu(A,S,M,D) = ");
		char c = s.next().charAt(0);
		if(c != 'A' && c != 'S' && c != 'M' && c != 'D' )
			System.out.print("Ky tu khong họp le");
		
		switch(c){
			case 'A':
			{
				System.out.print("tong = " + (a+b));
			}
			case 'S':
			{
				System.out.print("hieu " + (a-b));
			}
			case 'M':
			{
				System.out.print("tich " + a*b);
			}
			case 'D':
			{
				if(b==0)
					System.out.print("Phep chia khong hop le");
				else
					System.out.print("thuong = " + (float)a/b);
			}
		}

	}
}