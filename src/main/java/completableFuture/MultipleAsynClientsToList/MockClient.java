package completableFuture.MultipleAsynClientsToList;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString(callSuper = true)
public class MockClient {
  public List<Account> getAccounts() {
    List<Account> accounts = new ArrayList<>();
    int randomNum = Utils.getRandomNumber();
    for (int i = 0; i <= randomNum; i++) {
      accounts.add(
          new Account(
              Integer.toString(i),
              "Account " + i + " " + randomNum,
              Integer.toString(Utils.getRandomNumber() * 100)));
    }
    return accounts;
  }

  public List<TransactionDetails> getTransactionsAccount() {
    List<TransactionDetails> transactionDetails = new ArrayList<>();
    int randomNum = Utils.getRandomNumber();
    log.info("Starting for number: {}, {}", randomNum, System.currentTimeMillis());
    for (int i = 0; i <= randomNum; i++) {
      transactionDetails.add(
          new TransactionDetails(
              Integer.toString(i),
              Integer.toString(i),
              BigDecimal.TEN,
              LocalDate.now(),
              "Description " + i));
    }

    Utils.delayExec();

    log.info(
        "Completed with {} transactions for number: {}, {}",
        transactionDetails.size(),
        randomNum,
        System.currentTimeMillis());
    return transactionDetails;
  }
}
