package Day4;

import java.util.ArrayList;
import java.util.List;

public class StockList {
    private static List<StockDetails> stocks = new ArrayList<>();
    private static double total_value;


    public static List<StockDetails> getStocks() {
        return stocks;
    }
    public static void setStocks(List<StockDetails> stocks) {
        stocks = stocks;
    }


    public static double getTotal_value() {
        return total_value;
    }
    public static void setTotal_value(double total_value) {
        total_value = total_value;
    }
}
