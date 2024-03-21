package collections.streams.listToKeyObjectMap;

import java.util.ArrayList;
import java.util.List;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString(callSuper = true)
public class MockClient {
  public List<Account> getAccounts() {
    List<Account> accounts = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      accounts.add(new Account(Integer.toString(i), "Account " + i, Integer.toString(i * 100)));
    }
    return accounts;
  }
}
