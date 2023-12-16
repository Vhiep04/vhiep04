package B1;
public class Person {
	private String name;
	private String ngaySinh;
	private String dob;
	private char pob;
	private String email;
	private String phone;
	public Person(){

	}
	public Person(String name, String ngaySinh, String dob, char pob, String email, String phone) {
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.dob = dob;
		this.pob = pob;
		this.email = email;
		this.phone = phone;
	}
	//getter && setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getPob() {
		return pob;
	}
	public void setPob(char pob) {
		this.pob = pob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	// toString
	@Override
	public String toString() {
		return "name: " + name + ", ngay sinh: " + ngaySinh + ", dob: " + dob + ", pob: " + pob + ", email:" + email
				+ ", phone: " + phone ;
	}
}