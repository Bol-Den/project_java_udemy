package java_basics.trades_and_transactions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class App {

    public static void main(String[] args) {

        List<Transaction> testData = TransactionTestData.getTransactions();

//        for (Transaction line : testData) {
//            System.out.println(line);
//        }

        System.out.println(findTransactionByYear(testData, 2012));

    }

    public static List<Transaction> findTransactionByYear(List<Transaction> transactions, int year) {
         return transactions.stream()
                 .filter(t -> t.getYear() == year)
                 .collect(Collectors.toList());
    }

    public static void constructTraderDictionary(List<Transaction> transactions) {
        Map<String, Integer> traderMap = new HashMap<String, Integer>();



    }

}
