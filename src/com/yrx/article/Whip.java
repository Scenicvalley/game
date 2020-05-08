package com.yrx.article;

import com.yrx.creatures.Creature;

public  class Whip extends Weapon {
//    private String id;
//    private String description;
//    private int damagePoints;
//
    public Whip(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    public Whip() {
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

    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPvalue(enemyCreature.getHPvalue()+this.getDamagePoints());
    }
}
