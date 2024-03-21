package completableFuture.MultipleAsynClientsToList;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    CompletableFutureList completableFutureList = new CompletableFutureList();
    List<TransactionDetails> transactionDetailsList = completableFutureList.getPartyTransactions();
    log.info("Transactions: {}", transactionDetailsList);
    log.info("Total transactions: {}", transactionDetailsList.size());
  }
}
