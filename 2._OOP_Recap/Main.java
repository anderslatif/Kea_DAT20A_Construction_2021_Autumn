public class Main {

    /* todo
    *  Create a zoo / aquarium
    *  It's possible to name threads in Java
    *  (Give each animal a unique name and say who is doing what)
    *  ASCII animations that move when move is called?
    *  Animals can die
    *  Change the activity frequency to your liking
    *
    * */

    public static void main(String[] args) {

        GameOfOctopus game = new GameOfOctopus();
//        game.start(); // creates a new thread
//        game.run(); // calls run in the main thread but doesn't create a new thread

        game.start();

    }

}
