package observers;

public class Wife implements Observer {

    public void partyTime() {
        System.out.println("Let's Party! :D");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            this.partyTime();
        } else {
            System.out.println("Hold!");
        }
    }

}
