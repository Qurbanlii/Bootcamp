package Classes;

public class main1 {
    
    public main1(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id=1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        productManager productManager=new productManager();
        productManager.Add(product);
        
        System.out.println(product.name);
    }
}
