public class Condition_Blocks {
    
    public static void main(String[] args) {
        int number = 20;
        if(number < 20) {
            System.out.println("Number is less than 20");
        }else if(number == 20){
            System.out.println("Number is 20");
        }
        else{
            System.out.println("Number is not less than 20");
        }
        if (number < 15) {
            System.out.println("Number is less than 15");
            //both blocks will work
        }
    }
}
