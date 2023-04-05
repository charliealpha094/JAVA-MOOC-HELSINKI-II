
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object object) {
        // if the variables are located in the same place, they are the same
        if(this == object) {
            return true;
        }
        
        // if object is not of type LicensePlate, the objects aren't the same
        if(!(object instanceof LicensePlate)) {
            return false;
        }
        
        // Convert the object to a LicensePlate object
        LicensePlate comparedPlate = (LicensePlate) object;
        
        // if the instance variables of the objects are the same, so are the objects
        if(this.liNumber.equals(comparedPlate.liNumber) 
                && this.country.equals(comparedPlate.country)) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }

}
