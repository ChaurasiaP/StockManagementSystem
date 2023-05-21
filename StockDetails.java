package Day4;

public class StockDetails {

    private String stockName;
    private int noOfShares;
    private double sharePrice;
    private double totalShareVal;


    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }


    public int getNoOfShares() {
        return noOfShares;
    }
    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }


    public double getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }


    public double getTotalShareVal() {
        return totalShareVal;
    }
    public void setTotalShareVal(double totalShareVal) {
        this.totalShareVal = totalShareVal;
    }

    @Override
    public String toString() {
        return "StockPortfolio \nstock_name = " + stockName + ", no_of_shares = " + noOfShares + ", share_price = "
                + sharePrice + ", total_val_shares = " + totalShareVal +"\n";
    }
}
