package managerSinhVien;

import java.util.ArrayList;

public class Class {
	private String id;
	private String nameClass;
	private String classRoom;
	private String time;
	private Subject subj;
	private ArrayList<StudentInClass> studentInClass = new ArrayList<>();
	public Class(String id, String nameClass, String classRoom, String time, Subject subj) {
		this.id = id;
		this.nameClass = nameClass;
		this.classRoom = classRoom;
		this.time = time;
		this.subj = subj;
		this.studentInClass = new ArrayList<>();
	}

	public Class(String id, String nameClass, String classRoom, String time, Subject subj,
			ArrayList<StudentInClass> studentInClass) {
		this.id = id;
		this.nameClass = nameClass;
		this.classRoom = classRoom;
		this.time = time;
		this.subj = subj;
		this.studentInClass = new ArrayList<>();
	}
	



	public Class() {
		id = "";
		nameClass = "";
		classRoom = "";
		time = "";
		subj = null;
		studentInClass = new ArrayList<>();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}	
	
	
	public ArrayList<StudentInClass> getStudentInClass() {
		return studentInClass;
	}
	public void setStudentInClass(ArrayList<StudentInClass> studentInClass) {
		this.studentInClass = studentInClass;
	}
	public void addStudentInClass(Student student) {
		StudentInClass a  = new StudentInClass(student);
		studentInClass.add(a);
	}

	public class StudentInClass{
		private Student student;
		
		public StudentInClass(Student student ) {
			this.student = student;
			
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		
		
		
	}
}

	
