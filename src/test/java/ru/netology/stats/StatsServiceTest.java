package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    /* Сумма всех продаж */
    @Test
    void shouldCalculateSumByYear() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumByYear(salesByMonth);
        assertEquals(expected, actual);
    }
    /* Средняя сумма всех продаж */
    @Test
    void shouldCalculateAverageSaleByYear() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSaleByYear(salesByMonth);
        assertEquals(expected, actual);
    }
    /* Номер месяца в котором был пик продаж */
    @Test
    void shouldShowMonthMaxSales() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.showMonthMaxSales(salesByMonth);
        assertEquals(expected, actual);
    }
    /* Номер месяца в котором был минимум продаж */
    @Test
    void shouldShowMonthMinSales() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.showMonthMinSales(salesByMonth);
        assertEquals(expected, actual);
    }
    /* Кол-во месяцев, в которых продажи были ниже среднего */
    @Test
    void shouldCalculateMonthsLowerAverageSales() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateMonthsLowerAverageSales(salesByMonth);
        assertEquals(expected, actual);
    }
    /* Кол-во месяцев, в которых продажи были выше среднего */
    @Test
    void shouldCalculateMonthsUpperAverageSales() {
        long[] salesByMonth;
        salesByMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateMonthsUpperAverageSales(salesByMonth);
        assertEquals(expected, actual);
    }
}
