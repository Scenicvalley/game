package com.yrx.sense;

import com.yrx.Place.*;
import com.yrx.Ui;
import com.yrx.Utils;
import com.yrx.article.*;
import com.yrx.creatures.*;
import com.yrx.senseset.Drugset;
import com.yrx.senseset.Monsterset;
import com.yrx.senseset.Placeset;

import java.util.HashMap;
import java.util.Scanner;

public class Sense {
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public Monsterset getMonsterset() {
        return monsterset;
    }

    public void setMonsterset(Monsterset monsterset) {
        this.monsterset = monsterset;
    }

    public Monstertiger getMonstertiger() {
        return monstertiger;
    }

    public void setMonstertiger(Monstertiger monstertiger) {
        this.monstertiger = monstertiger;
    }

    public Monsterdog getMonsterdog() {
        return monsterdog;
    }

    public void setMonsterdog(Monsterdog monsterdog) {
        this.monsterdog = monsterdog;
    }

    public Monstercat getMonstercat() {
        return monstercat;
    }

    public void setMonstercat(Monstercat monstercat) {
        this.monstercat = monstercat;
    }

    public Drug getDrug1() {
        return drug1;
    }

    public void setDrug1(Drug drug1) {
        this.drug1 = drug1;
    }

    public Drug getDrug2() {
        return drug2;
    }

    public void setDrug2(Drug drug2) {
        this.drug2 = drug2;
    }

    public Drugset getDrugset() {
        return drugset;
    }

    public void setDrugset(Drugset drugset) {
        this.drugset = drugset;
    }

    Person person = new Person();
    Monstertiger monstertiger = new Monstertiger();
    Monsterdog monsterdog = new Monsterdog();
    Monstercat monstercat = new Monstercat();
    Monsterset monsterset = new Monsterset();
    Drug drug1=new Drug();
    Drug drug2=new Drug();
    Drugset drugset=new Drugset();
    Forest forest = new Forest("3", "深林");
    lowland lowland = new lowland("2", "洼地");
    Plain plain = new Plain("1", "平原");
    Plateaus plateaus = new Plateaus("4", "高原");
    River river = new River("6", "河边");
    Sea sea = new Sea("9", "大海");
    Shack shack = new Shack("0", "草屋");
    Snowmountain snowmountain = new Snowmountain("5", "雪山");
    Swamps swamps = new Swamps("8", "沼泽");
    Volcaniccrater volcaniccrater = new Volcaniccrater("7", "火山口");
    Placeset placeset = new Placeset();
    Ui ui = new Ui();


    public void initsense() {

        initplace();
        initMonster();
        initPerson();
        initdrug();
    }

    public void initPerson() {
        person.setId("1");
        person.setName("渔民");
        person.setHPvalue(300);
        person.setCurrentweapon(new Sword("w1", "倚天剑", -50));
        person.setCurrentplace(shack);
    }

    public void initMonster() {

        monstercat.setId("cat");
        monstercat.setName("猫妖");
        monstercat.setHPvalue(100);
        monstercat.setCurrentweapon(new Whip("w2", "神鞭", -30));




        monsterdog.setId("dog");
        monsterdog.setName("天狗");
        monsterdog.setHPvalue(120);
        monsterdog.setCurrentweapon(new Hammer("w3", "锤子", -60));




        monstertiger.setId("tiger");
        monstertiger.setName("虎妖");
        monstertiger.setHPvalue(150);
        monstertiger.setCurrentweapon(new Arrow("w4", "弓箭", -70));


        monsterset.getMonsters().add(monstercat);
        monsterset.getMonsters().add(monsterdog);
        monsterset.getMonsters().add(monstertiger);


    }

    public void initplace() {
        //设置草房可以到达的地方
        HashMap<String, Place> hs1 = new HashMap<>();
        hs1.put("1", plain);
        hs1.put("2", lowland);
        hs1.put("3", forest);
        hs1.put("4", plateaus);
        shack.setStringPlaceMapeachable(hs1);

        //设置平原可以到达的地方
        HashMap<String, Place> hs2 = new HashMap<>();
        hs2.put("0", shack);
        hs2.put("2", lowland);
        hs2.put("4", plateaus);
        hs2.put("5", snowmountain);
        plain.setStringPlaceMapeachable(hs2);

        //设置洼地可以到达的地方
        HashMap<String, Place> hs3 = new HashMap<>();
        hs3.put("0", shack);
        hs3.put("1", plain);
        hs3.put("3", forest);
        hs3.put("6", river);
        lowland.setStringPlaceMapeachable(hs3);

        //设置深林可以到达的地方
        HashMap<String, Place> hs4 = new HashMap<>();
        hs4.put("7", volcaniccrater);
        hs4.put("2", lowland);
        hs4.put("0", shack);
        hs4.put("4", plateaus);
        forest.setStringPlaceMapeachable(hs4);

        //设置高原可以到达的地方
        HashMap<String, Place> hs5 = new HashMap<>();
        hs5.put("1", plain);
        hs5.put("0", shack);
        hs5.put("3", forest);
        hs5.put("8", swamps);
        plateaus.setStringPlaceMapeachable(hs5);

        //设置雪山可以到达的地方
        HashMap<String, Place> hs6 = new HashMap<>();
        hs6.put("1", plain);
        hs6.put("9", sea);
        hs6.put("6", river);
        snowmountain.setStringPlaceMapeachable(hs6);

        //设置河边可以到达的地方
        HashMap<String, Place> hs7 = new HashMap<>();
        hs7.put("5", snowmountain);
        hs7.put("2", lowland);
        hs7.put("7", volcaniccrater);
        river.setStringPlaceMapeachable(hs7);

        //设置火山口可以到达的地方
        HashMap<String, Place> hs8 = new HashMap<>();
        hs8.put("6", river);
        hs8.put("3", forest);
        hs8.put("8", swamps);
        volcaniccrater.setStringPlaceMapeachable(hs8);

        //设置沼泽可以到达的地方
        HashMap<String, Place> hs9 = new HashMap<>();
        hs9.put("9", sea);
        hs9.put("4", plateaus);
        hs9.put("7", volcaniccrater);
        swamps.setStringPlaceMapeachable(hs9);


        //设置大海可以到达的地方
        HashMap<String, Place> hs10 = new HashMap<>();
        hs10.put("9", swamps);
        hs10.put("6", snowmountain);
        sea.setStringPlaceMapeachable(hs10);

        placeset.getRooms().add(forest);
        placeset.getRooms().add(lowland);
        placeset.getRooms().add(plain);
        placeset.getRooms().add(plateaus);
        placeset.getRooms().add(river);
        placeset.getRooms().add(sea);
        placeset.getRooms().add(shack);
        placeset.getRooms().add(snowmountain);
        placeset.getRooms().add(swamps);
        placeset.getRooms().add(volcaniccrater);


    }

    public void initdrug(){
        drug1.setId("1");
        drug1.setDescription("神仙水");
        drug1.setHealingPoints(20);


        drug2.setId("2");
        drug2.setDescription("肥仔快乐水");
        drug2.setHealingPoints(30);


        drugset.getDrugs().add(drug1);
        drugset.getDrugs().add(drug2);
    }


    public void play() {
        Scanner in = new Scanner(System.in);
        ui.displaywelcome();
        System.out.println("你有一封密函请查收");
        System.out.println("请输入yes");
        String choose1 = in.nextLine();
        ui.displayreceive(choose1);
        System.out.println("如果你愿意解救天下苍生,请输入：yes");
        String choose2 = in.nextLine();
        ui.displayrules(choose2);

        ui.displaystart();


        while (true) {
            //变换妖怪房间
            monsterdog.setCurrentplace(placeset.getplacebyid(Utils.getrandomplace()));
            monstertiger.setCurrentplace(placeset.getplacebyid(Utils.getrandomplace()));
            monstercat.setCurrentplace( placeset.getplacebyid(Utils.getrandomplace()));
            //变换药水的房间
            drug1.setCurrentroom(placeset.getplacebyid(Utils.getrandomplace()));
            drug2.setCurrentroom(placeset.getplacebyid(Utils.getrandomplace()));
//            System.out.println(this.drug1.getCurrentroom());
//            System.out.println(this.drug2.getCurrentroom());
            ui.displayStaus(this);
            String command = in.nextLine();
            String[] words = command.split(" ");
//            System.out.println("-----------------------------------------------------------");
//             System.out.println(drugset.getdrugbyid("1"));
//            System.out.println("-----------------------------------------------------------");
//            System.out.println(drugset.getdrugbyid("2"));
//            System.out.println("-----------------------------------------------------------");

            if (words[0].equals("bye")) {
                ui.displaybye();
            } else if (words[0].equals("help")) {
                ui.displayhelp();
            } else if (words[0].equals("chop")) {
                this.getPerson().useArticle(person.getCurrentweapon(), monsterset.getMonsterbyid(words[1]));

                if (this.getPerson().getCurrentplace().equals(this.getMonstercat().getCurrentplace())) {
                    if (Utils.getrandomchose().equals("1")) {
                        this.getMonstercat().useArticle(monstercat.getCurrentweapon(), person);
                        ui.displayDamageMsg(monstercat,person);
                    }
                }

                if (this.getPerson().getCurrentplace().equals(this.getMonsterdog().getCurrentplace())) {
                    if (Utils.getrandomchose().equals("1")) {
                        this.getMonsterdog().useArticle(monsterdog.getCurrentweapon(), person);
                        ui.displayDamageMsg(monsterdog,person);
                    }
                }

                if (this.getPerson().getCurrentplace().equals(this.getMonstertiger().getCurrentplace())) {
                    if (Utils.getrandomchose().equals("1")) {
                        this.getMonstertiger().useArticle(monstertiger.getCurrentweapon(), person);
                        ui.displayDamageMsg(monstertiger,person);
                    }

                }
                ui.displayDamageMsg(person,monsterset.getMonsterbyid(words[1]));

            }else if( words[0].equals("drink")){
                 person.drinkdrug(this.person,drugset.getdrugbyid(words[1]));
            }
                else if (words[0].equals("go")) {
                    this.person.setCurrentplace(placeset.getplacebyid(words[1]));
                } else {
                    ui.displayerror();
                }

            if(this.person.getHPvalue()<=0){

                System.out.println("游戏结束，看来解救苍生的重任还是不能交给你呀");

                break;
            }
            if(this.getMonsterdog().getHPvalue()<=0){
                if (this.getMonstercat().getHPvalue()<=0){
                    if (this.getMonstertiger().getHPvalue()<=0){
                        System.out.println("恭喜你，成功解救天下苍生");
                        break;
                    }
                }
            }

        }



    }
}


