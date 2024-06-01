package collections.streams.optionalJsonAttributeToString;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Applicant {
  List<Product> productList;
}
