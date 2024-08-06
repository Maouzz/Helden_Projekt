package com.example;
import java.util.ArrayList;

public class Alle_waffen {
    
    int i = 0;
    ArrayList <waffen> alle_waffen = new ArrayList <waffen>();

    public Alle_waffen(int i){
        this.i = i;
    }
     

    public void newWaffe(int wmulti){
        String Typ = "";
        String Material = "";
        

        
        wuerfel c2 = new wuerfel();
        int h = c2.wuerfeln1(3);
        switch(h){
            case 1:
                Typ = "Dolch";
            break;

            case 2:
                Typ = "Schwert";
            break;

            case 3:
                Typ = "Axt";
            break;

            case 4:
                Typ = "Stab";
            break;

        }

        if (wmulti == 1){
            Material = "Holz";
        }

        if (wmulti == 2){
            wuerfel c1 = new wuerfel();
            int l = c1.wuerfeln1(9);
            if(l > 8){
                Material = "Holz";
            }
            else{
                Material = "Eisen";
            }
        }
        
        if (wmulti == 3){
            Material = "Eisen";
        }
        
        if (wmulti == 4){
            wuerfel c1 = new wuerfel();
            int l = c1.wuerfeln1(9);
            if(l > 8){
                Material = "Eisen";
            }
            else{
                Material = "Dragonite";
            }
        }

        if (wmulti == 5){
            wuerfel c1 = new wuerfel();
            int l = c1.wuerfeln1(9);
            if(l > 6){
                Material = "Eisen";
            }
            else{
                Material = "Dragonite";
            }
        }
        
        
        
        alle_waffen.add(new waffen("",Typ,Material, 0.0, 0.0,0,0,false)); 
        alle_waffen.get(i).Stats(alle_waffen.get(i));

        i = i + 1; 
    }
}
