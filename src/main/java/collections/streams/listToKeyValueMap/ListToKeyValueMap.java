package collections.streams.listToKeyValueMap;

import java.util.Map;
import java.util.stream.Collectors;

public class ListToKeyValueMap {
  private MockClient client = new MockClient();

  public Map<String, String> getKeyValueMapping() {
    Map<String, String> accountMap =
        client.getAccounts().stream()
            .collect(
                Collectors.toMap(
                    Account::getAccountId,
                    account -> {
                      return account.getName()
                          + " x"
                          + account
                              .getAccountNumber()
                              .substring(account.getAccountNumber().length() - 4);
                    }));
    return accountMap;
  }
}
