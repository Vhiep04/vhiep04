package chuong2_NgoVanHiep;
import java.util.*;
public class B12{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Diem thi = ");
		int n = s.nextInt();
		char l = "";
		if(n<=100 && n>=90){
			l = "A";
		}
		if(n<90 && n>=80){
			l = "B";
		}
		if(n<80 && n>=70){
			l = "C";
		}
		if(n<70 && n>=50){
			l = "D";
		}
		if(n<50){
			l = "F";
		}
		System.out.print("Xep loai: "+l);
	}
}