package edu.swe645.managedBean;

import javax.faces.bean.ManagedBean;
import java.util.*;

@ManagedBean(name = "surveyBean")
public class SurveyBean {

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Integer zipCode;
    private String phoneNumber;
    private String email;
    private Date dateOfSurvey;
    private List<String> campusLike;
    private String campusHear;
    private String recommendationRatings;
    private ArrayList<Integer> raffleNumbers;
    private String comments;
    private Date startSemester;

    public ArrayList<String> autoCompleteMethod(String q) {
        Set<String> values = new HashSet<String>();
        values.add("Likely");
        values.add("Unlikely");
        values.add("Very Likely");
        ArrayList<String> returnList = new ArrayList<String>();
        for (String val : values) {
            if (val.toLowerCase().contains(q.toLowerCase())) {
                returnList.add(val);
            }
        }
        if (returnList.size() == 0) {
            returnList.addAll(values);
        }
        return returnList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public List<String> getCampusLike() {
        return campusLike;
    }

    public void setCampusLike(List<String> campusLike) {
        this.campusLike = campusLike;
    }

    public String getCampusHear() {
        return campusHear;
    }

    public void setCampusHear(String campusHear) {
        this.campusHear = campusHear;
    }

    public String getRecommendationRatings() {
        return recommendationRatings;
    }

    public void setRecommendationRatings(String recommendationRatings) {
        this.recommendationRatings = recommendationRatings;
    }

    public ArrayList<Integer> getRaffleNumbers() {
        return raffleNumbers;
    }

    public void setRaffleNumbers(ArrayList<Integer> raffleNumbers) {
        this.raffleNumbers = raffleNumbers;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getStartSemester() {
        return startSemester;
    }

    public void setStartSemester(Date startSemester) {
        this.startSemester = startSemester;
    }

    public void submitStudentSurvery() {
        System.out.println("Something");
    }

}
