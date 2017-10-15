package com.hackerrank.test.some_interview_questions.cerner;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Allergy {

    private Severity severity;
    private String name;

    Allergy(String name, Severity severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
