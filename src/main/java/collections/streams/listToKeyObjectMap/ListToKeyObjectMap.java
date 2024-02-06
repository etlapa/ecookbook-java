package collections.streams.listToKeyObjectMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToKeyObjectMap {
  private MockClient client = new MockClient();

  public Map<String, Account> getAccountsWithKeys() {
    Map<String, Account> accountMap =
        client.getAccounts().stream()
            .collect(Collectors.toMap(Account::getAccountId, Function.identity()));
    return accountMap;
  }
}
