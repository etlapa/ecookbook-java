package collections.streams.optionalJsonAttributeToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class App {
  public static void main(String[] args) {
    nullApplicantCase();
    nullProductListCase();
    emptyProductListCase();
    nullSellingInformationCase();
    nullSellerNameCase();
    validSellerNameCase();
  }

  private static String getSellerName(Application case1) {
    return Optional.ofNullable(case1)
        .map(Application::getApplicant)
        .map(Applicant::getProductList)
        .map(
            values -> {
              if (!values.isEmpty()) {
                return values.get(0);
              }
              return null;
            })
        .map(Product::getSellingInformation)
        .map(SellingInformation::getSellerName)
        .orElse("(N/A) - hardcoded");
  }

  private static void validSellerNameCase() {
    var sellerName = getSellerName(createValidSellerNameCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createValidSellerNameCase() {
    return Application.builder()
        .applicant(
            Applicant.builder()
                .productList(
                    Arrays.asList(
                        Product.builder()
                            .sellingInformation(
                                SellingInformation.builder().sellerName("XYZ Co.").build())
                            .build()))
                .build())
        .build();
  }

  private static void nullSellerNameCase() {
    var sellerName = getSellerName(createNullSellerNameCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createNullSellerNameCase() {
    return Application.builder()
        .applicant(
            Applicant.builder()
                .productList(
                    Arrays.asList(
                        Product.builder()
                            .sellingInformation(SellingInformation.builder().build())
                            .build()))
                .build())
        .build();
  }

  private static void nullSellingInformationCase() {
    var sellerName = getSellerName(createNullSellingInformationCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createNullSellingInformationCase() {
    return Application.builder()
        .applicant(
            Applicant.builder().productList(Arrays.asList(Product.builder().build())).build())
        .build();
  }

  private static void nullProductListCase() {
    var sellerName = getSellerName(createNullProductListCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createNullProductListCase() {
    return Application.builder().applicant(Applicant.builder().build()).build();
  }

  private static void emptyProductListCase() {
    var sellerName = getSellerName(createEmptyProductListCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createEmptyProductListCase() {
    return Application.builder()
        .applicant(Applicant.builder().productList(new ArrayList<>()).build())
        .build();
  }

  private static void nullApplicantCase() {
    var sellerName = getSellerName(createNullApplicantCase());
    System.out.printf("Seller Name: [%s]\n", sellerName);
  }

  private static Application createNullApplicantCase() {
    return Application.builder().build();
  }
}
