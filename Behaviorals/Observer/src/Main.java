import observers.Friend;
import observers.Wife;
import subject.Doorman;

public class Main {

    public static void main(String[] args) {
        final Doorman doorman = new Doorman();
        final Wife wife = new Wife();
        final Friend friend = new Friend();

        doorman.add(wife);
        doorman.add(friend);

        System.out.println("Husband is coming");
        doorman.setStatus(true);
        doorman.setStatus(true);
        doorman.setStatus(false);
        doorman.setStatus(true);
    }

}