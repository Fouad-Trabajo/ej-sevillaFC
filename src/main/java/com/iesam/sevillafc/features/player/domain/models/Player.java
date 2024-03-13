package com.iesam.sevillafc.features.player.domain.models;

public class Player extends Staff {
    public final String demacracion;

    public Player(String id, String name, String surname, String dateBorn, String demacracion) {
        super(id, name, surname, dateBorn);
        this.demacracion = demacracion;
    }
}
