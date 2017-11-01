package com.zuehlke.cleancodeworkshop.person;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategy {
    String nationality;
    boolean capitalizeSurname;
    boolean olympicMode;
    static List<String> surnameFirst = new ArrayList<String>();

    static {
        PersonNameStrategy.surnameFirst.add("CHN");
        PersonNameStrategy.surnameFirst.add("KOR");
        // etc...
    }

    public PersonNameStrategy(String nationality, boolean olympicMode, boolean capitalizeSurname) {
        this.nationality = nationality;
        this.olympicMode = olympicMode;
        this.capitalizeSurname = capitalizeSurname;
    }

    private boolean surnameFirst() {
        if (!olympicMode)
            return false;
        return surnameFirst.contains(nationality);
    }

    public String nameString(String familyName, String givenName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        if (surnameFirst())
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }


}