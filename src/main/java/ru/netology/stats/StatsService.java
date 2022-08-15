package ru.netology.stats;

public class StatsService {

    // сумма всех продаж

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж

    public long average(long[] sales) {
        return sum(sales) / 12;
        }

    public int AverageMonthlySales(int[] sales) {
        int amountSales = AverageMonthlySales(sales);
        int averageAmount = amountSales / sales.length;
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
    public int countAboveAvg(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

    // продажи ниже среднего
    public int countLowAvg(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
}

