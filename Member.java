/**
 * This makes a member- with a name, address, whether they have paid or not, and timesAttended 
 */

public class Member implements Comparable<Member> {
	private String name, phoneNumber, address;
	private int timesAttended, timesPaid, timesNotPaid, consecutiveAttended, discountsAwarded; 
	private boolean paid;

    public Member() {
        name = "";
        phoneNumber = "";
        address = "";
        timesAttended = 0;
        consecutiveAttended = 0;
        paid = false;
        discountsAwarded = 0;
    }

    public Member(String name, String phoneNumber, boolean paid, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.paid = paid;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTimesAttended(int timesAttended) {
        this.timesAttended = timesAttended;
    }
    
    public void setConsecutiveAttended(int consecutiveAttended) {
    	this.consecutiveAttended = consecutiveAttended;
    }
    
    public void setTimesNotPaid(int timesNotPaid) {
		this.timesNotPaid = timesNotPaid;
    }
	
    public void setTimesPaid(int timesPaid) {
        this.timesPaid = timesPaid;
    }
    
    public void setDiscountsAwarded(int discountsAwarded) {
    	this.discountsAwarded = discountsAwarded;
    }
	
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isPaid() {
        return paid;
    }
    
    public int getDiscountsAwarded() {
    	return discountsAwarded;
    }

    public int getTimesAttended() {
        return timesAttended;
    }
    
    public int getConsecutiveAttended() {
    	return consecutiveAttended;
    }
    
    public int getTimesNotPaid() {
	return timesNotPaid;
    }
	
    public int getTimesPaid() {
        return timesPaid;
    }

/*
    @Override
    public String toString() {
        return Integer.toString(timesAttended);
    }
    */
    
    // Compare times attended between members
    @Override
    public int compareTo(Member otherMember) {
    	int timesOtherAttended = otherMember.getTimesAttended();
    	return this.timesAttended < timesOtherAttended ? -1 
    		 : this.timesAttended > timesOtherAttended ? 1
    		 : 0;
    	// Simpler but worse performance
    	// TODO test the performance between these algorithms
    	//return Integer.compare(this.timesAttended, otherMember.getTimesAttended());
    }
}
