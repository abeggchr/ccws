package com.zuehlke.cleancodeworkshop.person;

import com.zuehlke.cleancodeworkshop.person.DefaultPersonNameStrategy;
import com.zuehlke.cleancodeworkshop.person.OlympicPersonNameStrategy;
import com.zuehlke.cleancodeworkshop.person.PersonNameStrategy;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategyFactory {
    public static List<String> surnameFirst = new ArrayList<String>();

    public static PersonNameStrategy create(String nationality, boolean olympicMode, boolean capitalizeSurname) {
        if (olympicMode) {
            return new OlympicPersonNameStrategy(capitalizeSurname, surnameFirst.contains(nationality));
        }
        return new DefaultPersonNameStrategy(capitalizeSurname);
    }
}
