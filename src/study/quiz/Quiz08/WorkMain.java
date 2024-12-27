package study.quiz.Quiz08;

import java.util.ArrayList;
import java.util.List;

import study.practice.practice27.Room;

public class WorkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WorkCompany workCompany = new WorkCompany();
		
		workCompany.monthList = new ArrayList<WorkMonth>();
		
		//일별추가
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		workCompany.monthList.add(new WorkDay());
		
	}

}
