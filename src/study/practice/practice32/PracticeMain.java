package study.practice.practice32;

import java.util.ArrayList;
import java.util.List;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//student 정보 가져와~
		//그거 가져와서 한번 출력~ 
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list1 = studentDAO.findStudentList(); //전체 학생정보
		
		System.out.println("*********전체 리스트 *************");
		for(StudentDTO s : list1) {
			System.out.println(s);
			
			//System.out.println((ConvertDateUtil.convertLocalDateTimeToString(s.getBrithday())));
			//LocalDateTime  yyyy-mm-dd
		}
		
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(3); //3학년 학생정보
		
		
		System.out.println("*********3학년 리스트 *************");
		for(StudentDTO s : list2) {
			System.out.println(s);
		}
		
		List<StudentDTO> saveList = new ArrayList<StudentDTO>();
		saveList.add(new StudentDTO(23, "김종범", "김종범2", 1, "9206150000000", "2000-05-31", "123222-2222", 20, 20, 20, 20, 20));
		
		int count = 0;
		for(StudentDTO s : saveList) {
			int result = studentDAO.saveStudent(s);
			count += result;
			if(result > 0) 
				System.out.println("저장 잘됨");
		}
		System.out.println("총 " + count + "개 저장됨");
	}

}
