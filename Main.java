package Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stock Account Management Program ! \n");
        System.out.println("this is first a program");

        StockInput stockInput = new StockInput();
        CheckAccount accountTest = new CheckAccount();

        boolean isExit = false;
        while (!isExit) {
            System.out.println("Select the option from below : " + "\n1.Add Stock" + "\t\t\t2.print stock report" + "\n3.Debit Money"+"\t\t4.Credit Money"+"\n5. Check Balance"+"\t6.Exit!");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stockInput.addStock();
                    break;

                case 2:
                    stockInput.printStock();
                    break;
                case 3:
                    accountTest.debit();
                    break;
                case 4:
                    accountTest.credit();
                    break;
                case 5:
                    accountTest.check_Balance();
                    break;
                case 6:
                    System.out.println("Exiting......");
                    isExit = true;
                    break;
                default:
                    System.out.println("Kindly Enter a valid option .....");
            }
            isExit = false;
        }
    }

}
