package domain;


public class Address {
    public Address(String addressLine, String email) {
        this.addressLine = addressLine;
        this.email = email;
    }

    private String addressLine;
    private  String email;

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine='" + addressLine + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
