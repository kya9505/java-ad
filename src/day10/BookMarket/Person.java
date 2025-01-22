package BookMarket;

public class Person {
    private String name;
    private int phone;
    private String address;

    public Person(String address, int phone, String name) {
        this.address = address;
        this.phone = phone;
        this.name = name;
    }

    public Person(String name, int phone){
        this.name = name;
        this.phone =phone;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
