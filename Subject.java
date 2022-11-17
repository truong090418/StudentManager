package managerSinhVien;

public class Subject {
	private String id;
	private String name;
	private int credits;
	private int lesson;
	private int exam;
	public Subject(String id, String name, int credits, int lesson, int exam) {
		this.id = id;
		this.name = name;
		this.credits = credits;
		this.lesson = lesson;
		this.exam = exam;
	}
	public Subject() {
		
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
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getLesson() {
		return lesson;
	}
	public void setLesson(int lesson) {
		this.lesson = lesson;
	}
	public int getExam() {
		return exam;
	}
	public void setExam(int exam) {
		this.exam = exam;
	}
	
	
}