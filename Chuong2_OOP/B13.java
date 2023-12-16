package chuong2_NgoVanHiep;
import java.util.*;
public class B13{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Gia ban: ");
		double g = s.nextDouble();
		System.out.print("So % giam gia: ");
		double p = s.nextDouble();
		System.out.print("Gia ban sau khi giam gia la: "+(g-g*p/100));
	}
}