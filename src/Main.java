public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[]{10, 5, 3, 6});
        System.out.println("Масимальное число продаж: " + manager.max());
        System.out.println("Среднее обрезанное значение: " + manager.truncatedMean());
    }
}
