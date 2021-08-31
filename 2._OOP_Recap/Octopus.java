public class Octopus extends Animal {

    public String activity() {
        String activity;

        // todo make activity number a random number from 1 - 10
        int activityNumber = 1;

        switch (activityNumber) {
            case 1: activity = "Eat";
                    break;
            case 2: activity = "Mate";
                    break;
            case 3: activity = "Sleep";
                    break;
            case 4, 5: activity = "Jet Ink";
                    break;
            default: activity = move();
        }

        return activity;
    }

    @Override
    public String move() {
        return "Swish Swosh";
    }

}
