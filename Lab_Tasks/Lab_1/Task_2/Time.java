package Task_2;

public class Time {
    public int hour;
    public int minutes;
    public int second;
    public int date;
    public int month;
    public int year;

    
    public Time(int hour, int minutes, int second, int date, int month, int year) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // DD:MM:YYYY HH:MM:SS
    public String toString() {
        return date + ":" + month + ":" + year + "  " + hour + ":" + minutes + ":" + second;
    }
}
