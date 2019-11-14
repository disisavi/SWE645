package edu.swe645.managedBean;

import edu.swe645.doa.DOA;
import edu.swe645.model.RafelStudent;
import edu.swe645.model.Student;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
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
    private String[] campusLike;
    private String campusHear;
    private String recommendationRatings;
    private String raffleNumbers;
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
        this.firstName = firstName.trim();
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
        this.street = street.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state.trim();
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
        this.email = email.trim();
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public String[] getCampusLike() {
        return campusLike;
    }

    public void setCampusLike(String[] campusLike) {
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

    public String getRaffleNumbers() {
        return raffleNumbers;
    }

    public void setRaffleNumbers(String raffleNumbers) {
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

    public String submitStudentSurvery() {
        Boolean isMessage = false;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Student student = new Student();
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        student.setStreet(this.street);
        student.setCity(this.city);
        student.setState(this.state);
        student.setZipCode(this.zipCode);
        student.setPhoneNumber(this.phoneNumber);
        student.setEmail(this.email);
        student.setDateOfSurvey(this.dateOfSurvey);
        student.setCampusHear(this.campusHear);
        student.setCampusLike(this.campusLike);
        student.setRecommendationRatings(this.recommendationRatings);
        student.setComments(this.comments);
        student.setStartSemester(this.startSemester);
        ArrayList<String> rafaelNumbers = new ArrayList<String>(Arrays.asList(raffleNumbers.split(",")));
        HashSet<RafelStudent> rSet = new HashSet<>();
        if (rafaelNumbers.size() > 9) {
            try {
                for (String rafael : rafaelNumbers) {
                    Integer rNumber = Integer.parseInt(rafael);
                    RafelStudent rafelStudent = new RafelStudent();
                    rafelStudent.setRafelNumber(rNumber);
                    rafelStudent.setStudent(student);
                    rSet.add(rafelStudent);
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                facesContext.addMessage("raffle", new FacesMessage("Non integer value found in Rafael, please correct"));
            }
        } else {
            facesContext.addMessage("raffle", new FacesMessage("Please enter atleast 10 numbers "));
        }
        if (facesContext.getMessageList().size() > 0) {
            isMessage = true;
        }

        if (isMessage) {
            return null;
        }
        student.setRafelStudents(rSet);
        DOA doa = DOA.getDoa();
        doa.persistNewObject(student);
        return "survey";

    }
}

