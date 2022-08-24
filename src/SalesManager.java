import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long truncatedMean() {
        long max = -1;
        Arrays.sort(sales);
        long min = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        long sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        long result = (sum - min - max)/ (sales.length - 2);
        return result;
    }
}
