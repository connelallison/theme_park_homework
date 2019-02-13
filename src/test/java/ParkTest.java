import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Comfy Attractions.Park", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Comfy Attractions.Park", park.getName());
    }
}
