package com.yrx.article;

import com.yrx.creatures.Creature;

public abstract class Weapon {
    private String id;
    private String description;
    private int damagePoints;

    public  void useArticle(Creature enemyCreature){};
//这里原本是抽象类
    protected Weapon(String id, String description, int damagePoints) {
        this.id = id;
        this.description = description;
        this.damagePoints = damagePoints;
    };

    public  Weapon() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
