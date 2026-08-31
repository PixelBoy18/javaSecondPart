public class Motor {
    boolean isON;

    public void on () {
        isON = true;
    }

    public void off() {
        isON = false;
    }
    public boolean is_moving() {
        return isON;
    }
}
