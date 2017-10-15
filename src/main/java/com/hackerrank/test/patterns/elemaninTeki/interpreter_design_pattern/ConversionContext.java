package com.hackerrank.test.patterns.elemaninTeki.interpreter_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class ConversionContext {

    private String conversionQuestion = "";
    private String conversionResponse = "";
    private String fromConversion = "";
    private String toConversion = "";
    private double quantity;
    String[] partsOfQuestions;

    public ConversionContext(String input) {
        conversionQuestion = input;
        partsOfQuestions = getInput().split(" ");

        // Main entry : 1 gallons to pints

        // gallons
        fromConversion = getCapitalized(partsOfQuestions[1]);

        //what do we convert from toConversion
        // pints
        toConversion = getLowerCase(partsOfQuestions[3]);

        //1
        quantity = Double.valueOf(partsOfQuestions[0]);

        conversionResponse = partsOfQuestions[0] + " " + partsOfQuestions[1] + " equals ";

    }

    private String getLowerCase(String wordToLowerCase) {
        return wordToLowerCase.toLowerCase();
    }

    // Capitalizes the first letter of a word
    private String getCapitalized(String wordToCapitalize) {
        // Make characters lower case
        wordToCapitalize = wordToCapitalize.toLowerCase();
        // Make the first character uppercase
        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);
        // Put s on the end if not there
        int lengthOfWord = wordToCapitalize.length();
        if ((wordToCapitalize.charAt(lengthOfWord - 1)) != 's') {
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
        }
        return wordToCapitalize;
    }

    public String getInput() {
        return conversionQuestion;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public String getResponse() {
        return conversionResponse;
    }

    public double getQuantity() {
        return quantity;
    }
}
