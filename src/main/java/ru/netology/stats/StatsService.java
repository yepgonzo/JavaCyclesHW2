package ru.netology.stats;

// сумма всех продаж

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public long average(long[] sales) {
        return sum(sales) / 12;
        }

    // средняя сумма продаж
    public long AverageMonthlySales(long[] sales) {
        long amountSales = AverageMonthlySales(sales);
        long averageAmount = amountSales / sales.length;
        return averageAmount;
    }

    // минимум продаж
    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // пик продаж
    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // продажи ниже среднего
    public long lowAverageSales(long[] sales) {
        long averageAmount = lowAverageSales(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < averageAmount) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    // продажи выше среднего
    public long AboveAverageSales(long[] sales) {
        long averageAmount = AboveAverageSales(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > averageAmount) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}