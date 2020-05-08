package com.yrx.creatures;

import com.yrx.Place.Place;
import com.yrx.article.Weapon;

public class Monster extends Creature {
    @Override
    public Place getCurrentplace() {
        return super.getCurrentplace();
    }

    @Override
    public void setCurrentplace(Place currentplace) {
        super.setCurrentplace(currentplace);
    }

    @Override
    public Weapon getCurrentweapon() {
        return super.getCurrentweapon();
    }

    @Override
    public void setCurrentweapon(Weapon currentweapon) {
        super.setCurrentweapon(currentweapon);
    }

    public Monster(String id, String name, int HPvalue, Weapon currentweapon) {
        super(id, name, HPvalue, currentweapon);
    }

    public Monster() {
        super();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getHPvalue() {
        return super.getHPvalue();
    }

    @Override
    public void setHPvalue(int HPvalue) {
        super.setHPvalue(HPvalue);
    }

    @Override
    public void useArticle(Weapon weapon, Creature enemymonster) {
        super.useArticle(weapon, enemymonster);
    }

}
