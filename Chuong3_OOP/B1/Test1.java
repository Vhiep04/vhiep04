package B1;
public class Test1{
public static void main(String[] args) {
	Person p1 = new Person("Hiep", "27/09/2004", "Bac Ninh", 'M', "vh@gmail.com", "0987654321");
		System.out.println(p1);
	p1.setName("Ngo Van Hiep");
	System.out.print("Name: "+p1.getName());
	}
}