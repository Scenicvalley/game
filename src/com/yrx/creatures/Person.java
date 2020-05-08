package com.yrx.creatures;

import com.yrx.article.Drug;
import com.yrx.article.Weapon;

public class Person extends Creature {
    @Override
    public void useArticle(Weapon weapon, Creature enemymonster) {
        super.useArticle(weapon, enemymonster);
    }

    @Override
    public void drinkdrug(Creature person, Drug drug) {
        super.drinkdrug(person, drug);
    }
}
