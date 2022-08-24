import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int truncatedMean() {
        int max = -1;
        Arrays.sort(sales);
        int min = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        int result = (sum - min - max)/ (sales.length - 2);
        return result;
    }
}
