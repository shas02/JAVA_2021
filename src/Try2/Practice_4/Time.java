package Try2.Practice_4;

public class Time {
    private int hours;
    private int min;


    public Time() {
    }

    public Time(int hours, int min) {
        if (min < 0 || min > 59 || hours < 0 || hours > 23) {
            System.out.println("Wrong input time");
            return;
        }
        this.hours = hours;
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59) {
            System.out.println("Wrong input time");
            return;
        }
        this.min = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            System.out.println("Wrong input time");
            return;
        }
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", min=" + min +
                '}';
    }
}
