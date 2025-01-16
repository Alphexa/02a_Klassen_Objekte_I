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
        output ("Blick von aussen: " + cat);

        // IMPLIZITE Typumwandlung Cat --> String
        // output("Objekt: " + cat);
        // = 
        // output ("Blick von aussen: " + cat);

        System.out.println(cat);     //ln steht für Linefeed

        System.out.println("----------------------");
        output ("--------------------");


        Cat cat2 = new Cat();
        output ("Blick von aussen: " + cat2);

        
 }


    public static void output(String outputStr){
        System.out.println(outputStr);   


    }
 }
