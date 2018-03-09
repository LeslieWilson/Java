package com.tutorial.main;

public class Game extends Canvas implements Runnable{

//need serialversion thing


public static final int WIDTH = 640, HEIGHT = WIDTH /12 * 9;

private Thread thread;
private boolean running = false;



public Game(){
    new Windo w(WIDTH, HEIGHT, "Lets build a game", this);
}
    public synchronized void start(){
        thread = new Thread (this);
        thread.start ();

    }
    public synchronized void stop(){
        try{

        }catch(Excepttion e){
            e.printStackTrace();
        }

    }
    public void run(){

    }
    public static void main(String args[]){
            new Game();

    }
}

// public means the method is visible and can be called from other objects of other types. alternatives are private, protected, package and package-private.

// static means the method is associated with teh class, not a specific instance (object)of the class. this means you can call a static method without creating an object of the class.

//void means the method has no return valie. if the method returned an int you would write int instead of void.

//you see the combo of all three of these most commonly on the main method.
