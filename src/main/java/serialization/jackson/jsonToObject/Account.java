package serialization.jackson.jsonToObject;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Using ToStringBuilder from Apache
 */
@Data
public class Account {
  private String accountId;
  private String name;
  private String accountNumber;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}