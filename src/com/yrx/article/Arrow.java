package com.yrx.article;

import com.yrx.creatures.Creature;

public class Arrow extends  Weapon {
    public Arrow(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    public Arrow() {
        super();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public void setDamagePoints(int damagePoints) {
        super.setDamagePoints(damagePoints);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getDamagePoints() {
        return super.getDamagePoints();
    }

    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPvalue(enemyCreature.getHPvalue()+this.getDamagePoints());
    }
}
