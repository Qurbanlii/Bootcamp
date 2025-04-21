package methodOverloading;

public class main3 {
    
    public main3(String[] args) {
        fourOperation fourOperation = new fourOperation();
        System.out.println(fourOperation.addition(2, 3));
        fourOperation.addition2(2, 3, 5);
        System.out.println("");
    }

}
