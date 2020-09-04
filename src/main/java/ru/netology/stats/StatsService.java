package ru.netology.stats;

public class StatsService {
    /* Сумма всех продаж */
    public long calculateSumByYear(long[] salesByMonth) {
        long SumByYear = 0;
        long Index = 0;
        for (long sale : salesByMonth) {
            SumByYear += sale;
            Index = Index + 1;
        }
        return SumByYear;
    }
    /* Средняя сумма всех продаж */
    public long calculateAverageSaleByYear(long[] salesByMonth) {
        long Index = 0;
        for (long sale : salesByMonth) {
            Index = Index + 1;
        }
        StatsService service = new StatsService();
        long AverageSaleByYear = service.calculateSumByYear(salesByMonth) / Index;
        return AverageSaleByYear;
    }
    /* Номер месяца в котором был пик продаж */
    public long showMonthMaxSales(long[] salesByMonth) {
        long MaxSales = salesByMonth[0];
        long indexForMax = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            long sale = salesByMonth[i];
            if (sale >= MaxSales) {
                MaxSales = sale;
                indexForMax = i + 1;
            }
        }
        return indexForMax;
    }
    /* Номер месяца в котором был минимум продаж */
    public long showMonthMinSales(long[] salesByMonth) {
        long MaxSales = salesByMonth[0];
        long indexForMax = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            long sale = salesByMonth[i];
            if (sale <= MaxSales) {
                MaxSales = sale;
                indexForMax = i + 1;
            }
        }
        return indexForMax;
    }
    /* Кол-во месяцев, в которых продажи были ниже среднего */
    public long calculateMonthsLowerAverageSales(long[] salesByMonth) {
        long MonthsLowerAverageSales = 0;
        StatsService service = new StatsService();
        for (long sale : salesByMonth) {
            if (sale < service.calculateAverageSaleByYear(salesByMonth)) {
                MonthsLowerAverageSales = MonthsLowerAverageSales + 1;
            }
        }
        return MonthsLowerAverageSales;
    }
    /* Кол-во месяцев, в которых продажи были выше среднего */
    public long calculateMonthsUpperAverageSales(long[] salesByMonth) {
        long MonthsUpperAverageSales = 0;
        StatsService service = new StatsService();
        for (long sale : salesByMonth) {
            if (sale > service.calculateAverageSaleByYear(salesByMonth)) {
                MonthsUpperAverageSales = MonthsUpperAverageSales + 1;
            }
        }
        return MonthsUpperAverageSales;
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