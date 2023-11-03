import java.util.*;
public class CodeingChallenge3{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Welcome to the Shipping Calculator!");
    System.out.print("How many packages are you shipping? ");
    int numberOfPackages = scanner.nextInt();
    double totalShippingCost = 0;

    for (int packageNumber = 1; packageNumber <= numberOfPackages; packageNumber++) {
      System.out.println("Package " + packageNumber + ":");
      System.out.print("Enter the weight of the package in kilograms:");
      double weight = scanner.nextDouble();

      System.out.println("Select the destination:");
      System.out.println("1. Domestic");
      System.out.println("2. International");
      System.out.print("Please enter your choice: ");
      int destinationChoice = scanner.nextInt();

      double shippingCost = calculateShippingCost(weight, destinationChoice);
      totalShippingCost += shippingCost;

      System.out.println("Shipping cost for Package " + packageNumber + ": $" + shippingCost);
  }

  System.out.println("Total Shipping Cost: $" + totalShippingCost);
}

public static double calculateShippingCost(double weight, int destinationChoice) {
  double costPerKg = 0;
  if (weight <= 1) {
      costPerKg = (destinationChoice == 1) ? 5 : 10;
  } else if (weight > 1 && weight <= 5) {
      costPerKg = (destinationChoice == 1) ? 10 : 20;
  } else {
      costPerKg = (destinationChoice == 1) ? 15 : 30;
  }

  double shippingCost = weight * costPerKg;

  if (weight > 10) {
      shippingCost *= 0.9;
  }

  return shippingCost;
}
}