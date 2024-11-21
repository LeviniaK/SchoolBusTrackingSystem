package src;

public class Student {
    private String name;
    private String stopName;

    public Student(int id, String name, String stopName) {
        this.name = name;
        this.stopName = stopName;
    }

    public String getName() {
        return name;
    }

    public String getStopName() {
        return stopName;
    }
}

