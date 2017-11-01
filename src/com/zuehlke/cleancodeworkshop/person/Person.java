package com.zuehlke.cleancodeworkshop.person;

public class Person {

    private String familyName;
    private String givenName;
    private final PersonNameStrategy personNameStrategy;

    public Person(String familyName, String givenName, String nationality) {
        this(familyName, givenName, nationality, false, false);
    }

    public Person(String familyName, String givenName, String nationality, boolean olympicMode, boolean capitalizeSurname) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.personNameStrategy = new PersonNameStrategy(nationality, olympicMode, capitalizeSurname);
    }

    @Override
    public String toString() {
        return personNameStrategy.nameString(familyName, givenName);
    }

}
