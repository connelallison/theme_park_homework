import Stalls.WhiskyStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiskyStallTest {
    WhiskyStall whiskyStall;

    @Before
    public void setUp() throws Exception {
        whiskyStall = new WhiskyStall("The Ice Cream Stall", "Imaginative Dave", "B4", 5);
    }

    @Test
    public void hasName() {
        assertEquals("The Ice Cream Stall", whiskyStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Imaginative Dave", whiskyStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("B4", whiskyStall.getParkingSpot());
    }

    @Test
    public void hasStartingPrice() {
        assertEquals(660, whiskyStall.getStartingPrice());
    }
}
