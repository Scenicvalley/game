package com.yrx.creatures;

import com.yrx.Place.Place;
import com.yrx.article.Weapon;

public class Monstercat extends Monster {
    private String id;
    private String name;
    private Place currentplace;
    private int HPvalue;

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public Place getCurrentplace() {
        return currentplace;
    }

    @Override
    public void setCurrentplace(Place currentplace) {
        this.currentplace = currentplace;
    }

    public Monstercat(String id, String name, int HPvalue, Weapon currentweapon, String id1, String name1, int HPvalue1) {
        super(id, name, HPvalue, currentweapon);
        this.id = id1;
        this.name = name1;
        this.HPvalue = HPvalue1;
    }

    public Monstercat() {
        super();
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHPvalue() {
        return HPvalue;
    }

    @Override
    public void setHPvalue(int HPvalue) {
        this.HPvalue = HPvalue;
    }

    @Override
    public void useArticle(Weapon weapon, Creature enemymonster) {
        super.useArticle(weapon, enemymonster);
    }
}
