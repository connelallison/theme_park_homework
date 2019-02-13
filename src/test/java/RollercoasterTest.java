import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Space Mountain", 140, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Space Mountain", rollercoaster.getName());
    }

    @Test
    public void hasTopSpeed() {
        assertEquals(140, rollercoaster.getTopSpeed());
    }

    @Test
    public void hasStartingPrice() {
        assertEquals(840, rollercoaster.getStartingPrice());
    }
}
