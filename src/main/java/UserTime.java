public class UserTime {
    int hour;
    int minute;
    String timeOfDay;

    public UserTime(int hour, int minute, String timeOfDay) {
        this.hour = hour;
        this.minute = minute;
        this.timeOfDay = timeOfDay;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
}
