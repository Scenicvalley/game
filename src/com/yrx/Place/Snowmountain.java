package com.yrx.Place;

import java.util.HashMap;

/*雪山*/
public class Snowmountain extends Place{
    HashMap<String, Place> stringPlaceMapeachable = new HashMap<String, Place>() ;
    private String placeid;
    private String placename;


    @Override
    public String toString() {
        return placename;
    }

    public Snowmountain(String roomid, String roomname) {
        this.placeid=roomid;
        this.placename=roomname;
    }

    @Override
    public HashMap<String, Place> getStringPlaceMapeachable() {
        return stringPlaceMapeachable;
    }

    @Override
    public void setStringPlaceMapeachable(HashMap<String, Place> stringPlaceMapeachable) {
        this.stringPlaceMapeachable = stringPlaceMapeachable;
    }

    @Override
    public String getPlaceid() {
        return placeid;
    }

    @Override
    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }

    @Override
    public String getPlacename() {
        return placename;
    }

    @Override
    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public  Snowmountain() {
        super();
    }
}
