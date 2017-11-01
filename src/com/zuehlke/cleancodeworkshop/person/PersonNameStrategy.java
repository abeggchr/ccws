package com.zuehlke.cleancodeworkshop.person;

public abstract class PersonNameStrategy {
    boolean capitalizeSurname;

    static {
        PersonNameStrategyFactory.surnameFirst.add("CHN");
        PersonNameStrategyFactory.surnameFirst.add("KOR");
        // etc...
    }

    protected PersonNameStrategy(boolean capitalizeSurname) {
        this.capitalizeSurname = capitalizeSurname;
    }

    public abstract String nameString(String familyName, String givenName);


    protected String getSurname(String familyName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        return surname;
    }
}