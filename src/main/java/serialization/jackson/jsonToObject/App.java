package serialization.jackson.jsonToObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {
    String json =
        "{\"accountId\":\"12345\",\"name\":\"Account test\",\"accountNumber\":\"1234567890\"}";

    ObjectMapper objectMapper = new ObjectMapper();
    Account account = objectMapper.readValue(json, Account.class);

    System.out.println("********** Json String **********");
    System.out.println(json);
    System.out.println("********** Object **********");
    System.out.println(account);
  }
}
