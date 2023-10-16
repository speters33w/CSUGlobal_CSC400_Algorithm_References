```pseudocode
class Customer {
    private customerID: String
    private firstName: String
    private lastName: String
    private address: String
    private city: String
    private state: String
    private zip: String
    private phone: String
    private email: String
    private creditCardNumber: String
    private creditCardExpiration: String
    private creditCardCVV: String
    private creditCardType: String
    private creditCardName: String
    private creditCardZipCode: String

    constructor(customerID: String, firstName: String, lastName: String, address: String, city: String, state: String,
                zip: String, phone: String, email: String) {
        this.customerID = customerID
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.phone = phone
        this.email = email
        this.creditCardNumber = "Undefined"
        this.creditCardExpiration = "Undefined"
        this.creditCardCVV = null
        this.creditCardType = "Undefined"
        this.creditCardName = "Undefined"
        this.creditCardZipCode = "Undefined"
    }

    constructor(customerID: String, firstName: String, lastName: String, address: String, city: String, state: String,
                zip: String, phone: String, email: String, creditCardNumber: String, creditCardExpiration: String,
                creditCardType: String, creditCardName: String, creditCardZipCode: String) {
        this.customerID = customerID
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.phone = phone
        this.email = email
        this.creditCardNumber = creditCardNumber
        this.creditCardExpiration = creditCardExpiration
        this.creditCardCVV = null
        this.creditCardType = creditCardType
        this.creditCardName = creditCardName
        this.creditCardZipCode = creditCardZipCode
    }

    constructor(customerID: String, firstName: String, lastName: String, address: String, city: String, state: String,
                zip: String, phone: String, email: String, creditCardNumber: String, creditCardExpiration: String,
                creditCardCVV: String, creditCardType: String, creditCardName: String, creditCardZipCode: String) {
        this.customerID = customerID
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.phone = phone
        this.email = email
        this.creditCardNumber = creditCardNumber
        this.creditCardExpiration = creditCardExpiration
        this.creditCardCVV = creditCardCVV
        this.creditCardType = creditCardType
        this.creditCardName = creditCardName
        this.creditCardZipCode = creditCardZipCode
    }

    method setFirstName(firstName: String) {
        this.firstName = firstName
    }

    method setLastName(lastName: String) {
        this.lastName = lastName
    }

    method setAddress(address: String) {
        this.address = address
    }

    method setCity(city: String) {
        this.city = city
    }

    method setState(state: String) {
        this.state = state
    }

    method setZip(zip: String) {
        this.zip = zip
    }

    method setPhone(phone: String) {
        this.phone = phone
    }

    method setEmail(email: String) {
        this.email = email
    }

    method setCreditCardNumber(creditCardNumber: String) {
        this.creditCardNumber = creditCardNumber
    }

    method setCreditCardExpiration(creditCardExpiration: String) {
        this.creditCardExpiration = creditCardExpiration
    }

    method setCreditCardCVV(creditCardCVV: String) {
        this.creditCardCVV = creditCardCVV
    }

    method setCreditCardType(creditCardType: String) {
        this.creditCardType = creditCardType
    }

    method setCreditCardName(creditCardName: String) {
        this.creditCardName = creditCardName
    }

    method setCreditCardZipCode(creditCardZipCode: String) {
        this.creditCardZipCode = creditCardZipCode
    }

    method getCustomerID() {
        return customerID
    }

    method getName() {
        return firstName + " " + lastName
    }

    method getAddress() {
        return [address, city, state, zip]
    }

    method getPhone() {
        return phone
    }

    method getEmail() {
        return email
    }

    method toString() {
        return "Customer ID: " + customerID + "\n" + firstName + " " + lastName + "\n" + address + "\n" + city + ", " + state + " " + zip + "\nPhone: " + phone + "\nEmail: " + email
    }
}
```