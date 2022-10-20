public class StatService { // сумма продаж
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int maxSales(long[] sales) { // максимальные продажи
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // минимальные продажи
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

    public long average(long[] sales) {
        return sum(sales) / 12;
    } // средняя сумма продаж

    public int avgLess(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // Количества месяцев, к которых продажи ниже среднего

    public int MinSales(long[] sales) { // максимальные продажи
        int MinMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sales[MinMonth]) {
                MinMonth = month;
            }
            month = month + 1;
        }
        return MinMonth + 1;
    }

    // Количества месяцев, к которых продажи выше среднего

    public int MaxSales(long[] sales) { // максимальные продажи
        int MaxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sales[MaxMonth]) {
                MaxMonth = month;
            }
            month = month + 1;
        }
        return MaxMonth + 1;
    }
}





