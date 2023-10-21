package App;

import Data.Event;
import Data.Job;
import Data.Running;

public class Calendar {
    public static void main(String[] args) {
        Event event = new Event();
        event.addEvent("Parapetówka","21.10.23", "19:00 ","ul. Orlińskiego");
        event.printInfo();
        event.addReminder();

        Running run= new Running("Running","21.10.23","16:00","Park Lotników", 3,20);
        run.printInfo();

        Event job = new Job("Work", "24.10.23", "8:00","Pcim","Day",20);
        job.printInfo();




    }
}
