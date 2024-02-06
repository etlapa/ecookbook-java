package collections.streams.listToKeyValueMap;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    ListToKeyValueMap listToKeyValueMap = new ListToKeyValueMap();
    Map<String, String> accountMap = listToKeyValueMap.getKeyValueMapping();
    log.info("Account id 3 has the product name: {}", accountMap.get("3"));
    log.info("Account id 1 has the product name: {}", accountMap.get("1"));
  }
}
