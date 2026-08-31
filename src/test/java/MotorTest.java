import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void motor_move_when_car_on() {
        //Given
        Motor motor1 = new Motor();
        //When
        motor1.on();
        boolean isMoving = motor1.is_moving();
        //Then
        Assertions.assertTrue(isMoving);
    }
}

