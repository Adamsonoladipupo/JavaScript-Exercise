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
        automaticBike.changeGear(21);
        int expected = 2;
        int actual = automaticBike.getBikeGear();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeCanChangeSpeedIfAccelerated(){
        AutomaticBike automaticBike = new AutomaticBike(5,1);
        automaticBike.accelerateBike();
        int expected = 6;
        int actual = automaticBike.getBikeSpeed();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeCanChangeGearIfAccelerated(){
        AutomaticBike automaticBike = new AutomaticBike(20,1);
        automaticBike.accelerateBike();
        int expected = 2;
        int actual = automaticBike.getBikeGear();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeCanChangeSpeedIfDeccelerated(){
        AutomaticBike automaticBike = new AutomaticBike(5,1);
        automaticBike.deccelerateBike();
        int expected = 4;
        int actual = automaticBike.getBikeSpeed();
        assertEquals(actual, expected);
    }

    @Test
    public void testIfBikeCanChangeGearIfDeccelerated(){
        AutomaticBike automaticBike = new AutomaticBike(43,4);
        automaticBike.deccelerateBike();
        int expected = 3;
        int actual = automaticBike.getBikeGear();
        assertEquals(actual, expected);
    }
}
