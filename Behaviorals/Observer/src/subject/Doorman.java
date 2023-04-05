package subject;

public class Doorman extends Subject {
    private boolean status = false;

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(final boolean newStatus) {
        if (newStatus != status) {
            this.status = newStatus;
            this.notifyObservers(newStatus);
        }
    }

}
