package serialization.jackson.objectToJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {

    Account account =
        Account.builder()
            .accountId("12345")
            .accountNumber("1234567890")
            .name("Account test")
            .build();

    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    String json = ow.writeValueAsString(account);

    System.out.println("********** Json String **********");
    System.out.println(json);
    System.out.println("********** Object **********");
    System.out.println(account);
  }
}
