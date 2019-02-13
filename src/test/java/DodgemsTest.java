import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 12, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(12, dodgems.getCapacity());
    }

    @Test
    public void hasStartingPrice() {
        assertEquals(450, dodgems.getStartingPrice());
    }
}
