import java.time.LocalDateTime;

public class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private double sharePrice;
    private LocalDateTime transactionDate;

    public CompanyShares(String stockSymbol, int numberOfShares, double sharePrice, LocalDateTime transactionDate) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.transactionDate = transactionDate;
    }
    public String getStockSymbol() {
        return stockSymbol;
    }
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
    public int getNumberOfShares() {
        return numberOfShares;
    }
    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }
    public double getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(double sharePrice){
        this.sharePrice = sharePrice;
    }
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
