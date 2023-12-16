package chuong2_NgoVanHiep;
import java.util.*;
public class B14{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("So dien: ");
		double g = s.nextDouble();
		if(g<=50 && g>=0){
			System.out.print("Gia dien: " + 1484*g);
		}
		if(g<=100 && g>=51){
			System.out.print("Gia dien: " + 1533*g);
		}
		if(g<=200 && g>=101){
			System.out.print("Gia dien: " + 1786*g);
		}
		if(g>=201){
			System.out.print("Gia dien: " + 2242*g);
		}
	}
}