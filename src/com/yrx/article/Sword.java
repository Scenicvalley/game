package com.yrx.article;

import com.yrx.creatures.Creature;

public class Sword extends Weapon{

    private String id;
    private String description;
    private int damagePoints;

    @Override
    public void useArticle(Creature enemyCreature) {
         enemyCreature.setHPvalue(enemyCreature.getHPvalue()+this.getDamagePoints());
    }

    public Sword(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    public Sword() {
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
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public int getDamagePoints() {
        return super.getDamagePoints();
    }

    @Override
    public void setDamagePoints(int damagePoints) {
        super.setDamagePoints(damagePoints);
    }
}
