package chuong2_NgoVanHiep;
import java.util.*;
public class B16{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		do{
			System.out.print("nhap n = ");
			n = s.nextInt();
		}
		while(n<0);
		int g = 1;
		for(int i=1;i<=n;i++){
			g*=i;
		}
		System.out.print("n giai thua = "+g);
}
}