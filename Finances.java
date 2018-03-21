import java.util.*;

public class Finances {
	
	private static ArrayList<Member> allMembers;
	private static ArrayList<Member> unpaidMembers;
	
	public static void main (String[] args) {
		allMembers = new ArrayList<Member>();
		PopulateList(allMembers);
		SortMemberAttendence(allMembers);
		System.out.println(allMembers.toString());
	}
	
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
	private static void SortMemberAttendence(ArrayList<Member> allMembers) {
		Collections.sort(allMembers, Collections.reverseOrder());
	}
	
	// Get all members who have attended more than they have paid
	private static void SortMemberPay(ArrayList<Member> allMembers) {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getTimesAttended() > allMembers.get(i).getTimesPaid()) {
				unpaidMembers.add(allMembers.get(i));
			}
			
		}
	}
}
