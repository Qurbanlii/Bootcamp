namespace Loops
{
    
    class Program
    {

        static void Main(string[] args)
        {
            int number = 10;
            do
            {
                Console.WriteLine(number);  
                number--;
            } while (number>=11);
            Console.ReadLine();
        }
        private static void WhileLoop()
        {
            int number = 100;
            while (number>=0)
            {
                Console.WriteLine(number);
                number--;
            }
            Console.WriteLine("Now number is {0}", number);
            Console.ReadLine();
        }
        private static void Main(string[] args)
        {
            // (int i = 100; i >= 0; i=i-2)
            //{
                //Console.WriteLine(i);
           // }
           // Console.WriteLine("Finished!");

           // Console.ReadLine();
            
        }
    }
}