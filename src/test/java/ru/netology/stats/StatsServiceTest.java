package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        assertEquals(expected, actual);
    }
        @Test
        public void findAverageMonthlySales() {
            StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            long expected = 15;
            long actual = service.AverageMonthlySales(sales);
            assertEquals(expected, actual);

        }

        @Test
        public void findMinSales() {
            StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            long expectedNumberMonth = 9;
            long actualNumberMonth = service.minSales(sales);
            assertEquals(expectedNumberMonth, actualNumberMonth);

        }
        @Test
        public void shouldFindMaxSales() {
            StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            long expectedNumberMonth = 8;
            long actualNumberMonth = service.maxSales(sales);
            assertEquals(expectedNumberMonth, actualNumberMonth);

        }
        @Test
        public void findLowAverageSales() {
            StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            long expected = 5;
            long actual = service.lowAverageSales(sales);
            assertEquals(expected, actual);

        }
        @Test
        public void findAboveAverageSales() {
            StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            long expected = 5;
            long actual = service.AboveAverageSales(sales);
            assertEquals(expected, actual);

        }
    }