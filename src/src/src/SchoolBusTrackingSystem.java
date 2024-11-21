package src;

import java.util.ArrayList;
import java.util.List;

public class SchoolBusTrackingSystem {

    public static void main(String[] args) {
        // Define stops and distances
        List<String> stops = new ArrayList<>();
        stops.add("School");            // Starting point
        stops.add("Gulf Residency");    // First drop-off
        stops.add("Serene Gardens");    // Second drop-off
        stops.add("Siaya Park");        // Third drop-off

        List<Double> distances = new ArrayList<>();
        distances.add(0.0);             // School to itself
        distances.add(1.0);             // School to Gulf Residency
        distances.add(1.5);             // Gulf Residency to Serene Gardens
        distances.add(0.5);             // Serene Gardens to Siaya Park

      
        Route route = new Route(stops, distances);

        Bus bus = new Bus(1, "James Maluki", route);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Levinia", "Gulf Residency"));
        students.add(new Student(2, "Nakirinda", "Serene Gardens"));
        students.add(new Student(3, "Kalekye", "Siaya Park"));

       
        bus.assignStudents(students);
        
        bus.startRoute();
    }
}
