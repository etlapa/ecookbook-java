package collections.streams.listStringJoiner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    StringJoinerCollector stringJoinerCollector = new StringJoinerCollector();
    log.info("CollectorJoining: {}", stringJoinerCollector.getCollectorsJoiningString());
    log.info("StringJoiner: {}", stringJoinerCollector.getStringJoinerString());
  }
}
