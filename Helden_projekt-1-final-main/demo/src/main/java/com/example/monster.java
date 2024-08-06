package com.example;

public class monster {
    String name; 
    String typ; // Bat, Goblin, Skelleton, Ork, Wraith, Mimic_Chest, Animated_Armor, Evel_Wizard, Dragon
    int staerke; 
    int lebenspunkte; 
    int speed; 
    int verteidigung; 
    int Matk;
    int Mdef;
    int wmulti; 
    boolean tod;
  

    public monster(String name,String typ,int staerke,int lebenspunkte, int speed, int verteidigung, int Matk, int Mdef,int wmulti, boolean tod){
    this.name = name;
    this.typ = typ;
    this.staerke = staerke;
    this.lebenspunkte = lebenspunkte;
    this.speed = speed;
    this.verteidigung = verteidigung;
    this.Matk = Matk;
    this.Mdef = Mdef;
    this.wmulti = wmulti;
    this .tod = tod;
   

    }
    
    public void stats(monster monster){ 
       
        tod = false;
        name = monster.typ;

        switch(typ){
            case "" : 
            tod = true;
            break;

            case "Bat" :           
            staerke = 3;
            lebenspunkte = 20;
            speed = 1;
            verteidigung = 2;
            wmulti = 1;
            break;

            case "Goblin" : 
            staerke = 5;
            lebenspunkte = 20;
            speed = 3;
            verteidigung = 3;
            wmulti = 1;
            break;

            case "Skeleton" : 
            staerke = 8;
            lebenspunkte = 30;
            speed = 3;
            verteidigung = 5;
            wmulti = 2;
            break;

            case "Wraith" : 
            staerke = 12;
            lebenspunkte = 25;
            speed = 1;
            verteidigung = 6;
            wmulti = 3;
            break;

            case "Mimic_Chest" : 
            staerke = 15;
            lebenspunkte = 60;
            speed = 3;
            verteidigung = 12;
            wmulti = 4;
            break;

            case "Animated_Armor" : 
            staerke = 20;
            lebenspunkte = 60;
            speed = 2;
            verteidigung = 15;
            wmulti = 4;
            break;

            case "Ork" : 
            staerke = 25;
            lebenspunkte = 60;
            speed = 3;
            verteidigung = 10;
            wmulti = 5;
            break;

            
            case "Evil_Wizard" : 
            staerke = 30;
            lebenspunkte = 50;
            speed = 2;
            verteidigung = 15;
            wmulti = 5;
            break;

            case "Dragon" : 
            staerke = 40;
            lebenspunkte = 200;
            speed = 2;
            verteidigung = 30;
            wmulti = 5;
            break;
            
        }
    }

    public void angriff(monster Gegner){
        wuerfel c1 = new wuerfel();
        double crit = c1.wuerfeln2(1);
        Long x = Math.round(Gegner.staerke * crit);
        int Matk = Long.valueOf(x).intValue();
        Gegner.Matk = Matk;
    }

    public void verteidigen(monster Gegner){
        wuerfel c1 = new wuerfel();
        double vert = c1.wuerfeln2(1);
        Long v = Math.round(Gegner.verteidigung * vert);
        int Mdef = Long.valueOf(v).intValue();
        Gegner.Mdef = Mdef;
    }

    public int getVerteidigung(){
        return verteidigung;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }


}
