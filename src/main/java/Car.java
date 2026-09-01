
import static java.lang.System.out;

public class Car extends engines{
    boolean isClose; //false
    String brand;
    double width;
    double height;

    //constructor (6 ta)

    public Car() {
        out.println("one car created");
    }

    public Car(String brand) {
        this.brand = brand;
        out.println(this.brand + " car created");
    }

    //methods

    public void openDoor() {
        out.println("door opened");
        isClose = false;
    }

    public void closeDoor() {
        out.println("door closed");
        isClose = true;
    }

    public boolean is_moving() {
        //door closed, car turned on
        if (isON && isClose) {
            out.println("car moved");
            return true;
        } else {
            out.println("car dose not move");
            return false;
        }
    }
}
