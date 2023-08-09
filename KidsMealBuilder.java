public class KidsMealBuilder implements Builder {
    private FastFoodOrder order;

    

    public void assignBurger() {
        order.burger = "Chicken Burger";

    }

    public void assignDrink() {
        order.drink = "Apple Juice";

    }

    public void assignSide() {
        order.side = "Chicken Nuggets";
    }

    public void assignToy() {
        order.toy = "Toy Bundle 2";
    }

    public FastFoodOrder getMeal(){
        return order;
    }
}