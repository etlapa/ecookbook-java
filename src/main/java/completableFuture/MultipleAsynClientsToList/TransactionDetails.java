package completableFuture.MultipleAsynClientsToList;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@AllArgsConstructor
public class TransactionDetails {
  private String accountId;
  private String transactionId;
  private BigDecimal amount;
  private LocalDate date;
  private String description;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
