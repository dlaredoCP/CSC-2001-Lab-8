import java.util.Random;

public record Spot(String Name, double Latitude, double Longitude) {
    /** Generates a random name, a longitude as a random double from -180 to 180, and a latitude as a number between -90 and 90 */
    public static Spot randomSpot(){
        return new Spot(new Random().ints(97, 123).limit(4).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString(), new Random().doubles(-180, 180).findFirst().getAsDouble(), Math.asin(new Random().doubles(-1, 1).findFirst().getAsDouble()));
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
}
