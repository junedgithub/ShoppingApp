package ShopApp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Shop {
    private int shopId;
    private String shopName;
    private String shopType;
    private Set<Product> productList = new LinkedHashSet<Product>();

    public Shop(int shopId, String shopName, String shopType) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopType = shopType;
    }

    public Shop()
    {

    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Set<Product> getProductList() {
        return productList;
    }


    @Override
    public String toString() {
        return "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopType='" + shopType + '\'' +
                ", productList=" + productList;
    }

    public Set<Product> addProduct(Product p) {
        productList.add(p);
        return productList;
    }
}
