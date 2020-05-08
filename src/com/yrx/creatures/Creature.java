package com.yrx.creatures;

import com.yrx.Place.Place;
import com.yrx.article.Drug;
import com.yrx.article.Weapon;

public class Creature {
   private String id;
   private String name;
   private int HPvalue;
   private Place currentplace;

    public Place getCurrentplace() {
        return currentplace;
    }

    public void setCurrentplace(Place currentplace) {
        this.currentplace = currentplace;
    }

    public Weapon getCurrentweapon() {
        return currentweapon;
    }

    public void setCurrentweapon(Weapon currentweapon) {
        this.currentweapon = currentweapon;
    }

    private Weapon currentweapon;
    public Creature(String id, String name, int HPvalue, Weapon currentweapon) {
        this.id = id;
        this.name = name;
        this.HPvalue = HPvalue;
        this.currentweapon = currentweapon;
    }

    public Creature() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHPvalue() {
        return HPvalue;
    }

    public void setHPvalue(int HPvalue) {
        this.HPvalue = HPvalue;
    }

    public  void useArticle(Weapon weapon,Creature enemymonster){
       weapon.useArticle(enemymonster);
    }

    @Override
    public String toString() {
        return name;
    }

    public void goroom(Creature person, Place place){
         person.setCurrentplace(place);
    }
    public void drinkdrug(Creature person, Drug drug){
        drug.addpoints(person);
    }
}
