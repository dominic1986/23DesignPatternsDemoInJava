package structural.flyweight.advanced;

// Instances of CoffeeFlavour will be the Flyweights
public class CoffeeFlavour {
  private final String name;

  CoffeeFlavour(final String newFlavor) {
    this.name = newFlavor;
  }

  @Override
  public String toString() {
    return name;
  }
}