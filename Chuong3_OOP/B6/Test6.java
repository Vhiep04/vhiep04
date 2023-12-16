package B6;

public class Test6 {
	public static void main(String[]args) {
		PartTimeEmployee p= new PartTimeEmployee("Hiep",19,'M',"A","20/01/2023",100);
		System.out.println(p);
		p.setName("Ngo Van Hiep");
		System.out.println("Name: " + p.getName());
	}
}