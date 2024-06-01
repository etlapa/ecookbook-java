package collections.streams.optionalJsonAttributeToString;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
  private SellingInformation sellingInformation;
}
