package collections.streams.listStringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class StringJoinerCollector {
  public String getCollectorsJoiningString() {
    List<String> strings = new ArrayList<>();
    strings.add("one");
    strings.add(null);
    strings.add("two");
    strings.add("");
    strings.add("three");
    return strings.stream()
        .filter(s -> StringUtils.isNotBlank(s))
        .collect(Collectors.joining(", "));
  }

  public String getStringJoinerString() {
    StringJoiner sj = new StringJoiner(", ");

    sj.add("one");
    sj.add(null);
    sj.add("two");
    sj.add("");
    sj.add("three");

    return sj.toString();
  }
}
