

import java.util.LinkedList;
import java.util.ArrayList;


/**
 * 	incomestatement - revenue(member payment ) + expense(coach’s payments, hall expenses) 
 *member payment - (length of members - length of notPaid list) * (monthly payment amount) 
 */
public class Treasurer {
	int memberPayment,revenue;
	int coachPayment,hallExpense,expense;
	int netIncome, monthlyPayment;
	Coach coach;
	Arraylist coachList;
	ArrayList<Integer> ll;


	public Treasurer(){
 		coachPayment = 600;
		hallExpense = 1500;
		monthlyPayment = 60; 
		revenue = memberPayment;
		expense = coachPayment + hallExpense;
		netIncome = revenue - expense;
		ll = new ArrayList<>();
	}
	
	public int getMemberPayment(String name) {
		for(i=0;i<coachList.length();i++){
			if(coachList.get(i).getName().equals(name)){
				coachList.get(i).memberPaid()* monthlyPayment;
			}
		}
	}

	public void setMemberPayment(int memberPayment) {
		this.memberPayment = memberPayment;
	}

	public int getCoachPayment() {
		return coachPayment;
	}

	public void setCoachPayment(int coachPayment) {
		this.coachPayment = coachPayment;
	}

	public int getHallExpense() {
		return hallExpense;
	}

	public void setHallExpense(int hallExpense) {
		this.hallExpense = hallExpense;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}
	
	public int getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(int netIncome) {
		this.netIncome = netIncome;
	}
	public void createCoach(String name){
		Coach coach = new Coach(name);
		coachList.add(coach);
	}
	public void removeCoach(String name){
		Coach coach = new Coach(name);
		if(coachList.contains(coach)){
			coachList.remove(coach)
		}
	}

	public String incomeStatement(){
		ll.toString();
		return "INCOME STATEMENT "+ '\n'+
				"Revenue:" + '\n' +
				'\t' + "Member Payment: " + '\t' + memberPayment + '\n' + 
				"Expenses:" + '\n' +
				'\t' + "Coach Payment: " + '\t' + coachPayment + '\n' +
				'\t' + "Hall Expense: " +'\t' + hallExpense + '\n' +
				 '\n' +
				"Net Income" +'\t' + '\t' + netIncome;
	}
	
}
