package ShopApp;

import java.util.*;

public class BussinessLogicClass {

    Set<Product> products = new LinkedHashSet<>();

    List<Shop> shops = new ArrayList<>();
    public void addProduct(int productId, String productName, double productPrice) {
        Product p = new Product();
        p.setProductID(productId);
        p.setProductName(productName);
        p.setProductPrice(productPrice);
        products.add(p);


    }

    public void addShop(int shopId, String shopName, String shopType ) {
       Shop s = new Shop();
       s.setShopId(shopId);
       s.setShopType(shopType);
       s.setShopName(shopName);
       shops.add(s);
    }


    public void displayShop(int id, String name, String type) {
        for(int i=0;i<shops.size();i++)
        {
            if (id==shops.get(i).getShopId())
            {
                System.out.println("Shop Id: "+shops.get(i).getShopId());
                System.out.println("Shop Name: "+shops.get(i).getShopName());
                System.out.println("Shop Type: "+shops.get(i).getShopType());
            }
        }
    }



    public void displayProduct(int shopId) {
        for (int i=0;i<shops.size();i++) {
            if (shopId == shops.get(i).getShopId())
            {
                for (Product p: products)
                {
                    System.out.println("Product Id: "+p.getProductID());
                    System.out.println("Product Name: "+p.getProductName());
                    System.out.println("Product Price: "+p.getProductPrice());
                }
            }
        }
    }

    public void removeProduct(int shopId, int productId) {
        for (Shop s: shops)
        {
            if (shopId==s.getShopId())
            {
                for (Product p: products)
                {
                    if (productId==p.getProductID())
                    {
                        s.getProductList().remove(p);
                    }
                }
            }
        }
    }

    public void updateProduct(int shopId, int productId, double price) {
        for (Shop s : shops)
        {
            if (shopId==s.getShopId())
            {
                for (Product p: products)
                {
                    if (productId==p.getProductID())
                    {
                        p.setProductPrice(price);
                    }
                }
            }
        }
    }
}
