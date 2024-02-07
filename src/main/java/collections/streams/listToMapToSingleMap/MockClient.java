package collections.streams.listToMapToSingleMap;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MockClient {
  public List<Account> getAccounts() {
    List<Account> accounts = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      accounts.add(
          new Account(
              Integer.toString(i), "Account " + i, Integer.toString(i * 1000), (i % 2 == 0)));
    }
    return accounts;
  }
}
