package Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stock Account Management Program ! \n");
        System.out.println("this is first a program");
        Scanner sc = new Scanner(System.in);
        StockInput stockInput = new StockInput();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Select the option from below : " + "\n1.Add Stock" + "\n2.print stock report" + "\n3.Exit program");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stockInput.addStock();
                    break;

                case 2:
                    stockInput.printStock();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Kindly Enter a valid option .....");
            }
            isExit = false;
        }
    }

}
