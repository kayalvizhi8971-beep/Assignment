public class MonthlySales {

    public static void main(String[] args) {

        // Monthly sales data (Jan to Dec)
        int[] branchA = {12000, 15000, 13000, 14000, 16000, 17000,
                         18000, 19000, 20000, 21000, 22000, 23000};

        int[] branchB = {10000, 14000, 12000, 13500, 15500, 16500,
                         17500, 18500, 19500, 20500, 21500, 22500};

        int[] totalSales = new int[12];

        // Adding both branch sales
        for (int i = 0; i < 12; i++) {
            totalSales[i] = branchA[i] + branchB[i];
        }

        // Display result
        System.out.println("Total Monthly Sales:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i + 1) + ": " + totalSales[i]);
        }
    }
}
