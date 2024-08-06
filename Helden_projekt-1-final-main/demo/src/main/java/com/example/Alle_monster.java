package com.example;

import java.util.ArrayList;

public class Alle_monster {
    
    int i = 0;
    ArrayList <monster> alle_monster = new ArrayList <monster>();

    public Alle_monster(int i){
        this.i = i;
    }

    public void newMonster(String Area){
        String typ = "";

        switch (Area) {

            case "1":
                wuerfel c1 = new wuerfel();
                int h = c1.wuerfeln1(2);

                if (h == 1) {
                    typ = "Bat";
                }

                if (h == 2) {
                    typ = "Goblin";
                }

                if (h == 3) {
                    typ = "Skeleton";
                }
            break;


            
            case "2":
                wuerfel c2 = new wuerfel();
                int j = c2.wuerfeln1(2);

                if (j == 1) {
                    typ = "Wraith";
                }

                if (j == 2) {
                    typ = "Mimic_Chest";
                }

                if (j == 3) {
                    typ = "Animated_Armor";
                }
            break;


            case "3":
                wuerfel c3 = new wuerfel();
                int k = c3.wuerfeln1(1);

                if (k == 1) {
                    typ = "Ork";
                }

                if (k == 2) {
                    typ = "Evil_Wizard";
                }
            break;

            case "4":
                typ = "Dragon";
            
            break;

            case "5":
                typ = "";
            
            break;
        
            default:
            break;

            
        }
        alle_monster.add(new monster("",typ,0,0,0,0,0,0,0,false));
        alle_monster.get(i).stats(alle_monster.get(i)); 
        i = i + 1;
    }
}