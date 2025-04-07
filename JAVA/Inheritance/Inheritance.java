package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
    CustomerManager CustomerManager = new CustomerManager();
    CustomerManager.customerDal = new OracleCustomerDal();
    CustomerManager.Add();        
    }
}
