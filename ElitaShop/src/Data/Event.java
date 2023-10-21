package Data;

public class Event {
    private String name;
    private String date;
    private String time;
    private String place;

    public void addEvent (String name, String date, String time, String place){
        this.name = name;
        this.date = date;
        this.time = time;
        this.place = place;
    }
    public void deleteEvent(){
        System.out.println("Deleting event " + name);
    }
    public void addReminder (){
        System.out.println("Setting reminder to " + name +"\n");
    }


    public void printInfo (){
        System.out.println(
                "Event: " + getName() +"\n"+
                "Date: " + getDate() + "\n" +
                "Time: " + getTime() + "\n" +
                "Place: " + getPlace()+ "\n");
    }

public Event (){};

    public Event(String name, String date, String time, String place) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
