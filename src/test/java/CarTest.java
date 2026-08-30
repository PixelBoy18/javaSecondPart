import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    void car_move_when_door_closed_car_on() {

        //object car
        //new Car();
        /*Car car = new Car();

        car.closeDoor();
        car.on();
        car.move();

        System.out.println("--------------------------");

        Car benz = new Car("benz");

        benz.on();*/

        //Given
        Car bmw = new Car("bmw");
        Car audi = new Car("audi");
        //When
        boolean isMovingBmw = bmw.is_moving();
        audi.on();
        audi.closeDoor();
        boolean ismovingAudi = audi.is_moving();
        //Then
        assertFalse(isMovingBmw);
        assertTrue(ismovingAudi);
    }

    //nested class
    class Car {
        //value
        boolean carStat; //false
        boolean doorStat; //false
        String brand;
        double width;
        double height;

        //constructor (6 ta)
        Car() {
            out.println("one car created");
        }

        Car(String brand) {
            this.brand = brand;
            out.println(this.brand + " car created");
        }

        //methods
        void on () {
            out.println("car turned on");
            carStat = true;
        }

        void off() {
            out.println("car turned off");
            carStat = false;
        }

        void openDoor() {
            out.println("door opened");
            doorStat = false;
        }

        void closeDoor() {
            out.println("door closed");
            doorStat = true;
        }

//        void move() {
//            //door closed, car turned on
//            if (carStat && doorStat) {
//                System.out.println("car moved");
//            } else {
//                System.out.println("car does not move");
//            }
//        }

        boolean is_moving() {
            //door closed, car turned on
            if (carStat && doorStat) {
                out.println("car moved");
                return true;
            } else {
                out.println("car dose not move");
                return false;
            }
        }
    }

}
