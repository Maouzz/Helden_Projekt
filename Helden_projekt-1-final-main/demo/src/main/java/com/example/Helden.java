package com.example;




public class Helden {
    
    String name;
    String typ;
    int staerke;
    int intelligence;
    int lebenspunkte;
    int verteidigung;
    waffen aktuelleWeapon;
    int Matk;
    int Mdef;
    int nextw;
    boolean tod;
    int fight_count;
    boolean inWarteschlange;
    
    
    

    public Helden(String name, String typ, int staerke ,int intelligence ,int lebenspunkte, int verteidigung, waffen aktuelleWeapon, int Matk, int Mdef, int nextw, boolean tod, int fight_count, boolean inWarteschlange){
        this.name = name;
        this.typ = typ;
        this.staerke = staerke;
        this.intelligence = intelligence;
        this.lebenspunkte = lebenspunkte;
        this.verteidigung = verteidigung;
        this.aktuelleWeapon = aktuelleWeapon;
        this.Matk = Matk;
        this.nextw =nextw;
        this.Mdef = Mdef;
        this.tod = tod;
        this.fight_count = fight_count;
        this.inWarteschlange = inWarteschlange;
        
        

    }
    
    
    //  inventar 
    
    

    public void stats(Helden Held){
        
        if (Held.typ == "Paladin") {
            Held.staerke = 5;
            Held.intelligence = 3;
            Held.lebenspunkte = 50;
            Held.verteidigung = 5;
            Matk = 0;
            nextw = 0;
            Mdef = 0;
            tod = false;
            fight_count = 0;
            inWarteschlange = false;
           
        }
        if (Held.typ == "Mage") {
            Held.staerke = 2;
            Held.intelligence = 7;
            Held.lebenspunkte = 30;
            Held.verteidigung = 3;
            Matk = 0;
            nextw = 0;
            Mdef = 0;
            tod = false;
            fight_count = 0;
            inWarteschlange = false;
            
        }
        if (Held.typ == "Thief") {
            Held.staerke = 3;
            Held.intelligence = 4;
            Held.lebenspunkte = 40;
            Held.verteidigung = 6;
            Matk = 0;
            nextw = 0;
            Mdef = 0;
            tod = false;
            fight_count = 0;
            inWarteschlange = false;
            
        }
        if (Held.typ == "Babar") {
            Held.staerke = 8;
            Held.intelligence = 2;
            Held.lebenspunkte = 60;
            Held.verteidigung = 5;
            Matk = 0;
            nextw = 0;
            Mdef = 0;
            tod = false;
            fight_count = 0;
            inWarteschlange = false;
            
        }
        
        
    }
    // methoden
    


   
    public void angriff(Helden Held){
        
        wuerfel c1 = new wuerfel();
        double crit = c1.wuerfeln2(1);
        Long x = Math.round((Held.staerke * Held.aktuelleWeapon.Smulti + Held.aktuelleWeapon.Magie * Held.intelligence) * crit); 
        int Matk = Long.valueOf(x).intValue();
        Held.Matk = Matk;
    }

    public void verteidigen(Helden Held){

        wuerfel c1 = new wuerfel();
        double vert = c1.wuerfeln2(1);
        Long v = Math.round(Held.verteidigung * vert);
        int Mdef = Long.valueOf(v).intValue();
        Held.Mdef = Mdef;
    }

    public void waffentausch(Helden Held, Heldeninventar HI){
        
        Held.aktuelleWeapon = HI.Helden_waffen_inventar.get(Held.nextw);
        if (HI.Helden_waffen_inventar.get(Held.nextw) != HI.Helden_waffen_inventar.get(0)) {
            Held.aktuelleWeapon.used = true;
        }
        
       
    }

    
}
