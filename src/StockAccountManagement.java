import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to stock account management");
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.println("Enter the number of stocks: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the stock name: ");
            String name = scanner.next();
            System.out.println("Enter the number of shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.println("Enter the share price: ");
            double sharePrice = scanner.nextDouble();
            Stock stock = new Stock(name, numberOfShares, sharePrice);
            portfolio.addStock(stock);
        }
        portfolio.printStockReport();
        scanner.close();
    }
}
