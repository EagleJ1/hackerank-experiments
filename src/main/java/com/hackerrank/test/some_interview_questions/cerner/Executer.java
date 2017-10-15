package com.hackerrank.test.some_interview_questions.cerner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Executer {

    public static void main(String[] args){

        List<Allergy> allergies = new ArrayList<Allergy>();
        allergies.add(new Allergy("Cilek", Severity.HIGH));
        allergies.add(new Allergy("Datca", Severity.HIGH));
        allergies.add(new Allergy("CB", Severity.HIGH));
        Patient patient = new Patient("TolCak", new Address("USA", "AR","BIDIBIDI", 72116), 33, allergies, new Temperature(39, Location.AMPIT, TemperatureUnit.C));
        System.out.println(patient.getAllergiesAsString());
        System.out.println(patient.hasFever());
    }
}
