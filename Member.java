/**
 * Creates a Member  
 *
 * Generic member
 *
 * @author Rehan Hajee
 */

public class Member {
    String name, phoneNumber, address;
    int timesAttended;
    boolean paid;

    public Member() {
        name = "";
        phoneNumber = "";
        address = "";
        timesAttended = 0;
        paid = false;
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

    public int getTimesAttended() {
        return timesAttended;
    }

    @Override
    public String toString() {
        return "Hello World!";
    }

}