package chuong2_NgoVanHiep;

public class B9 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0 ; i<=100 ; i++)// chay i tu 0 - 100
		{
			if(i>0 && i%2 == 1)// tim i le va tinh tong
			{
				sum = sum+i;
			}
		}
		System.out.print("tong cac so le tu [0,100] = " + sum);
	}

}