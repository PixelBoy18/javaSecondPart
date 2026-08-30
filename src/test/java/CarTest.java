import org.junit.jupiter.api.Test;

public class CarTest {

    //nested class
    class Car {
        //value
        boolean carStat;
        boolean doorStat;
        double width;
        double height;

        //methods
        void on () {
            System.out.println("car turned on");
            carStat = true;
        }

        void off() {
            System.out.println("car turned off");
            carStat = false;
        }

        void openDoor() {
            System.out.println("door opened");
            doorStat = true;
        }

        void closeDoor() {
            System.out.println("door closed");
            doorStat = false;
        }

        void move() {
            //door closed, car turned on
            if (carStat && doorStat) {
                System.out.println("car moved");
            } else {
                System.out.println("car dose not move");
            }
        }
    }

}
