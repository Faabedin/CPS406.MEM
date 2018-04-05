import java.util.ArrayList;

public class Coach {
	/*
	 * 
	 */
	private String name, className;
	private Member member;
	private Lesson lesson;
	private ArrayList MemberList;
	private ArrayList NotPaidList;
	private ArrayList lessonList; //Might be moved to another class

	//public Coach(){};
	
	public Coach(String name, String className){
		this.name = name;
		this.className = className;
		MemberList = new LinkedList();
	}
	public void addMember(String name, String phoneNumber, boolean paid, String address){
		member = new Member(name,phoneNumber,paid,address);
		MemberList.add(member);
		
		if (!member.isPaid()){
			NotPaidList.add(member);
		}
	}
	public void scheduleLesson(int month, int date, int year, String message){
		// TODO implement Lesson
		// lesson = new Lesson(month,date,year,message);
		//lessonList.add(lesson);
		lessonList.add(new Lesson(month, date, year, message);
	}
	public void cancelClass(int month, int date, int year, String message ){
		if (lessonList.contains(new Lesson(month, date, year, message))) 
			lessonList.remove(new Lesson(month, date, year, message));
	}
	
}
