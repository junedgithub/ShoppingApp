package ShopApp;

import StudentApp.BussinessLogic;

import java.util.*;

public class ShopManager {
    static Scanner sc = new Scanner(System.in);
    static BussinessLogicClass b = new BussinessLogicClass();
    static Set<Product> products = new LinkedHashSet<>();

    static List<Shop> shops = new ArrayList<>();
    static boolean status = true;
    public static void main(String[] args) {
        do {
            System.out.println("Select Mode Of Operation!!");
            System.out.println("1. Add Shop!!");
            System.out.println("2. Exit!!");
            int ch = sc.nextInt();
            switch (ch){
                case 1: addShop();
                break;
                case 2: status = false;
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }

        }while (status);

    }

    private static void addShop() {
        System.out.println("Enter Shop Id");
        int shopId = sc.nextInt();
        System.out.println("Enter Shop Name");
        String shopName = sc.next();
        System.out.println("Enter Shop type");
        String shopType = sc.next();
        b.addShop(shopId,shopName,shopType);
        System.out.println("Shop Added Successfully!!");
        do {
            System.out.println("1. Add Product!!");
            System.out.println("2. Display Shop!!");
            System.out.println("3. Display Product in Shop!!");
            System.out.println("4. Remove Product from Shop!!");
            System.out.println("5.Update Product from Shop!!");
            System.out.println("6. Exit!!");
            int ch1 = sc.nextInt();
            switch (ch1)
            {
                case 1: addProduct();
                break;
                case 2: displayShop();
                break;
                case 3: displayProductInShop();
                break;
                case 4: removeProductFromShop();
                break;
                case 5: updateProductFromShop();
                break;
                case 6: status = false;
                default:
                    System.out.println("Invalid Choice!!");
            }


        }while(status);
    }

    private static void addProduct() {
        int ch =0;
        do {
            System.out.println("1. Add Product!!");
            System.out.println("2. Save!!!");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Product Id");
                    int productId = sc.nextInt();
                    System.out.println("Enter Product name");
                    String productName = sc.next();
                    System.out.println("Enter Product Price");
                    double productPrice = sc.nextDouble();
                    b.addProduct(productId,productName,productPrice);
                    System.out.println("Product Added Successfully!!");
                    break;

                case 2:
                    System.out.println("Product Saved !!");
                    break;
                default:
                    System.out.println("Invalid Option!!");
            }
        }while (ch!=2);

    }

    private static void updateProductFromShop() {
        System.out.println("Enter Shop ID");
        int shopId = sc.nextInt();
        System.out.println("Enter Product ID");
        int productId = sc.nextInt();
        System.out.println("Enter New Price");
        double price = sc.nextDouble();
        b.updateProduct(shopId,productId,price);
        System.out.println("Product Updated Successfully!!");

    }

    private static void removeProductFromShop() {
        System.out.println("Enter Shop ID");
        int shopId = sc.nextInt();
        System.out.println("Enter Product ID");
        int productId = sc.nextInt();
        b.removeProduct(shopId,productId);
        System.out.println("Product Removed Successfully!!");
    }

    private static void displayProductInShop() {
        System.out.println("Enter Shop Id to be Displayed!!");
        int shopId = sc.nextInt();
        b.displayProduct(shopId);

    }

    private static void displayShop() {
        System.out.println("Enter Shop ID!!");
        int id = sc.nextInt();
        System.out.println("Enter Shop Name!!");
        String name = sc.next();
        System.out.println("Enter Shop Type!!");
        String type = sc.next();
        b.displayShop(id,name,type);


    }
}
