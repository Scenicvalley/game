package com.yrx.senseset;

import com.yrx.article.Drug;
import com.yrx.creatures.Monster;

import java.util.ArrayList;

public class Drugset {

ArrayList <Drug> drugs=new ArrayList<Drug>();

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }
    public Drug getdrugbyid(String id){
        Drug drug=null;
        for (Drug item:drugs){
            if(id.equals(item.getId())){
                drug=item;
                break;
            }
        }
        return drug;
    }

}
