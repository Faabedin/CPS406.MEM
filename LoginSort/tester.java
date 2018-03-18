package LoginSort;

public class tester {

	public static void main(String[] args) {
		coach CoachMarla = new coach("lisa","pilates");
		CoachMarla.addMember("rehan","0001114444",false, "27 Dundas Road");
		CoachMarla.addMember("faiza","0001114222",true, "27 hogwarts Street");
		CoachMarla.scheduleLesson(03,23,2018, "Salsa-pilates");
		CoachMarla.cancelLesson(03,23,2018, "I am Sick");
		
	}

}
