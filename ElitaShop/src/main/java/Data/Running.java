package main.java.Data;

public class Running extends Event {
    private int distance;
    private int duration;

    public void printInfo (){
        System.out.println(
                "Event: " + getName() +"\n"+
                        "Date: " + getDate() + "\n" +
                        "Time: " + getTime() + "\n" +
                        "Place: " + getPlace() + "\n" +
                        "Distance: " + getDistance() + "km\n" +
                        "Duration: " + getDuration()+ "minutes\n");

    }



    public Running(String name, String date, String time, String place, int distance, int duration) {
        super(name, date, time, place);
        this.distance = distance;
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
