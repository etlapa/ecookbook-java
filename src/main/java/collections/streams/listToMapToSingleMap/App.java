package collections.streams.listToMapToSingleMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    Mapper mapper = new Mapper();
    log.info("Map from list: {}", mapper.getSingleMapping());
  }
}
