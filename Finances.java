import java.util.*;

public class Finances {
	
	private ArrayList<Member> allMembers;
	private ArrayList<Member> unpaidMembers;
	// Actual discount proportion, to be calculated as multiple of original cost
	private float discount = 0.9f;
	// Number of meetings attended in a row until the member is eligible for a one time discount
	private int attendenceForDiscount = 12;
	// Number of people awarded loyalty discount
	private final int LOYALTY_DISCOUNT = 10;
	
	// Test method, remove when necessary
	public static void main (String[] args) {
		allMembers = new ArrayList<Member>();
		PopulateList(allMembers);
		System.out.println(allMembers.toString());
	}
	
	// Test method, remove when necessary
	private static void PopulateList(ArrayList<Member> allMembers) {
		Member memberArray[] = new Member[14];
		String memberName[] = {"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int memberTimesAttended[] = {5, 8, 2, 12, 7, 4, 3, 9, 8, 11, 12, 10, 6, 5};
		
		for (int i = 0; i < memberArray.length;i++) {
			memberArray[i] = new Member();
			memberArray.setName(memberName[i]);
			memberArray[i].setTimesAttended(memberTimesAttended[i]);
		}
		allMembers.add(memberArray);
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
	private static void consecutiveAward(ArrayList<Member> allMembers) {
		for (int i = 0; i < allMembers.size(); i++) {
			if (allMembers.get(i).getConsecutiveAttended() > attendenceForDiscount) {
				// Reset consecutive attendance
				allMembers.get(i).setConsecutiveAttended(0);
				// Award discount
				allMembers.get(i).incrementDiscountsAwarded(1);
			}
		}
	}
	
	// Get loyalty discount
	private static void loyaltyAward(ArrayList<Member> allMembers) {
		//Collections.sort(allMembers, Collections.reverseOrder());
		Collections.sort(attended, new CompareTimesAttended());
		//int count = loyaltyDiscountPeople;
		for (int i = 0; i < LOYALTY_DISCOUNT; i++) {
			// Account for people who attend the same number of times
			if (i > 1 && allMembers.get(i).getTimesAttended() == allMembers.get(i-1).getTimesAttended()) {
				count++;
			}
			allMembers.get(i).incrementDiscountsAwarded(1);
		}
	}
}
