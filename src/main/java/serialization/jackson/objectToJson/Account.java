package serialization.jackson.objectToJson;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Using ToString from Lombok
 */
@Getter
@Builder
@ToString
public class Account {
  private String accountId;
  private String name;
  private String accountNumber;
}
