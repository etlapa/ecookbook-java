package collections.streams.listToHashMapCollector;

import java.util.ArrayList;
import java.util.List;

public class MockClient {
  public List<Account> getList() {
    List<Account> accounts = new ArrayList<>();

    accounts.add(new Account("1", "Account one", "1234"));
    accounts.add(new Account("2", "Account two", "2345"));
    accounts.add(new Account("3", "Account three", "3456"));

    return accounts;
  }
}
