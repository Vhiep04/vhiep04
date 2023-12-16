package chuong2_NgoVanHiep;
import java.util.*;
public class B20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhiet do C = ");
		double doC = s.nextDouble();
		System.out.print("Do F = "+ (1.8*doC+32));
		s.close();
	}
}
