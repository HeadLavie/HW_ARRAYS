package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum = sum + (int) sales[i];

        }

        return sum;
    }

    public int averageSales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum = sum + (int) sales[i];

        }
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int aboveAverageSales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum = sum + (int) sales[i];

        }
        int average = sum / sales.length;

        int aboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }

    public int belowAverageSales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum = sum + (int) sales[i];

        }
        int average = sum / sales.length;

        int belowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

}


