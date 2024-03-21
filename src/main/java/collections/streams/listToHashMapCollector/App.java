package collections.streams.listToHashMapCollector;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    HashMapCollector hashMapCollector = new HashMapCollector();
    log.info("accountNames: {}", hashMapCollector.getHashMap());
  }
}
