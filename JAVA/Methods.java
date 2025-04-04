public class Methods {
    
    public static void main(String[] args) {
        numberSearching();
        numberSearching();
        numberSearching();
        numberSearching();
    }   

    public static void numberSearching() {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int searching = 6;
        boolean yes = false;    

        for (int number : numbers) {
            if(number==searching) {
                yes = true;
                break;
            }
        }

        String message=" ";
        if (yes) {
            message = "Number is available" + searching;
            sendMessage(message);
        }else{
            sendMessage("Number is not available:" + searching);
        }
    }

    public static void sendMessage(String message) {
        System.out.println("Number is available" + message);
    }

}
