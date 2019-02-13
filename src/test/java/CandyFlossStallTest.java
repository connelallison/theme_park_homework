import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void setUp() throws Exception {
        candyFlossStall = new CandyFlossStall("The Ice Cream Stall", "Imaginative Dave", "B4", 4);
    }

    @Test
    public void hasName() {
        assertEquals("The Ice Cream Stall", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Imaginative Dave", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("B4", candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasStartingPrice() {
        assertEquals(420, candyFlossStall.getStartingPrice());
    }
}
