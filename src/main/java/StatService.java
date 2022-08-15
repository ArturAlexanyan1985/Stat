import org.jetbrains.annotations.NotNull;

public class StatService {
    public long sum(long @NotNull [] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
    return sum;
    }

    public int maxSales(long @NotNull [] sales) {
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

    public int minSales(long[] sales) {
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
    }

    public int avgLess(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales ) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
}




