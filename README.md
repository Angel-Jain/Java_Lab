[Program-1 WAP for calculator ]#Ass-1

[Program-2 WAP demonstrating loops]#Ass-2 



## Ass-1
```
public class Code {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        add(a,b);
        multiply(a,b);
        divide(a,b);
        subtract(a,b);
        modulus(a,b);
    }
    //Addition of numbers
    public static void add(int a,int b)
    {
        System.out.print("The addition of the numbers is:");
        System.out.println(a+b);
    }
    //Multiplication of numbers
    public static void multiply(int a,int b)
    {
        System.out.print("The multiplication of the numbers is:");
        System.out.println(a*b);
    }
    //Division of numbers
    public static void divide(int a,int b)
    {
        System.out.print("The division of the numbers is:");
        System.out.println(a/b);
    }
    //Subtraction of numbers
    public static void subtract(int a,int b)
    {
        System.out.print("The subtraction of the numbers is:");
        System.out.println(a-b);
    }
    //Modulus of numbers
    public static void modulus(int a,int b)
    {
        System.out.print("The modulus of the numbers is:");
        System.out.println(a%b);
    }
}
```
![WhatsApp Image 2026-02-20 at 12 26 51 PM](https://github.com/user-attachments/assets/10ec8473-9bec-4d30-9a0f-21301414c030)

## Ass-2
```
public class forloop {
    public static void main(String[] args)
    {
    int n = 5;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }
    
}
}
```

<img width="332" height="190" alt="image" src="https://github.com/user-attachments/assets/842c43de-185c-4bec-ba1f-5c1ea9da39dc" />


