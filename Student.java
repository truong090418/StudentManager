package managerSinhVien;
import java.util.ArrayList;

public class Student {
	private String id;
	private String name;
	private String address;
	private String email;
	private String gender;
	private long numberPhone;
	private String className;
	private String department;
	private BoardPoint boardPoint;
	
	public Student(String id, String name, String address, String email, String gender, long numberPhone,
			String className, String department) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.numberPhone = numberPhone;
		this.className = className;
		this.department = department;
		this.boardPoint = new BoardPoint();
	}
	
	public Student() {
		id = "";
		name="";
		address="";
        email="";
		gender="";
		className=null;
		department="";
		boardPoint = null;
	}

	public BoardPoint getBoardPoint() {
		return boardPoint;
	}

	public void setBoardPoint(BoardPoint boardPoint) {
		this.boardPoint = boardPoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(long numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", gender="
				+ gender + ", numberPhone=" + numberPhone + ", className=" + className + ", department=" + department
				+ "]";
	}
	
}
