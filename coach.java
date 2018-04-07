import java.lang.reflect.Member;
import java.util.ArrayList;

class Coach {
	
	private String name;
	private Member member;
	private Lesson lesson;
	private ArrayList memberList;
	private ArrayList notPaidList;
	private ArrayList lessonList; //Might be moved to another class
	
	Coach(String name){
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
	public void removeMember(String name, String phoneNumber, boolean paid, String address){
		        mem = new Member(name, phoneNumber,paid,address);
		        if(memberList.contains(mem)) {
		            memberList.remove(mem);
				previosMembers.add(mem);
				}
		    }
	public void scheduleLesson(String name, int month, int date, int year, String message){
		lessonList.add(new Lesson(month, date, year, message);
	}
	public void cancelClass(String name, int month, int date, int year, String message ){
		if (lessonList.contains(new Lesson(name, month, date, year, message))) 
			lessonList.remove(new Lesson(name, month, date, year, message));
	}
}
