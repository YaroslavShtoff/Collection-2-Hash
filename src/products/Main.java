package products;

public class Main {
    public static void main(String[] args) {
        Product beet = new Product("Свекла", 67, 5);
        Product herring = new Product("Сельдь", 220, 3);
        Product potatoes = new Product("Картофель", 80, 4);
        Product onion = new Product("Лук", 52, 2);
        Product carrot = new Product("Морковь", 74, 2);
        Product egg = new Product("Яйцо", 120, 2);
        Product mayo = new Product("Майонез", 140, 1);


        ListProducts listProducts = new ListProducts();
        listProducts.add(beet);
        listProducts.add(herring);
        listProducts.add(beet);
        listProducts.remove(potatoes);
        System.out.println();


    }
}


