public class Code
{
    public static void main(String[] args)
    {
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         add(a,b);
         multiply(a,b);
         divide(a,b);
         subtract(a,b);
         mod(a,b);
        
    }
    //Add two numbers
    public static void add(int a,int b)
    {
        System.out.print("Addition Of Two Numbers :- ");
        System.out.println(a+b);
    }
    //Multiply Two Numbers
    public static void multiply(int a,int b)
    {
        System.out.print("Multiplication Of Two Numbers :- ");
        System.out.println(a*b);
    }
    //Subtract Two Numbers
    public static void subtract(int a,int b)
    {
        System.out.print("Subtraction Of Two Numbers :- ");
        System.out.println(a-b);
    }
    //Subtract Two Numbers
    public static void divide(int a,int b)
    {
        System.out.print("Division Of Two Numbers :- ");
        System.out.println(a/b);
    }
    //Modulus Two Numbers
    public static void mod(int a,int b)
    {
        System.out.print("Mod Of Two Numbers :- ");
        System.out.println(a%b);
    }

}