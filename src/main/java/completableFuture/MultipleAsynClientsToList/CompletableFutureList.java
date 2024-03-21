package completableFuture.MultipleAsynClientsToList;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureList {
  private MockClient mockClient = new MockClient();

  public List<TransactionDetails> getPartyTransactions() {
    List<Account> accounts = mockClient.getAccounts();
    List<CompletableFuture<List<TransactionDetails>>> transactionsPerAccount =
        accounts.stream()
            .map(
                account ->
                    CompletableFuture.supplyAsync(
                        () -> {
                          return mockClient.getTransactionsAccount();
                        }))
            .collect(Collectors.toList());
    return transactionsPerAccount.stream()
        .map(CompletableFuture::join)
        .flatMap(List::stream)
        .collect(Collectors.toList());
  }
}
