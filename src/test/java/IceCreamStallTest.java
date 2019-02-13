import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("The Ice Cream Stall", "Imaginative Dave", "B4", 2);
    }

    @Test
    public void hasName() {
        assertEquals("The Ice Cream Stall", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Imaginative Dave", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("B4", iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasStartingPrice() {
        assertEquals(280, iceCreamStall.getStartingPrice());
    }
}
