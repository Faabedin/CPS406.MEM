package LoginSort;

import java.util.LinkedList;

public class coach {
	/*
	 * 
	 */
	private String name, className;
	private Member member;
	private Lesson lesson;
	private Lesson lesson2;
	private LinkedList MemberList;
	private LinkedList NotPaidList;
	private LinkedList lessonList;


	public coach(){};
	
	public coach(String name, String className){
		this.name = name;
		this.className = className;
		MemberList = new LinkedList();
		NotPaidList = new LinkedList();
		lessonList = new LinkedList();
		lesson = new Lesson();
		lesson2 = new Lesson();
	}
	public void addMember(String name, String phoneNumber, boolean paid, String address){
		member = new Member(name,phoneNumber,paid,address);
		
		MemberList.add(member);
		
		if (member.paid == false){
			NotPaidList.add(member);
		}
		
	}
	public void scheduleLesson(int month, int date, int time, String message){
		lesson = new Lesson(month, date, time, message);
		lessonList.add(lesson);
		
	}
	public void cancelLesson(int month, int date, int time, String message){
		lesson2 = new Lesson(month,date,time,message);
		if(lesson.equals(lesson2)){
			lessonList.remove(lesson2);
		};
	}
	
}
