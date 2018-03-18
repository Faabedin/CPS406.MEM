package LoginSort;

/*this makes a member- with a name, address, paid or not, and timesAttended */

import java.util.LinkedList;
import java.util.Stack;

import javax.sound.midi.MidiDevice.Info;

public class Member {
    String name, phoneNumber, address;
    int timesAttended, timesNotPaid; 
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
    
    public void setTimesNotPaid(int timesNotPaid) {
		this.timesNotPaid = timesNotPaid;
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
    
    public int getTimesNotPaid() {
		return timesNotPaid;
	}


    @Override
    public String toString() {
        return "Hello World!";
    }

}