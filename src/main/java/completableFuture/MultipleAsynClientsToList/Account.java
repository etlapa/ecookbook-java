package completableFuture.MultipleAsynClientsToList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Account {
  private String accountId;
  private String name;
  private String accountNumber;
}
