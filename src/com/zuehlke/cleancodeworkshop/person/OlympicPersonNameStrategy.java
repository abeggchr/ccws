package com.zuehlke.cleancodeworkshop.person;

public class OlympicPersonNameStrategy extends PersonNameStrategy {

    private boolean surnameFirst;

    OlympicPersonNameStrategy(boolean capitalizeSurname, boolean surnameFirst) {
        super(capitalizeSurname);
        this.surnameFirst = surnameFirst;
    }

    @Override
    public String nameString(String familyName, String givenName) {
        String surname = getSurname(familyName);
        if (surnameFirst)
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }
}
