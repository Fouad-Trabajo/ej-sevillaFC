package com.iesam.sevillafc.features.match.domain.models;

public class Referee {

    public final  String id, name, surname, dateBorn, category;

    public Referee(String id, String name, String surname, String dateBorn, String category) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateBorn = dateBorn;
        this.category = category;
    }
}
