import java.util.Random;

public record Spot(String Name, double Latitude, double Longitude) implements Comparable<Spot> {
    /** Generates a random name, a longitude as a random double from -180 to 180, and a latitude as a number between -90 and 90 */
    public static Spot randomSpot() {
        Random rand = new Random();
        String name = rand.ints(97, 123).limit(4).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        double latitude = Math.asin(rand.nextDouble(-1, 1)) * (180/Math.PI);
        double longitude = rand.nextDouble(-180, 180);
        return new Spot(name, latitude, longitude);
    }

    /** Returns either -1, 0, or -1, depending on whether the other spot’s longitude is less than, equal to, or greater than the current spot */
    public int compareTo(Spot spot){
        if (this.Longitude>spot.Longitude){
            return 1;
        } else
        if (this.Longitude<spot.Longitude){
            return -1;
        } else {
            return 0;
        }
    }

    /** Accepts a binary search tree and a longitude, and returns the spot in the tree that is closest to the given longitude without going over */
    public static Spot greatestLowerBound(bst<Spot> tree, Double longVal){
        Spot closest = null;
        bst<Spot> current = tree;
        while (current != null) {
            Spot value = current.value();

            if (value.Longitude==longVal) {
                return value;
            }
            else if (value.Longitude>longVal) {
                current = current.left();
            }
            else {
                closest = current.value();
                current = current.right();
            }
        }
        return closest;
    }
}
