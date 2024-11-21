package src;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int busNumber;
    private String driverName;
    private Route route;
    private List<Student> students;  // Initialize this list

    public Bus(int busNumber, String driverName, Route route) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.route = route;
        this.students = new ArrayList<>();  // Initialize the student list here
    }

    public void startRoute() {
        System.out.println("Bus Number: " + busNumber + ", Driver: " + driverName);
        System.out.println("Starting route from: " + route.getStop(0));

        // Loop through the stops and check if students need to be dropped off
        for (int i = 1; i < route.getStopsCount(); i++) {
            String stopName = route.getStop(i);
            double distance = route.getDistanceToStop(i);

            System.out.println("Bus traveled " + distance + " km to reach " + stopName + ".");

            // Check if any students are assigned to this stop and should be dropped off
            List<Student> droppedStudents = new ArrayList<>();
            for (Student student : students) {
                if (student.getStopName().equals(stopName)) {
                    System.out.println("Notification: Hello Parent, your child " + student.getName() + " has arrived at " + stopName + ".");
                    System.out.println("SMS sent to " + student.getName() + "'s parent: 'Your child has safely arrived at " + stopName + ".'");
                    droppedStudents.add(student);
                }
            }
            students.removeAll(droppedStudents);  // Remove dropped students from the list
        }
        System.out.println("Route completed.");
    }

    // Method to assign students to the bus
    public void assignStudents(List<Student> students) {
        this.students.addAll(students);  // Add all students to the bus
    }
}
