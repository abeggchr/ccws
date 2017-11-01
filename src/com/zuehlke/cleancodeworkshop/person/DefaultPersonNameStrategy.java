package com.zuehlke.cleancodeworkshop.person;

public class DefaultPersonNameStrategy extends PersonNameStrategy {
    DefaultPersonNameStrategy(boolean capitalizeSurname) {
        super(capitalizeSurname);
    }

    @Override
    public String nameString(String familyName, String givenName) {
        return givenName + " " + getSurname(familyName);
    }

}
