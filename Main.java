package managerSinhVien;
import java.util.Scanner;

import javax.accessibility.AccessibleStateSet;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<>();
		ArrayList<Subject> subject = new ArrayList<>();
		ArrayList<Class> classS= new ArrayList<>();
		int n; 
		boolean flag = true;
		do {
			System.out.println("------------------- Menu ------------------");
			System.out.println("1.Them Sinh vien\r\n"
					+ "2.Them Mon hoc\r\n"
					+ "3.Them Lop\r\n"
					+ "4.Them sinh vien vao lop\r\n"
					+ "5.Hien thi danh sach sinh vien\r\n"
					+ "6.Hien thi danh sach mon hoc\r\n"
					+ "7.Hien thi danh sach tat ca cac Lop\r\n"
					+ "8.Hien thi danh sach sinh vien trong tat ca lop\r\n"
					+ "9.Lam viec voi diem\r\n");
			System.out.print("=> Nhap lua chon: ");
			n=sc.nextInt();
			switch (n){
			       case 1:{
			    	  student.add(addListSTD(sc));
			    	  break;
			       }
			       case 2:{
			    	  subject.add(addListSUB(sc));
			    	  break;
			       }
			       case 3:{
			    	   classS.add(addListClass(sc, subject));
			    	   break;
			       }
			       case 4:{
			    	   addStudentInClass(sc, classS, student);
			    	   break;
			       }
			       case 5:{
			    	   showListSTD(student);
			    	   break;
			       }
			       case 6:{
			    	   showListSUB(subject);
			    	   break;
			       }
			       case 7:{
			    	   showListClass(classS);
			    	   break;
			       }
			       case 8:{
			    	  showStudentInClass(classS);
			    	  break;
			       }
			       case 9:{
			    	   int a;
			    	   boolean flag1= true;
			    	   do {
			    		   System.out.println("----------------------------------------------------< MeNu >------------------------------------------------------------");
				    	   System.out.println("1.Nhap diem tung thanh vien co trong lop                              2.Sua diem cua sinh vien");
				    	   System.out.println("3.Hien thi bang diem cua cac lop hoc                                  4.Hien thi bang diem lop hoc theo ma lop");
				    	   System.out.println("5.Tim kiem diem cua sinh vien theo ma                                 6.Sap xep bang diem theo diem trung binh giam dan");
				    	   System.out.print("Nhap lua chon: ");
				    	   a = sc.nextInt();
				    	   switch (a) {
				    	         case 1:{
				    	        	 addPointStudent(sc, classS);
				    	        	 break;
				    	         }
				    	         case 3:{
				    	        	 showBoardPointOfStudent(classS);
				    	        	 break;
				    	         }
				    	   }
			    	   }while(flag1==true);
			    	   break;
			       }
			       
			}
		}while(flag==true);
	}
	public static Student addListSTD(Scanner sc) {
		System.out.print("Nhap ma sinh vien: ");sc.nextLine();
	 	String id = sc.nextLine();
	    System.out.print("Nhap ho va ten: ");
  	    String name = sc.nextLine();
	    System.out.print("Nhap dia chi: ");
	    String address = sc.nextLine();
	    System.out.print("Nhap email: ");
	    String email = sc.nextLine();
	    System.out.print("Nhap gioi tinh: ");
	    String gender = sc.nextLine();
	    System.out.print("Nhap so dien thoai: ");
	    long numberPhone = sc.nextLong();
	    String nameClass = "";
	    System.out.print("Nhap khoa: ");sc.nextLine();
	    String department = sc.nextLine();
	    return  new Student(id, name, address, email, gender, numberPhone, nameClass, department);
	}
	public static void showListSTD(ArrayList<Student> student) {
		System.out.println("-----------------------------------------------------------------------<Danh sach sinh vien>-----------------------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s%s\n","STT","Ma Sinh Vien","Ho Va Ten","Dia chi","Email","Gioi","So Dien Thoai","Ten Lop","Khoa","|");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        for(int i = 0; i < student.size(); i++) {
            System.out.printf("%-8d %-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s%s\n",(i+1), student.get(i).getId(),student.get(i).getName(),student.get(i).getAddress(),student.get(i).getEmail(),student.get(i).getGender(),student.get(i).getNumberPhone(),student.get(i).getClassName(),student.get(i).getDepartment(),"|");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

	}
	public static Subject addListSUB(Scanner sc){
		System.out.print("Nhap ma mon hoc: ");sc.nextLine(); String id = sc.nextLine();
 	    System.out.print("Nhap ten mon: ");String name = sc.nextLine();
 	    System.out.print("Nhap so tin chi: ");int credits = sc.nextInt();
 	    System.out.print("Nhap so tiet: ");int lesson = sc.nextInt();
 	    System.out.print("Nhap so bai kiem tra: ");int exam = sc.nextInt();
 	    return new Subject(id, name, credits, lesson, exam);
	}
	public static void showListSUB(ArrayList<Subject> subject) {
		 System.out.println("----------------------------------<Danh sách môn học>-----------------------------------");
	        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-20s\n","STT","Ma Mon Hoc","Ten Mon Hoc","So Tin Chi","So Tiet Hoc","So Bai Kiem Tra");
	        for(int i = 0; i < subject.size(); i++) {
	            System.out.printf("%-8d %-15s %-15s %-15d %-15d %-20d\n",(i+1),subject.get(i).getId(),subject.get(i).getName(),subject.get(i).getCredits(),subject.get(i).getLesson(),subject.get(i).getExam());
	        }
	        System.out.println("----------------------------------------------------------------------------------------");
	}
	public static Subject findSubject(String id , ArrayList<Subject> subject) {
	      for(int i=0 ; i<subject.size() ; i++) {
	    	  if(id.compareTo(subject.get(i).getId())==0) {
	    		  return subject.get(i);
	    	  }
	      }
	      return null;
	}
	public static Class addListClass(Scanner sc , ArrayList<Subject> subject) {
		if(subject.size() == 0) {
			System.out.println("Mon Hoc Rong");
			System.out.println("Tao Lop That Bai!!");
			return null;
		}
		System.out.print("Nhap ma lop: "); sc.nextLine();String id = sc.nextLine();
		System.out.print("Nhap ten lop: ");String nameClass = sc.nextLine();
		System.out.print("Nhap phong hoc: ");String classRoom = sc.nextLine();
		System.out.print("Nhap thoi gian hoc: ");String time = sc.nextLine();
		System.out.print("Nhap id mon hoc: ");
		String idSub = sc.nextLine();
		Subject subj = findSubject(idSub, subject);
		if(subj == null) {
			System.out.println("Khong ton tai Ma Mon!!");
			System.out.println("Tao Lop That Bai!!");
			return null;
		}
		else {
			System.out.println("Tao Lop Thanh Cong!!");
			return new Class(id, nameClass, classRoom, time, subj);
		}
	}
	public static void showListClass(ArrayList<Class> classS) {
		System.out.println("--------------------------------------<Danh Sach Lop Hoc>------------------------------");
        System.out.printf("%-6s %-15s %-25s %-15s %-10s %-14s\n","STT","Ma Lop Hoc","Ten Lop Hoc","Phong Hoc","Thoi Gian","Ten Mon Hoc");
        for(int i = 0; i < classS.size(); i++) {
            System.out.printf("%-6d %-15s %-25s %-15s %-10s %-14s\n",(i + 1),classS.get(i).getId(),classS.get(i).getNameClass(),classS.get(i).getClassRoom(),classS.get(i).getTime(),classS.get(i).getSubj().getName());
        }
        System.out.println("---------------------------------------------------------------------------------------");
	}
	public static Student findStudent(String id , ArrayList<Student> student) {
		for(int i = 0 ; i< student.size() ; i++) {
			if(id.compareTo(student.get(i).getId())==0) {
				return student.get(i);
			}
		}
		return null;
	}
	public static Class findClass(String id , ArrayList<Class> classS) {
		for(int i=0 ; i<classS.size() ; i++) {
			if(id.compareTo(classS.get(i).getId())==0) {
				return classS.get(i);
			}
		}
		return null;
	}
	public static void addStudentInClass(Scanner sc ,ArrayList<Class> classS , ArrayList<Student> students) {
		if(students.size() == 0 || classS.size()==0 ) {
			System.out.println("Sinh Vien Rong");
			System.out.println("Tao Lop That Bai!!");           
		}
		System.out.print("Nhap ma Lop: ");sc.nextLine();
		String a = sc.nextLine();
		var checkClass = findClass(a, classS);
		if(checkClass != null) {
			showListSTD(students);
			System.out.print("Nhap Ma Sinh Vien: ");
			String b = sc.nextLine();
			var checkStudent = findStudent(b, students);
			if(checkStudent != null) {
				 for(int i=0 ; i<classS.size(); i++) {
					 if(checkClass.getId().compareTo(classS.get(i).getId())==0) {
						 classS.get(i).addStudentInClass(checkStudent);
					 }
				 } 
				 System.out.println("<=== Them sinh vien thanh cong ===>");
			}
			else {
				System.out.println("Khong ton tai Ma Sinh Vien nay!!");
				System.out.println("<=== Them sinh vien that bai ===>");
			}
		}
		else {
            System.out.println("<=== Ma lop khong hop le ===>");
            System.out.println("<=== Them sinh vien that bai ===>");
            
		}	
	}
	private static void showStudentInClass(ArrayList<Class> classS) {
	    for(int j=0 ; j<classS.size();j++) {
	    	System.out.println("-----< LOP: " +classS.get(j).getNameClass()+" >-----");
	    	System.out.println("-----------------------------------------------------------------------<Hoc Sinh Co Trong Lop>-----------------------------------------------------------------------------");
		    System.out.printf("%-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s\n","Ma Sinh Vien","Ho Va Ten","Dia Chi","Email","GioiT","So Dien Thoai","Ten Lop","Khoa","  |");
	        for(int i = 0 ; i<classS.get(j).getStudentInClass().size();i++) {
	    	    System.out.printf("%-15s %-20s %-30s %-30s %-8s %-19s %-15s %-15s\n",classS.get(j).getStudentInClass().get(i).getStudent().getId(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getName(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getAddress(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getEmail(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getGender(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getNumberPhone(),
	    	    		classS.get(j).getStudentInClass().get(i).getStudent().getDepartment());
	        }
	        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	        System.out.println();
	    }
	}
	public static void addPointStudent(Scanner sc , ArrayList<Class> classS ) {
		for(int i = 0 ;i< classS.size() ;i++) {
			for(int j = 0 ; j<classS.get(i).getStudentInClass().size();j++) {
				System.out.println("------------< ID SV: "+classS.get(i).getStudentInClass().get(j).getStudent().getId()+" >-----------");
				System.out.print("Nhap ma bang diem: ");sc.nextLine();String id = sc.nextLine();
				System.out.print("Nhap diem he so 1: ");double point1 = sc.nextDouble();
				System.out.print("Nhap diem he so 2: ");double point2 = sc.nextDouble();
				System.out.print("Nhap diem he so 3: ");double point3 = sc.nextDouble();
				System.out.println("Diem trung binh la: " +((point1+2*point2+3*point3)/6));
				classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().hocluc();
				BoardPoint bP = new BoardPoint(id, point1, point2, point3);
				classS.get(i).getStudentInClass().get(j).getStudent().setBoardPoint(bP);;
				System.out.println("Them diem thanh cong!!");
			}
		}
	}
	public static void showBoardPointOfStudent(ArrayList<Class> classS) {
		for(int i=0 ; i<classS.size() ; i++) {
			System.out.println("----<Bang Diem Lop "+classS.get(i).getNameClass()+" >----");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.printf("%-10s %-10s %-15s %-10s %-10s %-15s %-20s %-10s\n","STT" , "Name" , "Ma bang diem" , "He so 1" , "He so 2","He so 3", "Trung binh","Hoc luc");
			for(int j=0 ; j<classS.get(i).getStudentInClass().size() ; j++) {
				System.out.printf("%-10s %-10s %-15s %-10s %-10s %-15s %-20s %-10s",(j+1),
						classS.get(i).getStudentInClass().get(j).getStudent().getName(),
						classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getId(),
						classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getPoint1(),
						classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getPoint2(),
						classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getPoint3(),
						classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getMediumPoint(),
				        classS.get(i).getStudentInClass().get(j).getStudent().getBoardPoint().getHocLuc());
						System.out.println();
			}
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}
}
