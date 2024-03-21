package collections.streams.listToMapToSingleMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapper {
  private MockClient mockClient = new MockClient();

  public Map<String, Boolean> getSingleMapping() {
    return mockClient.getAccounts().stream()
        .map(
            account -> {
              Map<String, Boolean> hm = new HashMap<>();
              hm.put(account.getAccountId(), (Utils.getRandomNumber() % 2 == 0));
              return hm;
            })
        .flatMap(item -> item.entrySet().stream())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }

  /**
   * Taken from listToHashMapCollector. This approach is better
   *
   * @return
   */
  public Map<String, Boolean> getHashMapCollector() {
    Map<String, Boolean> accounts =
        mockClient.getAccounts().stream()
            .collect(Collectors.toMap(Account::getAccountId, Account::isLinked));
    return accounts;
  }
}
