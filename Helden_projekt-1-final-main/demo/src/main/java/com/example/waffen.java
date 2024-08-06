package com.example;



public class waffen {
    String name;
    String Typ; // Dolch , Schwert, Axt, Stab
    String Material; // Holz, Eisen, Dragonite 
    double Magie;
    double Smulti;
    int speed; // low = 1 , mid = 2, high = 3
    int durability;
    boolean used;
    

    //constructor
    public waffen(String name, String Typ, String Material, double Magie, double Smulti, int speed, int durability,boolean used){

        this.name = name;
        this.Typ = Typ;
        this.Magie = Magie;
        this.Material = Material;
        this.Smulti = Smulti;
        this.speed = speed;
        this.durability = durability;
        this.used = used;

    }
    int i = 0;
    
        // methode
    public double Stats(waffen curent){
    
        if (curent.Typ == "Fist"){
            curent.speed = 3;
            curent.Material = "";
            curent.Smulti = 1.0;
            curent.Magie = 1.0;
            curent.durability = 900;
        }
        if (curent.Typ == "Dolch") {
            //Speed
            curent.speed = 1;
            // Smulti
            switch(curent.Material){
            case "Holz" : curent.Smulti = 1.0;
            break;
            case "Eisen" : curent.Smulti = 1.5;
            break;
            case "Dragonite" : curent.Smulti = 2.0;
            break;
            }

            // Magie
            wuerfel c1 = new wuerfel();
            if (curent.Material == "Holz") {
            curent.Magie  = c1.wuerfeln2(1); 
            }
            if (curent.Material == "Eisen") {
                while (curent.Magie<2.0) {
            
                    curent.Magie = c1.wuerfeln2(2); 
                }
            }
            if (curent.Material == "Dragonite") {
                while (curent.Magie<3.0) {
            
                    curent.Magie = c1.wuerfeln2(3); 
                }
            }
        }
        if (curent.Typ == "Axt") {
            // Speed
            curent.speed = 3;
            // Smulti
            switch(curent.Material){
            case "Holz" : curent.Smulti = 2.0;
            break;
            case "Eisen" : curent.Smulti = 2.5;
            break;
            case "Dragonite" : curent.Smulti = 3.0;
            break;
            }

            // Magie
            wuerfel c1 = new wuerfel();
            if (curent.Material == "Holz") {
            curent.Magie  = c1.wuerfeln2(1); 
            }
            if (curent.Material == "Eisen") {
                while (curent.Magie<2.0) {
            
                    curent.Magie  = c1.wuerfeln2(2); 
                }
            }
            if (curent.Material == "Dragonite") {
                while (curent.Magie<3.0) {
            
                    curent.Magie  = c1.wuerfeln2(3); 
                }
            }
        }
        if (curent.Typ == "Schwert") {
            // Speed
            curent.speed = 2;
            // Smulti
            switch(curent.Material){
                case "Holz" : curent.Smulti = 1.5;
            break;
                case "Eisen" : curent.Smulti = 2.0;
            break;
                case "Dragonite" : curent.Smulti = 2.5;
            break;
            }
            // Magie
            wuerfel c1 = new wuerfel();
            if (curent.Material == "Holz") {
                curent.Magie  = c1.wuerfeln2(1); 
            }
            if (curent.Material == "Eisen") {
                while (curent.Magie<2.0) {
            
                    curent.Magie  = c1.wuerfeln2(2); 
                }
            }
            if (curent.Material == "Dragonite") {
                while (curent.Magie<3.0) {
            
                    curent.Magie  = c1.wuerfeln2(3); 
                }
            }
        }
        if (curent.Typ == "Stab") {
            // Speed
            curent.speed = 2;
            // Smulti
            switch(curent.Material){
            case "Holz" : curent.Smulti = 1.0;
            break;
            case "Eisen" : curent.Smulti = 1.5;
            break;
            case "Dragonite" : curent.Smulti = 2.0;
            break;
            }
            // Magie
            wuerfel c1 = new wuerfel();
            if (curent.Material == "Holz") {
                while (curent.Magie<2.0) {
                    curent.Magie  = c1.wuerfeln2(2); 
                }
            }
            if (curent.Material == "Eisen") {
                while (curent.Magie<3.0) {
                    curent.Magie  = c1.wuerfeln2(3); 
                }
            }
            if (curent.Material == "Dragonite") {
                while (curent.Magie<4.0) {
                    curent.Magie  = c1.wuerfeln2(4); 
                }
            }
        }
        curent.name = curent.Material + curent.Typ + "_" + curent.Magie;

        // durability
        if(curent.Material == "Holz"){
            curent.durability = 50;
        }
        if(curent.Material == "Eisen"){
            curent.durability = 100;
        }
        if(curent.Material == "Dragonite"){
            curent.durability = 150;
        }

        curent.used = false;
        
        return 0.0;
    }


    

    public String getName(waffen curent){
        return curent.name;
    }

}