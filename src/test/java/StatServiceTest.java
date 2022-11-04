import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;
public class StatServiceTest {
    private int expected;
    @Test
    public void testSum() { // Сумма продаж
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.sum(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 19);

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() { // Максимальные продажи
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.maxSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void minSales() { // Минимальные продажи
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void average() { // Средние продажи
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.average(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void MinSales() { // Продажи ниже среднего
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.MinSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void MaxSales() { // Продажи выше среднего
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long actual = service.MaxSales(sales);
        long expected = 6;

        assertEquals(expected, actual);
    }
}
