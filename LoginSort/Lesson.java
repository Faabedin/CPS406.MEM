package LoginSort;

public class Lesson {
	private int month;
	private int date;
	private int time;
	private String message;

	public Lesson(){
		month = 1;
		date = 1;
		time = 400;
		message = "";
		
	};
	public Lesson(int month, int date, int time, String message){
		this.month = month;
		this.date = date;
		this.time = time;
		this.message = message;	
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Lesson [month=" + month + ", date=" + date + ", time=" + time + ", message=" + message + "]";
		}
	
	
	public boolean equals(Lesson other) {
		if(this.month == other.month &&
			this.date == other.date  &&
			this.time == other.time){
			return true;
		}
		return false;
	}
	
}
