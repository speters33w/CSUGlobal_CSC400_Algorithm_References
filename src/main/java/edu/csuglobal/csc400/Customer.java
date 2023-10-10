package edu.csuglobal.csc400;

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String creditCardNumber;
    private String creditCardExpiration;
    private String creditCardCVV;
    private String creditCardType;
    private String creditCardName;
    private String creditCardZipCode;

    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email,
                "Undefined", "Undefined", null,
                "Undefined", "Undefined", "Undefined");
    }

    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email, String creditCardNumber, String creditCardExpiration,
                    String creditCardType, String creditCardName, String creditCardZipCode) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email, creditCardNumber,
                creditCardExpiration, null, creditCardType, creditCardName, creditCardZipCode);
    }

    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email, String creditCardNumber, String creditCardExpiration,
                    String creditCardCVV, String creditCardType, String creditCardName, String creditCardZipCode) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiration = creditCardExpiration;
        this.creditCardCVV = creditCardCVV;
        this.creditCardType = creditCardType;
        this.creditCardName = creditCardName;
        this.creditCardZipCode = creditCardZipCode;
    }

}
