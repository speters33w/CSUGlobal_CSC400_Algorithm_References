package edu.csuglobal.csc400;

/**
 * This class represents a customer in the system.
 */
public class Customer {
    /**
     * The unique ID of the customer.
     */
    private String customerID;

    /**
     * The first name of the customer.
     */
    private String firstName;

    /**
     * The last name of the customer.
     */
    private String lastName;

    /**
     * The street address of the customer.
     */
    private String address;

    /**
     * The city of the customer.
     */
    private String city;

    /**
     * The state of the customer.
     */
    private String state;

    /**
     * The zip code of the customer.
     */
    private String zip;

    /**
     * The phone number of the customer.
     */
    private String phone;

    /**
     * The email address of the customer.
     */
    private String email;

    /**
     * The credit card number of the customer.
     */
    private String creditCardNumber;

    /**
     * The credit card expiration of the customer.
     */
    private String creditCardExpiration;

    /**
     * The credit card CVV of the customer.
     */
    private String creditCardCVV;

    /**
     * The credit card type of the customer.
     */
    private String creditCardType;

    /**
     * The credit card holder's name for the customer.
     */
    private String creditCardName;

    /**
     * The credit card holder's billing zip code for the customer.
     */
    private String creditCardZipCode;

    /**
     * Creates a new customer object without credit card information.
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     */
    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email,
                "Undefined", "Undefined", null,
                "Undefined", "Undefined", "Undefined");
    }

    /**
     * Creates a new customer object with credit card information
     * except for CVV which it stores as "Undefined".
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     * @param creditCardNumber String representation of the customer's credit card number.
     * @param creditCardExpiration String representation of the customer's credit card expiration date.
     * @param creditCardType String representation of the customer's credit card type.
     *                       (e.g. Visa, MasterCard, American Express, etc.)
     * @param creditCardName String representation of the customer's credit card holder name.
     * @param creditCardZipCode String representation of the customer's credit card zip code.
     */
    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email, String creditCardNumber, String creditCardExpiration,
                    String creditCardType, String creditCardName, String creditCardZipCode) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email, creditCardNumber,
                creditCardExpiration, null, creditCardType, creditCardName, creditCardZipCode);
    }

    /**
     * Creates a new customer object with credit card information including CVV.
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     * @param creditCardNumber String representation of the customer's credit card number.
     * @param creditCardExpiration String representation of the customer's credit card expiration date.
     * @param creditCardCVV String representation of the customer's credit card CVV number.
     * @param creditCardType String representation of the customer's credit card type.
     *                       (e.g. Visa, MasterCard, American Express, etc.)
     * @param creditCardName String representation of the customer's credit card holder name.
     * @param creditCardZipCode String representation of the customer's credit card zip code.
     */
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

    /**
     * Sets the customer's first name.
     *
     * @param firstName String representation of the customer's first name.
     */
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the customer's last name.
     *
     * @param lastName String representation of the customer's last name.
     */
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the customer's street address.
     *
     * @param address String representation of the customer's street address.
     */
    public void setAddress (String address) {
        this.address = address;
    }

    /**
     * Sets the customer's city.
     *
     * @param city String representation of the customer's city.
     */
    public void setCity (String city) {
        this.city = city;
    }

    /**
     * Sets the customer's state.
     *
     * @param state String representation of the customer's state.
     */
    public void setState (String state) {
        this.state = state;
    }

    /**
     * Sets the customer's zip code.
     *
     * @param zip String representation of the customer's zip code.
     */
    public void setZip (String zip) {
        this.zip = zip;
    }

    /**
     * Sets the customer's phone number.
     *
     * @param phone String representation of the customer's phone number.
     */
    public void setPhone (String phone) {
        this.phone = phone;
    }

    /**
     * Sets the customer's email address.
     *
     * @param email String representation of the customer's email address.
     */
    public void setEmail (String email) {
        this.email = email;
    }

    /**
     * Sets the customer's credit card number.
     *
     * @param creditCardNumber String representation of the customer's credit card number.
     */
    public void setCreditCardNumber (String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * Sets the customer's credit card expiration date.
     *
     * @param creditCardExpiration String representation of the customer's credit card expiration date.
     */
    public void setCreditCardExpiration (String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    /**
     * Sets the customer's credit card CVV number.
     *
     * @param creditCardCVV String representation of the customer's credit card CVV number.
     */
    public void setCreditCardCVV (String creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }

    /**
     * Sets the customer's credit card type.
     *
     * @param creditCardType String representation of the customer's credit card type.
     *                       (e.g. Visa, MasterCard, American Express, etc.)
     */
    public void setCreditCardType (String creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * Sets the customer's credit card holder name.
     *
     * @param creditCardName String representation of the customer's credit card holder name.
     */
    public void setCreditCardName (String creditCardName) {
        this.creditCardName = creditCardName;
    }

    /**
     * Sets the customer's credit card zip code.
     *
     * @param creditCardZipCode String representation of the customer's credit card zip code.
     */
    public void setCreditCardZipCode (String creditCardZipCode) {
        this.creditCardZipCode = creditCardZipCode;
    }

    /**
     * Returns the customer's unique ID.
     *
     * @return String representation of the customer's unique ID.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Returns the customer's first name.
     *
     * @return String representation of the customer's first and last names.
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the customer's street address.
     *
     * @return String representation of the customer's street address.
     */
    public String[] getAddress() {
       return new String[]{address, city, state, zip};
    }

    /**
     * Returns the customer's phone number.
     *
     * @return String representation of the customer's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the customer's email address.
     *
     * @return String representation of the customer's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the customer object.
     *
     * @return String representation of the customer object.
     */
    public String toString(){
        return String.format("Customer ID: %s%n%s %s%n%s%n%s, %s %s%nPhone: %s%nEmail: %s%n",
                customerID, firstName, lastName, address, city, state, zip, phone, email);
    }

}
