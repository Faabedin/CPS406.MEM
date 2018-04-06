import java.util.ArrayList;

/**
 *
 *
 */

public class Coach {
	
	private String name;
	private Member member;
	private Lesson lesson;
	private ArrayList memberList;
	private ArrayList notPaidList;
	private ArrayList lessonList; //Might be moved to another class
	
	public Coach(String name){
		this.name = name;
		memberList = new ArrayList<>();
		notPaidList = new ArrayList<>();
		lessonList = new ArrayList<>();
	}
	public void addMember(String name, String phoneNumber, boolean paid, String address){
		member = new Member(name, phoneNumber, paid, address);
		MemberList.add(member);
		if (!paid) notPaidList.add(member);
	}
	public void scheduleLesson(String name, int month, int date, int year, String message){
		lessonList.add(new Lesson(month, date, year, message);
	}
	public void cancelClass(int month, int date, int year, String message ){
		if (lessonList.contains(new Lesson(month, date, year, message))) 
			lessonList.remove(new Lesson(month, date, year, message));
	}
}
