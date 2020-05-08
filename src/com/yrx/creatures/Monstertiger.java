package com.yrx.creatures;

import com.yrx.Place.Place;
import com.yrx.article.Weapon;

public class Monstertiger extends Monster {
    private String id;
    private String name;
    private Place currentplace;
    private int HPvalue;

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
    public Place getCurrentplace() {
        return currentplace;
    }

    @Override
    public void setCurrentplace(Place currentplace) {
        this.currentplace = currentplace;
    }

    @Override
    public int getHPvalue() {
        return HPvalue;
    }

    @Override
    public String toString() {
        return  name ;
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
