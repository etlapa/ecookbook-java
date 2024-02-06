package collections.streams.listToKeyObjectMap;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    ListToKeyObjectMap listToKeyObjectMap = new ListToKeyObjectMap();
    Map<String, Account> accountMap = listToKeyObjectMap.getAccountsWithKeys();
    log.info("Account id 3: {}", accountMap.get("3"));
    log.info("Account id 1: {}", accountMap.get("1"));
  }
}
