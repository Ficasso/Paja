package Data;

import Data.Event;

import java.util.Scanner;

public class File {
    public void info (){
        int option = 1;
        do {
            System.out.println("Calendar");
            System.out.println("Pick a option: ");
            System.out.println("0 - exit the app");
            System.out.println("1 - add event");
            System.out.println("2 - add reminder to event");
            System.out.println("3 - delete event");
            System.out.println("4 - show all saved events");

            Event event = new Event();
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose an option: ");
            option = sc.nextInt();
            System.out.println();

            if (option == 0) {
                System.out.println("Closing Calendar");
            } else if (option == 1) {
                event.addEvent();
            } else if (option == 2) {
                event.addReminder();
            }else if (option == 3){
                event.deleteEvent();
            }else if ( option == 4 ){
                event.eventList(event.getEvents());
            }
        }while(option != 0);
    }

}
