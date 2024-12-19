package study.practice.practice23;

public class Student {

	private String wClass;
	private int studentN;
	
	public Student() {
		this.wClass = wClass;
		this.studentN = studentN;
	}
	
	public String getwClass() {
		return wClass;
	}

	public void setwClass(String wClass) {
		this.wClass = wClass;
	}

	public int getStudentN() {
		return studentN;
	}

	public void setStudentN(int studentN) {
		this.studentN = studentN;
	}

	
	public void PrintInfo() {
		System.out.println("학번:"+this.studentN + " " + "학과명:"+ this.wClass);
	}
		
	}

