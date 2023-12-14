package Encapsulation;

public class Product {
    private int productId;
    private int productModel;
    private String productName;
    private String productDesc;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productModel=" + productModel +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
