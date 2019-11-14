package edu.swe645.managedBean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "validationPatterns")
@ApplicationScoped
public class ValidationPatterns {
    private String nameValidation = "^[ ]*[A-Za-z]*[ ]*$";
    private String addressValidation = "^[ ]*[a-zA-Z0-9 ,'\\-]*[ ]*$";
    private String nameValidationMessage = "Please use only chars and upto 15 chars only";
    private String zipcodeValidation = "^[0-9]*$";
    private String zipcodeValidationMessage = "Please use only digits to enter zipcode";
    private String phoneNumberValidation = "^\\([0-9]{3}\\) [0-9]{3}-[0-9]{3}$";
    private String emailValidation = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private String emailValidationMessage = "Please enter a valid email id";
    private String phonenumberValidationMessage = "Please use the following pattern (222) 222-222";
    private String addressValidationMessage = "apart from chars and numbers, only - , ' - is allowed. Upto 30 chars";
    private String raffleValidatorMessage = "Please put the 10 comma separated values without spaces";


    public String getPhoneNumberValidation() {
        return phoneNumberValidation;
    }

    public void setPhoneNumberValidation(String phoneNumberValidation) {
        this.phoneNumberValidation = phoneNumberValidation;
    }

    public String getPhonenumberValidationMessage() {
        return phonenumberValidationMessage;
    }

    public void setPhonenumberValidationMessage(String phonenumberValidationMessage) {
        this.phonenumberValidationMessage = phonenumberValidationMessage;
    }

    public String getEmailValidation() {
        return emailValidation;
    }

    public void setEmailValidation(String emailValidation) {
        this.emailValidation = emailValidation;
    }

    public String getEmailValidationMessage() {
        return emailValidationMessage;
    }

    public void setEmailValidationMessage(String emailValidationMessage) {
        this.emailValidationMessage = emailValidationMessage;
    }

    public String getZipcodeValidation() {
        return zipcodeValidation;
    }

    public void setZipcodeValidation(String zipcodeValidation) {
        this.zipcodeValidation = zipcodeValidation;
    }

    public String getZipcodeValidationMessage() {
        return zipcodeValidationMessage;
    }

    public void setZipcodeValidationMessage(String zipcodeValidationMessage) {
        this.zipcodeValidationMessage = zipcodeValidationMessage;
    }

    public String getNameValidation() {
        return nameValidation;
    }

    public void setNameValidation(String nameValidation) {
        this.nameValidation = nameValidation;
    }

    public String getAddressValidation() {
        return addressValidation;
    }

    public void setAddressValidation(String addressValidation) {
        this.addressValidation = addressValidation;
    }

    public String getNameValidationMessage() {
        return nameValidationMessage;
    }

    public void setNameValidationMessage(String nameValidationMessage) {
        this.nameValidationMessage = nameValidationMessage;
    }

    public String getAddressValidationMessage() {
        return addressValidationMessage;
    }

    public void setAddressValidationMessage(String addressValidationMessage) {
        this.addressValidationMessage = addressValidationMessage;
    }

    public String getRaffleValidatorMessage() {
        return raffleValidatorMessage;
    }

    public void setRaffleValidatorMessage(String raffleValidatorMessage) {
        this.raffleValidatorMessage = raffleValidatorMessage;
    }

}
