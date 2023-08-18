import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(temps);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSales(temps);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(temps);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(temps);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAboveAverageSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageSales(temps);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(temps);

        Assertions.assertEquals(expected, actual);

    }
}