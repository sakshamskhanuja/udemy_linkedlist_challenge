/**
 * Stores the name of the place and distance between it and "Sydney".
 */
public class Place {

    /**
     * Stores the name of the place.
     */
    private final String town;

    /**
     * Stores the distance between the place and "Sydney".
     */
    private final int distance;

    public Place(String town, int distance) {
        this.town = town;
        this.distance = distance;
    }

    public String getTown() {
        return town;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Place: " + town + ", Distance: " + distance;
    }
}