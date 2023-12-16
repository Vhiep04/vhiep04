package B2;
public class Test2 {
	public static void main(String[]args) {
		DiaChi address = new DiaChi("Hoi Quan", "Tuong Giang", "Tu Son", "Bac Ninh");
		System.out.println(address);
		address.setThon("Khu pho Hoi Quan");
		System.out.print(address.getThon());
	}
}