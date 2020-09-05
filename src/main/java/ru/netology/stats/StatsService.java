package ru.netology.stats;

public class StatsService {
    /* Сумма всех продаж */
    public long calculateSumByYear(long[] salesByMonth) {
        long sumByYear = 0;
        long index = 0;
        for (long sale : salesByMonth) {
            sumByYear += sale;
            index++;
        }
        return sumByYear;
    }
    /* Средняя сумма всех продаж */
    public long calculateAverageSaleByYear(long[] salesByMonth) {
        StatsService service = new StatsService();
        long averageSaleByYear = service.calculateSumByYear(salesByMonth) / salesByMonth.length;
        return averageSaleByYear;
    }
    /* Номер месяца в котором был пик продаж */
    public long showMonthMaxSales(long[] salesByMonth) {
        long maxSales = salesByMonth[0];
        long indexForMax = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            long sale = salesByMonth[i];
            if (sale >= maxSales) {
                maxSales = sale;
                indexForMax = i + 1;
            }
        }
        return indexForMax;
    }
    /* Номер месяца в котором был минимум продаж */
    public long showMonthMinSales(long[] salesByMonth) {
        long maxSales = salesByMonth[0];
        long indexForMax = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            long sale = salesByMonth[i];
            if (sale <= maxSales) {
                maxSales = sale;
                indexForMax = i + 1;
            }
        }
        return indexForMax;
    }
    /* Кол-во месяцев, в которых продажи были ниже среднего */
    public long calculateMonthsLowerAverageSales(long[] salesByMonth) {
        long monthsLowerAverageSales = 0;
        StatsService service = new StatsService();
        for (long sale : salesByMonth) {
            if (sale < service.calculateAverageSaleByYear(salesByMonth)) {
                monthsLowerAverageSales++;
            }
        }
        return monthsLowerAverageSales;
    }
    /* Кол-во месяцев, в которых продажи были выше среднего */
    public long calculateMonthsUpperAverageSales(long[] salesByMonth) {
        long monthsUpperAverageSales = 0;
        StatsService service = new StatsService();
        for (long sale : salesByMonth) {
            if (sale > service.calculateAverageSaleByYear(salesByMonth)) {
                monthsUpperAverageSales++;
            }
        }
        return monthsUpperAverageSales;
    }
}
    /* Средняя сумма всех продаж первый вариант
    public long calculateAverageSaleByYear(long[] salesByMonth) {
        long SumByYear = 0;
        long Index = 0;
        for (long sale : salesByMonth) {
            SumByYear += sale;
            Index = Index + 1;
        }
        long Average = SumByYear / Index;
        return Average;
    }*/
