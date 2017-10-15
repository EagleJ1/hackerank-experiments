package com.hackerrank.test.some_interview_questions.cerner;

import java.util.Date;
import java.util.List;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Patient extends Person {

    private List<Allergy> allergies;
    private List<Medication> medications;
    private List<Disease> diseases;
    private Temperature temperature;
    private Date lastSeen;

    Patient(String nameSurname, Address address, int age, List<Allergy> allergies) {
        super(nameSurname, age, address);
        this.allergies = allergies;
        this.lastSeen = new Date();
    }

    Patient(String nameSurname, Address address, int age, List<Allergy> allergies, Temperature temperature) {
        super(nameSurname, age, address);
        this.allergies = allergies;
        this.lastSeen = new Date();
        this.temperature = temperature;
    }

    Patient(String nameSurname, Address address, int age, List<Allergy> allergies, List<Medication> medications) {
        super(nameSurname, age, address);
        this.allergies = allergies;
        this.medications = medications;
        this.lastSeen = new Date();
    }

    Patient(String nameSurname, Address address, int age, List<Allergy> allergies, List<Medication> medications,
                    List<Disease> diseases) {
        super(nameSurname, age, address);
        this.allergies = allergies;
        this.medications = medications;
        this.diseases = diseases;
        this.lastSeen = new Date();
    }

    Patient(String nameSurname, Address address, int age, List<Allergy> allergies, List<Medication> medications,
                    List<Disease> diseases, Temperature temperature) {
        super(nameSurname, age, address);
        this.allergies = allergies;
        this.medications = medications;
        this.diseases = diseases;
        this.lastSeen = new Date();
        this.temperature = temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public boolean hasFever() {
        float temp = temperature.getTemperature();
        return temperature.convertToCelcius(temp) > 39;
    }

    public String getAllergiesAsString() {
        String allergies = String.format("%s has the next allergies: \n", this.getNameSurname());
        for (Allergy allergy : this.getAllergies()) {
            allergies += String.format("%s with a severity of %s", allergy.getName(), allergy.getSeverity());
            allergies += "\n";
        }
        return allergies;
    }


}
