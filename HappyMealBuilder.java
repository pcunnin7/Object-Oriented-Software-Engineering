public class HappyMealBuilder implements Builder {
    private FastFoodOrder order;

    

    public void assignBurger() {
        order.burger = "Hamburger";

    }

    public void assignDrink() {
        order.drink = "Coke Zero";

    }

    public void assignSide() {
        order.side = "French Fries";
    }

    public void assignToy() {
        order.toy = "Toy Bundle 1";
    }

    public FastFoodOrder getMeal(){
        return order;
    }
}