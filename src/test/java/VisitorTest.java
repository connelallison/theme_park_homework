import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor(22, 182, 10000);
    }

    @Test
    public void hasAge() {
        assertEquals(22, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(182, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(10000, visitor.getMoney());
    }
}
