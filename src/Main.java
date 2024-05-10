//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Noa  ");
        restaurant.setLocation("st.Zelena 34, city Lviv, Ukraine");
        restaurant.setRating(4  );

        Menu menu = new Menu();
        menu.setCuisine("Italian  ");
        menu.setNumberofmeals(20  );
        menu.setVegetarianOptions( true);

        Dish dish = new Dish();
        dish.setName("Spaghetti Carbonara");
        dish.setPrice(210.99);
        dish.setSpicy(false);

        Visitors visitor = new Visitors();
        visitor.setName("Olena");
        visitor.setAge(23);
        visitor.setRegularVisitor(true);

        System.out.println("Restaurant Name: " + restaurant.getName() + "Rating: " + restaurant.getRating() + "  Location: " + restaurant.getLocation());
        System.out.println("Menu Type: " + menu.getCuisine() + "Number of meals: " + menu.getNumberofmeals() + "  Vegetarian: " + menu.getVegetarianOptions());
        System.out.println("Dish Name: " + dish.getName() + "  Price: " + dish.getPrice() + "  Spisy?: " + dish.getIsSpicy());
        System.out.println("Visitor Name: " + visitor.getName() + "  Age: " + visitor.getAge() + "  Regular visitor: " + visitor.getRegularVisitorVisitor());
    }

}





