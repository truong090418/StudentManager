package managerSinhVien;

public enum HocLuc {
	F("truot mon") ,
	D("yeu"),
	C("trung binh"),
	B("kha"),
	A("gioi"),
	A_plus("xuat sac");
	HocLuc(String value){
		this.value = value;
	}
	private String value;
	public String getValue() {
		return value;
	}
}
