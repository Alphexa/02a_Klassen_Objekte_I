package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // 2. Iteration
        //Instanziierung ---> erzeugen eines Objektes duch 
        // Aufruf eines Konstruktors
        // Objekt <----> Instanz
        // cat --> Referenzvariable
        // Cat --> Referenztyp (Klasse)




        Cat cat = new Cat();
        //output ("Blick von aussen: " + cat);
        //cat.getInstanceVariable();


        // Werte zuweisen
        cat.firstName = "Grizabella";
        cat.furColor = "white";
        // cat.age = 29;
        
        // Werte ausgeben & NULL Ausgabe 
        output(cat.firstName);
        output(cat.furColor);
        output(Integer.toString(cat.age));

        output("-------------------");
        // output(null);
        // IMPLIZITE Typumwandlung Cat --> String
        // output("Objekt: " + cat);
        // = 
        // output ("Blick von aussen: " + cat);

        System.out.println(cat);     //ln steht für Linefeed

        System.out.println("----------------------");
        // output ("--------------------");


        Cat cat2 = new Cat();
        // output ("Blick von aussen: " + cat2);

        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;


        output(cat2.firstName);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));
 }


    public static void output(String outputStr){
        System.out.println(outputStr);   


    }
 }
