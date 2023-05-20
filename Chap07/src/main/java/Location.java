public class Location {
    private int lat, lng;
    private String city;

    public Location(String city, int lat, int lng) {
        this.city = city;
        this.lat = lat;
        this.lng = lng;
    }

    public String getCity() {
        return city;
    }

    public int getLat() {
        return lat;
    }

    public int getLng() {
        return lng;
    }
}
