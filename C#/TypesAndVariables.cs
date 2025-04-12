namespace TypesAndVariables
{
    class Program
    {
        static void Main(string[] args)
        {
            char character = 'A';
            bool condition = false;
            int number1 = 73628513;
            long number2 = 933897128162;
            short number3 = 325321;
            byte number4 = 255;
            double number5 = 10.4
            Console.WriteLine("Number1 is {0}", number1);
            Console.WriteLine("Number2 is {0}", number2);
            Console.WriteLine("Number3 is {0}", number3);
            Console.WriteLine("Number4 is {0}", number4);
            Console.WriteLine(Days.Friday);
            Console.ReadLine();
        }
    }

    enum Days
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }
}