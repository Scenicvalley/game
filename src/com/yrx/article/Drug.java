package com.yrx.article;

import com.yrx.Place.Place;
import com.yrx.creatures.Creature;
import com.yrx.creatures.Person;

//药水
public class Drug extends Weapon{
    private String id;
    private String description;
    private int healingPoints;
    private Place currentroom;

    @Override
    public String toString() {
        return  description ;
    }

    public Drug(){
   }
   public void addpoints (Creature creature){
       creature.setHPvalue(creature.getHPvalue()+this.getHealingPoints());
   }


    public Drug(String id, String description, int healingPoints, Place currentroom) {
        this.id = id;
        this.description = description;
        this.healingPoints = healingPoints;
        this.currentroom = currentroom;
    }

    public Place getCurrentroom() {
        return currentroom;
    }

    public void setCurrentroom(Place currentroom) {
        this.currentroom = currentroom;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealingPoints() {
        return healingPoints;
    }

    public void setHealingPoints(int healingPoints) {
        this.healingPoints = healingPoints;
    }
}
