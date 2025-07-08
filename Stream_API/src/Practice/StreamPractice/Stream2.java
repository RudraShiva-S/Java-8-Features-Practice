package Practice.StreamPractice;

import Practice.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop",50000.00,"Electronics"),
                new Product("Mouse",700.50,"Electronics"),
                new Product("Shirt",1500.25,"Clothing"),
                new Product("Jeans",2000.00,"Clothing"),
                new Product("Book",500.50,"Stationery"),
                new Product("Pen",100.50,"Stationery"),
                new Product("Monitor",8000.00,"Electronics"),
                new Product("Shoes",2500.00,"Footwear")
        );

        //1.Filter all Electronics products
        List<Product> electronics = products.stream().filter(e -> e.getCategory()
                .equals("Electronics")).collect(Collectors.toList());
        System.out.println("Electronics Products:" );
        electronics.forEach(System.out::println);

        //filter all Stationery prducts
        List<Product> stationery = products.stream().filter(e -> e.getCategory()
                .equals("Stationery")).collect(Collectors.toList());
        System.out.println("\nStationery Products: ");
        stationery.forEach(System.out::println);

        //filter all Clothing products (.startsWith("C") works same as .equals
        List<Product> Clothing = products.stream().filter(e -> e.getCategory()
                .startsWith("C")).collect(Collectors.toList());
        System.out.println("\nClothing Products: ");
        Clothing.forEach(System.out::println);

        //filter all Footwear products
        List<Product> Footwear = products.stream()
                .filter(e -> e.getCategory()
                        .startsWith("F")).collect(Collectors.toList());
        System.out.println("\nFootwear");
        Footwear.forEach(System.out::println);

        //2.Get only products name
        List<String> ALLProducts = products.stream()
                .map(Product::getName).collect(Collectors.toList());

        System.out.println("\nAll Products Name: ");
        ALLProducts.forEach(System.out::println);

        //3.Get products priced above rs2000 and sort by price
        List<Product> ExpensiveProducts = products.stream()
                .filter(e ->e.getPrice() > 2000)
                .sorted(Comparator
                .comparingDouble(Product::getPrice)).collect(Collectors.toList());

        System.out.println("\nProducts priced above Rs.2000: ");
        ExpensiveProducts.forEach(System.out::println);

        //4.find the most expensive products
        Product MaxPrice = products.stream().max(Comparator.comparingDouble(Product::getPrice)).get();
        System.out.println("\nMost Expensive Product: " + MaxPrice);


        //5.find the cheapest products
        Product MinPrice = products.stream().min(Comparator.comparingDouble(Product::getPrice)).get();
        System.out.println("\nCheapest Products: " + MinPrice);


        //6. Print all product names using forEach
        System.out.println("\nPrint All  Product Names: ");
        products.stream().map(Product::getName).forEach(System.out::println);

        //7.Check if any product costs more than Rs40000
//        List<Product> AnyExpensive = products.stream().filter(e -> e.getPrice() > 40000)
//                .sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());  //prints the value
        boolean anyExpensive = products.stream().anyMatch(e -> e.getPrice() > 40000);      //prints in boolean true /false
        System.out.println("\nProduct costs more than Rs:40000  " + anyExpensive);

        //8.Checks if all products are under Rs 60000
        boolean Allunder60k = products.stream().allMatch(e -> e.getPrice() < 60000);
        System.out.println("\nAll Products Under 60k: " + Allunder60k);

        //9.Remove duplicate category names using distinct
        List<String> RemoveCategory = products.stream().map(Product::getCategory)
                .distinct().collect(Collectors.toList());           //removes diplicates in the list
        System.out.println("\nRemove Duplicate Categories: " + RemoveCategory);

        //10.Count how many Clothing products are there
        long Totalclothing = products.stream().filter(e -> e.getCategory().equals("Clothing")).count();
        System.out.println("\nNumbers of Clothing Products: " + Totalclothing);

        //11.Limit to top 3 cheapest products
        List<Product> Top3cheapest = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice)).limit(3).collect(Collectors.toList());   //get price from asecending order
        System.out.println("\nTop 3 cheapest products: " + Top3cheapest);

        //12.skip first 2 most expensive products and show next 3
        List<Product> TopExpensive3 = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .skip(2).limit(3).collect(Collectors.toList());       //reverse the sorted default ascending order to desecending .skip skips and .limit gets last values
        System.out.println("\nSkiped top 2 most expensive Products: " + TopExpensive3);

    }
}
