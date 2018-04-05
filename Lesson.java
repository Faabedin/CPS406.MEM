class Lesson {
    private String message;
    private int month, date, year;

    public Lesson(int month, int date, int year, String message) {
        this.message = message;
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMessage() {
        return message;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
