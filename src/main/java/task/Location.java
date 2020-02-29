package task;

public class Location {
    private static long counter = 1;
    private final long ID;
    private String city;
    private String zipCode;
    private String street;
    private String streetNo;

    public Location(String city, String zipCode, String street, String streetNo) {
        this.ID = counter++;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.streetNo = streetNo;
    }


    public long getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNo() {
        return streetNo;
    }
    @Override
    public String toString() {
        return "Location{" +
                "ID=" + ID +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", streetNo='" + streetNo + '\'' +
                '}';
    }
}
