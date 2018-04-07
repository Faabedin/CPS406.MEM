import java.util.ArrayList;

public class Member implements Comparable<Member> {
    	private String name, phoneNumber, address;
    	private int timesAttended, timesPaid, consecutiveAttended, discountsAwarded; 
    	private boolean paid;
    
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
                
                public int getTimesPaid() {
                    return timesPaid;
                }
                
                @Override
                public int compareTo(Member otherMember) {
                	return Integer.compare(this.timesAttended, otherMember.getTimesAttended());
                }
            }