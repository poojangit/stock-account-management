import java.time.LocalDateTime;
import java.util.ArrayList;

public class StockAccount {
    private ArrayList<CompanyShares> companySharesList;

    public StockAccount() {
        this.companySharesList = new ArrayList<>();
    }
    // create a new Account from a file (placeholder for file handling)
    public StockAccount(String filename){
        this.companySharesList = new ArrayList<>();
        //Logic to read from the file and initialize companySharesList can be added here
    }
    // calculate the total value of the account dollars
    public double valueOf() {
        double totalValue = 0;
        for (CompanyShares shares: companySharesList) {
            totalValue += shares.getNumberOfShares() * shares.getSharePrice();
        }
        return totalValue;
    }
    //buy shares and add to the account
    public void buy(int amount ,String symbol, double sharePrice) {
        boolean found = false;
        for (CompanyShares shares : companySharesList) {
            if (shares.getStockSymbol().equals(symbol)) {
                shares.setNumberOfShares(shares.getNumberOfShares() + amount);
                shares.setTransactionDate(LocalDateTime.now());
                found = true;
                break;
            }
        }
        if (!found) {
            companySharesList.add(new CompanyShares(symbol, amount, sharePrice, LocalDateTime.now()));
        }
    }
    // sell shares and subtract from the account
    public void sell(int amount, String symbol){
    for(CompanyShares shares : companySharesList){
        if(shares.getStockSymbol().equals(symbol)){
            if (shares.getNumberOfShares() >= amount) {
                shares.setNumberOfShares(shares.getNumberOfShares() - amount);
                shares.setTransactionDate(LocalDateTime.now());
            } else {
                System.out.println("Not enough shares to sell");
            }
            return;
        }
    }
        System.out.println("Stock symbol not found");
    }
    //Save account to a file (placeholder for file handling)
    public void save(String filename){
        //logic to save companySharesList to a file can be added here
        System.out.println("Account saved to file: " + filename);
    }
    // print a detailed report of stocks and values
    public void printReport() {
        System.out.println("Stock Account Report: ");
        System.out.println("-------------------");
        for(CompanyShares shares : companySharesList) {
            System.out.println("Stock Symbol : " + shares.getStockSymbol() + ", Number of shares: " + shares.getNumberOfShares() + ", Share price : " + shares.getSharePrice() + ", total value : " + shares.getNumberOfShares()*shares.getSharePrice() + "" +
                    ", Last Transaction  date : " + shares.getTransactionDate());
        }
        System.out.println("---------------------------");
        System.out.println("Total Account value: " + valueOf());
    }
}
