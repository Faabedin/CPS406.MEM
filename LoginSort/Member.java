package LoginSort;

import java.util.LinkedList;
import java.util.Stack;

import javax.sound.midi.MidiDevice.Info;

public class Member {
	private String name;
	private int attendance;
	private String paymentMethod;
	private LinkedList memStack =  new LinkedList();
	
	public Member(){};
	
	public Member(String name, int attendance, String paymentMethod){
		this.name = name;
		this.attendance = attendance;
		this.paymentMethod = paymentMethod;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String toString(){
		return name +" " + attendance +" "+ paymentMethod +"\n"  ;
	}

}

