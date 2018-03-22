// going to maintain, update or render the objects. going to loop through all the objects in the game and individually update them and render them to the screen.

package com.tutorial.main;

public abstract class GameObject {
    //this refers to all our game objects, going to be inheriting all th efunctions put into our game object.

    protected int x, y;
    // initilalizes x and y so you don't need to do this in other classes.

    protected ID id;

    protected int velX, velY;

    public GameObject(int x, int y, ID id){

        this.x = x;
        this.y = y;
        this.id = id;
    }
        public abstract void tick();
        public abstract void render(Graphics g);

}
