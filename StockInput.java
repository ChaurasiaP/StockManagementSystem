package Day4;

import java.util.List;
import java.util.Scanner;

public class StockInput {
    public void addStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of stocks: ");
        int n = sc.nextInt();      //entering no of stocks to create
        double total_value = 0;
        double value = 0;

        List<StockDetails> temp = StockList.getStocks();
        for (int i = 0; i < n; i++) {
            StockDetails stock = new StockDetails();

            System.out.println("Enter the name of share: ");
            stock.setStockName(sc.next());
            System.out.println("Enter number of shares: ");
            stock.setNoOfShares(sc.nextInt());
            System.out.println("Enter price of share: ");
            stock.setSharePrice(sc.nextDouble());

            value = stock.getNoOfShares() * stock.getSharePrice();
            stock.setTotalShareVal(value);
            temp.add(stock);
            StockList.setStocks(temp);
            total_value += value;
        }
        StockList.setTotal_value(total_value);
    }

    public void printStock() {
        List<StockDetails> temp = StockList.getStocks();
        for (StockDetails stocks : temp) {
            System.out.println(stocks);
        }
        System.out.println("Total value of stock : " + StockList.getTotal_value());
    }
}
