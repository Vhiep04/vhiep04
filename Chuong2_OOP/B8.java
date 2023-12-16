package chuong2_NgoVanHiep;
public class B8 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0 ; i<=100 ; i++)// chay i tu 0 - 100
		{
			if(i>0 && i%2 == 0)// tim i chan va tinh tong
			{
				sum = sum+i;
			}
		}
		System.out.print("tong cac so chan tu [1,100] = " + sum);
	}
}