package chuong2_NgoVanHiep;
import java.util.*;
public class B15{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("So ngay luu tru: ");
		int sn = s.nextInt();
		System.out.print("Don gia: ");
		double dg = s.nextDouble();
		double gia;
		if(sn ==1)
			gia = dg;
		else if(sn>=2 && sn<=4)
				gia = dg - dg*0.2;
			else if(sn>=5 && sn<=10)
					 gia = dg - dg*0.4;
					else gia = dg - dg*0.6;
		System.out.print("So tien phong: "+gia);
		s.close();	
	}
}