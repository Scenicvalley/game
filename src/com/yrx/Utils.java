package com.yrx;

import java.util.Random;

public class Utils {
//    private static int min=0;
//    private static int max=0;
//    public static int randomMonsterchop(){
//        return (int)(Math.random()*(max-min)+min);
//    }
    public static  String getrandomplace(){
        String i;
        Random random = new Random();
        i=String.valueOf(random.nextInt(10));
        return i;
    }
    public static String getrandomchose(){
        String i;
        Random random = new Random();
        i=String.valueOf(random.nextInt(2));
        return i;
    }

}
