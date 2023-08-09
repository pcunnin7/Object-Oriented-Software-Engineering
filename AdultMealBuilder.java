public class AdultMealBuilder implements Builder {
    private FastFoodOrder order;

   

    public void assignBurger() {
        order.burger = "Double Cheeseburger";

    }

    public void assignDrink() {
        order.drink = "Coke XLarge";

    }

    public void assignSide() {
        order.side = "Onion Rings";
    }

    public void assignToy() {
        order.toy = "No Toy";
    }

    public FastFoodOrder getMeal(){
        return order;
    }
}