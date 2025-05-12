import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        this.stocks = new ArrayList<>();
    }
    public void addStock(Stock stock) {
        stocks.add(stock);
    }
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateValues();
        }
        return totalValue;
    }
    public void printStockReport() {
        System.out.println("Stock Report");
        System.out.println("-------------------------");
        for (Stock stock : stocks) {
            double stockValue = stock.calculateValues();
            System.out.println("Stock Name: " + stock.getName() + " Number of Shares: " + stock.getNumberOfShares() + " Share Price: " + stock.getSharePrice() + " Total Value: " + stockValue);
        }
        System.out.println("--------------------------");
        System.out.println("Total Portfolio Value: " + calculateTotalValue() );
    }
}
