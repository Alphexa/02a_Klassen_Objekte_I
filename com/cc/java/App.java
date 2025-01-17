package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // 2. Iteration
        //Instanziierung ---> erzeugen eines Objektes duch 
        // Aufruf eines Konstruktors
        // Objekt <----> Instanz
        // cat --> Referenzvariable
        // Cat --> Referenztyp (Klasse)




        // Cat cat = new Cat();
        Cat cat = new Cat("Grizabella", "white", 29);



        //output ("Blick von aussen: " + cat);
        //cat.getInstanceVariable();


        // Werte zuweisen
        // cat.firstName = "Grizabella";
        // cat.furColor = "blue";
        // cat.age = 29;
        
        // Werte ausgeben & NULL Ausgabe 
        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge()));

        output("-------------------");
        // output(null);
        // IMPLIZITE Typumwandlung Cat --> String
        // output("Objekt: " + cat);
        // = 
        // output ("Blick von aussen: " + cat);

        System.out.println(cat);     //ln steht für Linefeed

        System.out.println("----------------------");
        // output ("--------------------");


        // 
        Cat cat2 = new Cat("Alonzo", "grey", 35);
        // output ("Blick von aussen: " + cat2);

        // cat2.firstName = "Alonzo";
        // cat2.furColor = "grey"; 
        // cat2.age = 35;

        // Werte 2. ausgeben
        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));
 }


    public static void output(String outputStr){
        System.out.println(outputStr);   


    }
 }
