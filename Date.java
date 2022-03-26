package project;

public class Date {
    private int day;
    private int month;
    private int year;
    private String dateString;

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String getDate() {
        return this.dateString;
    }

    public Date(int day, int month, int year) {
        boolean flag = true;
        // if leap year?
        if ((month > 0 && month < 13 && day < 32 && day > 0) && (year % 4 == 0 || year % 400 == 0) && month == 2 && day > 29)
            flag = false;

        if (flag) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.dateString = day + "/" + month + "/" + year;
        }
    }
}
