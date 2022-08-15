package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    // сумма продаж
    @Test
    public void sumSales() {
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);
        long actual = service.sum(sales);
        assertEquals(expected, actual);
    }

    // средняя сумма продаж
    @Test
        public void findAverageMonthlySales() {
            long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
            long actual = service.average(sales);
            assertEquals(expected, actual);
        }

    // минимум продаж
    @Test
        public void findMinSales() {
            long expected = 9;
            long actual = service.minSales(sales);
            assertEquals(expected, actual);
        }

    // пик продаж
    @Test
        public void shouldFindMaxSales() {
            long expected = 8;
            long actual = service.maxSales(sales);
            assertEquals(expected, actual);
        }

    // выше среднего
    @Test
        public void shouldFindMonthOfMoreSales() {
        int expected = 5;
        int actual = service.countAboveAvg(sales);
        assertEquals(expected, actual);
    }

    // ниже среднего
    @Test
        public void shouldFindMonthOfLessSales() {
        int expected = 5;
        int actual = service.countLowAvg(sales);
        assertEquals(expected, actual);
    }
}