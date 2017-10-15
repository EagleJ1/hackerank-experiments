package com.hackerrank.test.some_interview_questions.cerner;

import java.util.Date;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Medication {
    private String name;
    private int quantity;
    private Date start;
    private Date end;

    Medication(String name, int quantity, Date start, Date end) {
        this.name = name;
        this.quantity = quantity;
        this.start = start;
        this.end = end;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setStart(Date start){
        this.start = start;
    }

    public Date getStart(){
        return start;
    }

    public void setEnd(Date end){
        this.end = end;
    }

    public Date getEnd(){
        return end;
    }
}
