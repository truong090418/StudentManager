package managerSinhVien;

public class BoardPoint {
	private String id;
	private double point1;
	private double point2;
	private double point3;
	private double mediumPoint;
	private HocLuc hocLuc;
	public BoardPoint(String id, double point1, double point2, double point3) {
		this.id = id;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.mediumPoint =(point1 + 2*point2 + 3*point3)/6;
		this.hocLuc= null;
	}
	public BoardPoint() {
		id = "";
		point1 = 0;
		point2 = 0;
		point3 = 0;
		mediumPoint = 0;
		hocLuc = null;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPoint1() {
		return point1;
	}
	public void setPoint1(double point1) {
		this.point1 = point1;
	}
	public double getPoint2() {
		return point2;
	}
	public void setPoint2(double point2) {
		this.point2 = point2;
	}
	public double getPoint3() {
		return point3;
	}
	public void setPoint3(double point3) {
		this.point3 = point3;
	}
	public double getMediumPoint() {
		return mediumPoint;
	}
	public void setMediumPoint() {
		this.mediumPoint =(point1 + 2*point2 + 3*point3)/6;
	}
	
	public HocLuc getHocLuc() {
		return hocLuc;
	}
	public void MediumPoint() {
		this.mediumPoint = (point1 + 2*point2 + 3*point3)/6;
	}
	public void hocluc() {
		if(getMediumPoint() < 4) {
			this.hocLuc =HocLuc.F;
		}
		else if(getMediumPoint()>=4 && getMediumPoint()<5) {
			 this.hocLuc = HocLuc.D;
		}
		else if(getMediumPoint()>=5 && getMediumPoint()<6.5) {
			this.hocLuc = HocLuc.C;
		}
		else if(getMediumPoint()>=6.5 && getMediumPoint()<8) {
			this.hocLuc = HocLuc.B;
		}
		else if(getMediumPoint()>=8 && getMediumPoint()<9) {
			this.hocLuc = HocLuc.A;
		}
		else if(getMediumPoint()>=9 && getMediumPoint()<10) {
			this.hocLuc = HocLuc.A_plus;
		}
		
	}
	@Override
	public String toString() {
		return "BoardPoint [id=" + id + ", point1=" + point1 + ", point2=" + point2 + ", point3=" + point3
				+ ", mediumPoint=" + mediumPoint + ", hocLuc=" + hocLuc + "]";
	}
}
