import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to stock account management");
        Scanner scanner = new Scanner(System.in);
       StockAccount stockAccount = new StockAccount();

       while(true) {
           System.out.println("\nMenu");
           System.out.println("1. Buy stocks");
           System.out.println("2. Sell stocks");
           System.out.println("3. Print stock report");
           System.out.println("4. Save account");
           System.out.println("5. Exit");
           System.out.println("Enter your choice: ");
           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Enter the stock symbol for buying: ");
                   String buySymbol = scanner.next();
                   System.out.println("Enter the number of shares to buy: ");
                   int buyShares = scanner.nextInt();
                   System.out.println("Enter the share price: ");
                   double buyPrice = scanner.nextDouble();
                   stockAccount.buy(buyShares, buySymbol, buyPrice);
                   break;
               case 2:
                   System.out.println("Enter the stock symbol for selling: ");
                   String sellSymbol = scanner.next();
                   System.out.println("Enter the number of shares to sell: ");
                   int sellShares = scanner.nextInt();
                   stockAccount.sell(sellShares, sellSymbol);
                   break;
               case 3:
                   stockAccount.printReport();
                   break;
               case 4:
                   System.out.println("Enter the fileName :  ");
                   String fileName = scanner.next();
                   stockAccount.save(fileName);
                   break;
               case 5:
                   System.out.println("Exiting...");
                   return;

               default:
                   System.out.println("Invalid choice");
           }
       }

    }
}
