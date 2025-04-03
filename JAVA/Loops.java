public class Loops {

    public static void main(String[] args) {
        //For
        for(int i = 2;i < 10;i += 2)
        System.out.println("For loop finished");

        //While
        int i = 2;
        while (i < 10) {
            System.out.println("while loop finished");
        }

        //Do-While
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        }while(j < 10);
        System.out.println("Do-While loop finished");
    }
}