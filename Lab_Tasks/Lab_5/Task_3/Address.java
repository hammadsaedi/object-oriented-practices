package Lab_Tasks.Lab_5.Task_3;

import java.util.Objects;

public class Address {
    private int houseNo;
    private int street;
    private String city;

    public Address(){
        this(0, 0, new String());
    }

    public Address(Address obj){
        this(obj.houseNo, obj.street, obj.city);
    }

    public Address(int houseNo, int street, String city) {
        if (Objects.isNull(city)) throw new NullPointerException();
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
    }

    public int getHouseNo() {
        return houseNo;
    }
    
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    
    public int getStreet() {
        return street;
    }
    
    public void setStreet(int street) {
        this.street = street;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        if (Objects.nonNull(city))
            this.city = city;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (houseNo != other.houseNo)
            return false;
        if (street != other.street)
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [House No.: " + houseNo + ", Street: " + street + ", City: " + city + "]";
    }  
}
