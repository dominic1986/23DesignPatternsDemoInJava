package structural.flyweight.advanced;
// Order is the context of the CoffeeFlavour flyweight.
public class Order {
  private final int tableNumber;
  private final CoffeeFlavour flavour;

  Order(final int tableNumber, final CoffeeFlavour flavor) {
    this.tableNumber = tableNumber;
    this.flavour = flavor;
  }

  void serve() {
    System.out.println("Serving " + flavour + " to table " + tableNumber);
  }
}