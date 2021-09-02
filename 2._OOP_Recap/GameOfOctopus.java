public class GameOfOctopus extends Thread {

    @Override
    public void run() {
        Octopus otto = new Octopus();
        otto.makeDoActivity();
    }


    // make main instantiate the game from here and allow for a new thread to create an octopus

}
