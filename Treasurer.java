import java.util.LinkedList;
import java.util.ArrayList;

/**
 * 	incomestatement - revenue(member payment ) + expense(coach’s payments, hall expenses) 
 *member payment - (length of members - length of notPaid list) * (monthly payment amount) 
 */
public class Treasurer {
	int memberPayment,revenue;
	int coachPayment,hallExpense,expense;
	//int netIncome;
	//Linkedlist<int> ll;
	ArrayList<Integer> ll;


	public Treasurer(){
		memberPayment = 3000;// memberList.length() - memberNotPaidList.length()
 		coachPayment = 600;
		hallExpense = 1500;
		revenue = memberPayment;
		expense = coachPayment + hallExpense;
		//netIncome = revenue - expense;
		//ll = new Linkedlist<int>();
		ll = new ArrayList<>();
	}
	
	public void setMemberPayment(int memberPayment) {
		this.memberPayment = memberPayment;
	}
	
	public void setCoachPayment(int coachPayment) {
		this.coachPayment = coachPayment;
	}
	
	public void setHallExpense(int hallExpense) {
		this.hallExpense = hallExpense;
	}
	
	public void setExpense(int expense) {
		this.expense = expense;
	}
	
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	public int getMemberPayment() {
		return memberPayment;
	}

	public int getCoachPayment() {
		return coachPayment;
	}

	public int getHallExpense() {
		return hallExpense;
	}

	public int getRevenue() {
		return revenue;
	}

	public int getExpense() {
		return expense;
	}


	public String incomeStatement(){
		int totalExpenses = coachPayment + hallExpense;
		int profit = revenue - totalExpenses;
		return "INCOME STATEMENT "+ "\n"+
				"Revenues" + "\n" +
				"\t" + "Member Payment" + "\t\t$" + memberPayment + "\n" + 
				"Operating Expenses" + "\n" +
				"\t" + "Coach Payment" + "\t$" + coachPayment + "\n" +
				"\t" + "Hall Expense" + "\t$" + hallExpense + "\n" +
				"Total operating Expense" + "\t\t$" + totalExpenses + "\n" + 
				"Profit" + "\t\t\t\t$" + profit;
	}
}

