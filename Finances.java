import java.util.*;

public class Finances {
	
	private static ArrayList<Member> allMembers;
	private static ArrayList<Member> unpaidMembers;
	private float discount = 10;
	
	// Number of meetings attended in a row until the member is eligible for a one time discount
	private static int attendenceForDiscount = 12;
	
	public static void main (String[] args) {
		allMembers = new ArrayList<Member>();
		PopulateList(allMembers);
		sortMemberAttendence(allMembers);
		System.out.println(allMembers.toString());
	}
	
	// Test method, remove when class is finished
	private static void PopulateList(ArrayList<Member> allMembers) {
		Member m = new Member();
		Member n = new Member();
		Member o = new Member();
		Member p = new Member();
		Member q = new Member();
		m.setTimesAttended(5);
		n.setTimesAttended(8);
		o.setTimesAttended(2);
		p.setTimesAttended(12);
		q.setTimesAttended(7);
		allMembers.add(m);
		allMembers.add(n);
		allMembers.add(o);
		allMembers.add(p);
		allMembers.add(q);
	}
	
	// Sort list in descending order by number of times attended
	private static void sortMemberAttendence(ArrayList<Member> allMembers) {
		Collections.sort(allMembers, Collections.reverseOrder());
	}
	
	// Get all members who have attended more than they have paid
	// If they have attended more than they have paid, or if an instance of them not paying has been recorded, add them
	// TODO how is timesNotPaid determined? if its unnecessary we should remove it
	private static void getUnpaidMembers(ArrayList<Member> allMembers) {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getTimesAttended() > allMembers.get(i).getTimesPaid() || allMembers.get(i).getTimesNotPaid() > 0) {
				unpaidMembers.add(allMembers.get(i));
			}
			
		}
	}
	
	// Get consecutive discount
	private static void getConsecutiveAttenceMembers() {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getConsecutiveAttended() > attendenceForDiscount) {
				// Reset consecutive attendance
				allMembers.get(i).setConsecutiveAttended(0);
				// Award discount
				allMembers.get(i).incrementDiscountsAwarded(1);
			}
			
		}
	}
}
