public class Main
{
    public static void main(String[] args)
    {
        printOdd(15);
        System.out.println("____________________");
        printOdd(14);
    }
    static int printOdd(int input)
    {
        if(input==1)
        {
            System.out.println(input);
            return 0;
        }
        if(input % 2 !=0)
        {
            System.out.println(input);
            printOdd(input -2);
        }
        if (input % 2==0)
        {
            printOdd(input -1);
        }
        return 1;
    }
}