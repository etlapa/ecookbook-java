package collections.streams.listToHashMapCollector;

import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/** See also listToMapToSingleMap for a boolean example (getHashMapCollector) */
public class HashMapCollector {
  private MockClient mockClient;

  public Map<String, String> getHashMap() {
    Map<String, String> accountNames =
        mockClient.getList().stream()
            .collect(
                Collectors.toMap(
                    Account::getAccountId,
                    account -> {
                      StringJoiner sj = new StringJoiner(" ");

                      sj.add(account.getName());
                      sj.add(
                          "x"
                              + account
                                  .getAccountNumber()
                                  .substring(account.getAccountNumber().length() - 4));

                      return sj.toString();
                    }));
    return accountNames;
  }
}
