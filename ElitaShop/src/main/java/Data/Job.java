package main.java.Data;

public class Job extends Event {
    private String shift;
    private int hourPrice;
    public Job(String name, String date, String time, String place, String shift, int hourPrice) {
        super(name, date, time, place);
        this.shift = shift;
        this.hourPrice = hourPrice;
    }

    public void printInfo (){
        System.out.println(
                "Event: " + getName() +"\n"+
                        "Date: " + getDate() + "\n" +
                        "Time: " + getTime() + "\n" +
                        "Place: " + getPlace() + "\n"+
                        "Which shift: " + shift + "\n" +
                        "Hour price: " + hourPrice+ "zł/h\n");
    }




}
