package com.yrx.Place;

import java.util.HashMap;

public class Place {
     protected String placeid;
     protected String placename;
     HashMap<String, Place> stringPlaceMapeachable = new HashMap<String, Place>() ;

     @Override
     public String toString() {
          return placename ;
     }

     public Place(String roomid, String roomname) {
          this.placeid=roomid;
          this.placename=roomname;
     }

     public String getPlaceid() {
          return placeid;
     }

     public void setPlaceid(String placeid) {
          this.placeid = placeid;
     }

     public String getPlacename() {
          return placename;
     }

     public void setPlacename(String placename) {
          this.placename = placename;
     }

     public HashMap<String, Place> getStringPlaceMapeachable() {
          return stringPlaceMapeachable;
     }

     public void setStringPlaceMapeachable(HashMap<String, Place> stringPlaceMapeachable) {
          this.stringPlaceMapeachable = stringPlaceMapeachable;
     }

     public Place(){}

}
