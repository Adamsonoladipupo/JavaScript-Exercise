import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

public class AutomaticBikeTest {

    // @BeforeEach
    // public void setUp(){
    //    AutomaticBike automaticBike = new AutomaticBike();
    // }
    
    @Test
    public void testingtoGetBikeStatus(){
        AutomaticBike automaticBike = new AutomaticBike();
        boolean expected = false;
        boolean actual = automaticBike.getBikeStatus();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeKeyCanTurnOnTheBike(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.startBike(true);
        boolean expected = true;
        boolean actual = automaticBike.getBikeStatus();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeKeyCanTurnOffTheBike(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.startBike(false);
        boolean expected = false;
        boolean actual = automaticBike.getBikeStatus();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeGearIncreaseWithIncreaseInBikeSpeed(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.changeSpeed(21);
        int expected = 2;
        int actual = automaticBike.getBikeGear();
        assertEquals(actual, expected);
    }

}
