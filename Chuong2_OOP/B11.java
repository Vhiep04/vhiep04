package chuong2_NgoVanHiep;
import java.util.Scanner;
public class Bai11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap r = ");
		double r = s.nextDouble();
		System.out.println("Chu vi hinh tron = " + (double)(2*Math.PI*r));
		System.out.println("Dien tich hinh tron = " + (double)(Math.PI*r*r));
	}
}