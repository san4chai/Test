public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{20, 30, 15, 7, 9, 5});
        System.out.println("Масимальное число продаж: " + manager.max());
        System.out.println("Среднее обрезанное значение: " + manager.truncatedMean());
    }
}
