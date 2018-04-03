import java.util.*;

public class Finances {
	
	private static ArrayList<Member> allMembers;
	private static ArrayList<Member> unpaidMembers;
	// Actual discount proportion, to be calculated as multiple of original cost
	private float discount = 0.9f;
	// Number of meetings attended in a row until the member is eligible for a one time discount
	private static int attendenceForDiscount = 12;
	// Number of people awarded loyalty discount
	private static int loyaltyDiscountPeople = 10;
	
	// Test method, remove when necessary
	public static void main (String[] args) {
		allMembers = new ArrayList<Member>();
		PopulateList(allMembers);
		System.out.println(allMembers.toString());
	}
	
	// Test method, remove when necessary
	private static void PopulateList(ArrayList<Member> allMembers) {
		Member m = new Member();
		Member n = new Member();
		Member o = new Member();
		Member p = new Member();
		Member q = new Member();
		Member r = new Member();
		Member s = new Member();
		Member t = new Member();
		Member u = new Member();
		Member v = new Member();
		Member w = new Member();
		Member x = new Member();
		Member y = new Member();
		Member z = new Member();
		m.setTimesAttended(5);
		n.setTimesAttended(8);
		o.setTimesAttended(2);
		p.setTimesAttended(12);
		q.setTimesAttended(7);
		r.setTimesAttended(4);
		s.setTimesAttended(3);
		t.setTimesAttended(9);
		u.setTimesAttended(8);
		v.setTimesAttended(11);
		w.setTimesAttended(12);
		x.setTimesAttended(10);
		y.setTimesAttended(6);
		z.setTimesAttended(5);
		allMembers.add(m);
		allMembers.add(n);
		allMembers.add(o);
		allMembers.add(p);
		allMembers.add(q);
		allMembers.add(r);
		allMembers.add(s);
		allMembers.add(t);
		allMembers.add(u);
		allMembers.add(v);
		allMembers.add(w);
		allMembers.add(x);
		allMembers.add(y);
		allMembers.add(z);
		
	}
	
	// Get all members who have attended more than they have paid
	// If they have attended more than they have paid, or if an instance of them not paying has been recorded, add them
	private static void getUnpaidMembers(ArrayList<Member> allMembers) {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getTimesAttended() > allMembers.get(i).getTimesPaid()) {
				unpaidMembers.add(allMembers.get(i));
			}	
		}
	}
	
	// Get consecutive discount
	private static void consecutiveAward(ArrayList<Member> allMembers) {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getConsecutiveAttended() > attendenceForDiscount) {
				// Reset consecutive attendance
				allMembers.get(i).setConsecutiveAttended(0);
				// Award discount
				allMembers.get(i).setDiscountsAwarded(allMembers.get(i).getDiscountsAwarded() + 1);
			}
		}
	}
	
	// Get loyalty discount
	private static void loyaltyAward(ArrayList<Member> allMembers) {
		Collections.sort(allMembers, Collections.reverseOrder());
		int count = loyaltyDiscountPeople;
		for (int i = 0; i < count; i++) {
			// Account for people who attend the same number of times
			if (i > 1 && allMembers.get(i).getTimesAttended() == allMembers.get(i-1).getTimesAttended()) {
				count++;
			}
			allMembers.get(i).setDiscountsAwarded(allMembers.get(i).getDiscountsAwarded() + 1);
		}
	}
	
	// Handle when a member arrives
	public void MemberAttending(Member member, boolean paid) {
		if (paid) {
			member.setTimesPaid(member.getTimesPaid() + 1);
			member.setConsecutiveAttended(member.getConsecutiveAttended() + 1);
		}
		member.setTimesAttended(member.getTimesAttended() + 1);
	}
	
	
}
