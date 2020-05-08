package com.yrx;

import com.yrx.creatures.Creature;
import com.yrx.creatures.Monster;
import com.yrx.sense.Sense;
import sun.awt.geom.AreaOp;

public class Ui {

    public void displaywelcome(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-你好，欢迎来到魔兽世界-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void displayreceive(String yes){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("|    你出生在一个普通的渔户家中,取名于明,天降祥瑞天|");
        System.out.println("|空变为赤红色,一股血雨腥风即将到来，从此母鸡打鸣,公|");
        System.out.println("|鸡下蛋.原本平静的世界仿佛因你的出生发生了改变,而正|");
        System.out.println("|是这股力量让沉睡在那远古被人遗忘的三大妖兽被你唤醒|");
        System.out.println("|于是为解救天下苍生,你不得不踏上斩妖之路,还天下一个|");
        System.out.println("|太平。                                          |");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }

    public void displayerror(){
     System.out.println("你输入的是非法命令");
    }

    public void displayStaus(Sense sense){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(sense.getPerson().getName()+":"+sense.getPerson().getHPvalue());
        for (Monster monster:sense.getMonsterset().getMonsters()){
            if(monster.getHPvalue()>0){
                System.out.print(monster.getName()+"("+monster.getHPvalue()+")");
            }

        }
        System.out.println();
        System.out.println("你现在所在的房间是：\n"+sense.getPerson().getCurrentplace());
        System.out.println("你可以去的房间有：");
        System.out.println(sense.getPerson().getCurrentplace().getStringPlaceMapeachable());
//        System.out.println("妖怪的房间是：");
//        System.out.println(sense.getMonstercat().getCurrentplace());
//        System.out.println(sense.getMonsterdog().getCurrentplace());
//        System.out.println(sense.getMonstertiger().getCurrentplace());
        System.out.println("这个房间的怪物有：");
        if(sense.getPerson().getCurrentplace().equals(sense.getMonstertiger().getCurrentplace())){
            if (sense.getMonstertiger().getHPvalue()>0) {
                System.out.print(sense.getMonstertiger());
            }
        }
        if(sense.getPerson().getCurrentplace().equals(sense.getMonstercat().getCurrentplace())){
            if(sense.getMonstercat().getHPvalue()>0) {
                System.out.print(sense.getMonstercat());
            }
        }
        if(sense.getPerson().getCurrentplace().equals(sense.getMonsterdog().getCurrentplace())){
            if (sense.getMonsterdog().getHPvalue()>0) {
                System.out.print(sense.getMonsterdog());
            }
        }
        System.out.println();
        if(sense.getDrug1().getCurrentroom().equals(sense.getPerson().getCurrentplace())){
            System.out.println("哇，这里有个宝藏");
            System.out.println("*这里有一瓶神仙水(1)，可以提高20点的生命值");
        }
        if(sense.getDrug2().getCurrentroom().equals(sense.getPerson().getCurrentplace())){
            System.out.println("你的运气也太好了吧！");
            System.out.println("这里有一瓶肥仔快乐水(2)，可以提高30点的生命值");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public void displayhelp(){
        System.out.println("------------chop(chop cat/dog/tiger) --------------");
        System.out.println("----------------------bye--------------------------");
        System.out.println("----------------------help-------------------------");
        System.out.println("-------------------drink 1/2-------------------------");
    }
    public void displaybye(){
        System.out.println("游戏结束");
    }
    public void displayDamageMsg(Creature attackcreature,Creature targetCreature){
        System.out.println(attackcreature.getName()+"对"+targetCreature.getName()+"造成了"+attackcreature.getCurrentweapon().getDamagePoints()+"的伤害。");
    }
    public void displayrules(String choose){
        System.out.println("----------------------游戏规则--------------------");
        System.out.println("|   你将会独自一人浪迹天涯,途中会有三种妖怪随机出现|");
        System.out.println("|在你所经过的区域,并随机向你发动攻击,你可以选择离开|");
        System.out.println("|或者攻击,你和妖怪各自拥有属于自己的武器,并且你在击|");
        System.out.println("|败怪物后可以获取怪物的武器，途中也会随机生成生命药|");
        System.out.println("|水,药水可以提高你的生命值,你的目标就是杀灭所有妖怪|");
        System.out.println("|这是一场力量与智慧的博弈,加油吧,少年!            |");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public  void displaystart(){
        System.out.println("-------开始你的游戏吧！------");
    }

}
