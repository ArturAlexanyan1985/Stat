import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class StatServiceTest {

    private int expected;

    @Test
    public void testSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.sum(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 19);

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.maxSales(sales);
        long expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.minSales(sales);
        long expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void average() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.average(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

}
