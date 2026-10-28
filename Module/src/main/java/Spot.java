import java.util.Random;

public record Spot(String Name, Double Latitude, Double Longitude) {
    /** Generates a random name, a longitude as a random double from -180 to 180, and a latitude as a number between -90 and 90 */
    public static Spot randomSpot(){
//        String fourLetter = new Random().ints(97, 123).limit(4).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//        Double lat = new Random().ints(-1,1);
//        return new Spot(fourLetter, );
    }
}
