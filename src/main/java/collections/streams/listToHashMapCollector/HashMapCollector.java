package collections.streams.listToHashMapCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class HashMapCollector {
  public Map<String, String> getHashMap() {
    Map<String, String> accountNames =
        createList().stream()
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

  private List<Account> createList() {
    List<Account> accounts = new ArrayList<>();

    accounts.add(new Account("1", "Account one", "1234"));
    accounts.add(new Account("2", "Account two", "2345"));
    accounts.add(new Account("3", "Account three", "3456"));

    return accounts;
  }
}
