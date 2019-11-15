package edu.swe645.model;

import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {
    private static final long serialVersionUID = -3772395070724771232L;
    private Integer ID;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Integer zipCode;
    private String phoneNumber;
    private String email;
    private Date dateOfSurvey;
    private String campusLike;
    private String campusHear;
    private String recommendationRatings;
    private String comments;
    private Date startSemester;
    private Set<RafelStudent> rafelStudents = new HashSet<RafelStudent>();


    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return this.firstName.equalsIgnoreCase(((Student) o).firstName)
                    && this.lastName.equalsIgnoreCase(((Student) o).lastName)
                    && this.dateOfSurvey.equals(((Student) o).dateOfSurvey);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.ID);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getCampusLike() {
        return campusLike;
    }

    public void setCampusLike(String campusLike) {
        this.campusLike = campusLike;
    }


    public void setCampusLike(String[] campusLikeArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String campus : campusLikeArray) {
            stringBuffer.append(campus).append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            this.campusLike = stringBuffer.toString();
        }
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

    public Set<RafelStudent> getRafelStudents() {
        return rafelStudents;
    }

    public void setRafelStudents(Set<RafelStudent> rafelStudents) {
        this.rafelStudents = rafelStudents;
    }
}
