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
}
