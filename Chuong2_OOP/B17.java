package chuong2_NgoVanHiep;
public class bai17{
	public static void main(String[] args) {
		System.out.println("Cac so co 3 chu so thoa man a^3 + b^3 = c^3: ");
		for(int i=100;i<999;i++){
			int a = i/100;
			int b = (i-a*100)/10;
			int c = i-a*100-b*10;
			if((a*a*a + b*b*b == c*c*c )){
				System.out.println(i);
			}
		}
	}
}