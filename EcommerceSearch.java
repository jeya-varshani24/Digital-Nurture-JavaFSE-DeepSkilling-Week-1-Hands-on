class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {
    public static Product linearSearch(Product[] products,int productId) {
        for(int i = 0;i < products.length;i++) {

            if(products[i].productId == productId) {
                return products[i];
            }
        }
    return null;
    }

    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while(left <= right) {
            int mid =
                (left + right) / 2;

            if(products[mid].productId == productId) {
                return products[mid];
            }

            else if(products[mid].productId < productId) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

            new Product(
                101,
                "Laptop",
                "Electronics"),

            new Product(
                102,
                "Phone",
                "Electronics"),

            new Product(
                103,
                "Shoes",
                "Fashion"),

            new Product(
                104,
                "Watch",
                "Accessories")
        };

        Product result = binarySearch(products, 103);
        if(result != null) {
            System.out.println("Product Found : " + result.productName);
        }

        else {
            System.out.println("Product Not Found");
        }
    }
}