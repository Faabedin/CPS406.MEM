package LoginSort;

import java.util.LinkedList;

public class coach {
	/*
	 * 
	 */
	private String name, className;
	private Member member;
	private Lesson lesson;
	private LinkedList MemberList;
	private LinkedList NotPaidList;
	private LinkedList lessonList;


	public coach(){};
	
	public coach(String name, String className){
		this.name = name;
		this.className = className;
		MemberList = new LinkedList();
		//lesson = new Lesson();
	}
	public void addMember(String name, String phoneNumber, boolean paid, String address){
		member = new Member(name,phoneNumber,paid,address);
		MemberList.add(member);
		
		if (!member.isPaid()){
			NotPaidList.add(member);
		}
	}
	public void scheduleClass(int month, int date, int time, String message){
		lesson = new Lesson(month, date, time, message);
		lessonList.add(lesson);
		
	}
	public void cancelClass(int month, int date, int time, String message){
		
	}

	
}
