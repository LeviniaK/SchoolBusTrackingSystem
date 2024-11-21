package src;

import java.util.List;

public class Route {
    private List<String> stops;
    private List<Double> distances;

    public Route(List<String> stops, List<Double> distances) {
        this.stops = stops;
        this.distances = distances;
    }

    public String getStop(int index) {
        return stops.get(index);
    }

    public double getDistanceToStop(int index) {
        return distances.get(index);
    }

    public int getStopsCount() {
        return stops.size();
    }
}

