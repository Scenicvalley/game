package com.yrx.senseset;

import com.yrx.creatures.Monster;

import java.util.ArrayList;

public class Monsterset {
    ArrayList<Monster> monsters=new ArrayList<>();

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public Monster getMonsterbyid(String id){
        Monster monster=null;
        for (Monster item:monsters){
            if(id.equals(item.getId())){
                monster=item;
                break;
            }
        }
        return monster;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    //增删改查
    public Monsterset(){};

    public Monsterset(ArrayList<Monster> monsters){
        this.monsters=monsters;
    };
}
