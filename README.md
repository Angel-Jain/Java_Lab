[Program-1 WAP for calculator ](#Ass-1)

[Program-2 WAP demonstrating loops](#Ass-2) 

[Program-3 WAP to create Calculator using objects](#Ass-3)

[Program-4 Wap for the addition of two distances where each distaance is given in m,cm,and mm using object and classes](#Ass-4)

[Program-5 Wap for addition of two time where each time is given by hours and mins using object and classes](#Ass-5)

[Program-6 Wap using object and classes to do the reverse of 1d array](#Ass-6)

[Program-7 Wap of Factorial, Fibonacci, Armstrong,Palindrome and Pattern](#Ass-7)

[Program-8 Write a class that is having four methods for 1-D array(Input,Output-1, Output-2 and reverse)](#Ass-8)

[Program-9 Write a class with multiple methods to perform matrix operations(Transpose, Addition, sum of rows, sum of columns, sum of diagonals)](#Ass-9)

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

## Ass-3
```
class Calc
{
    int num1;
    int num2;
     public Calc(int a, int b)
     {
           num1 = a;
           num2 = b;
     }
     public int add()
     {
        return num1+num2;
     }
    
    public int subtract() 
     {
        return num1-num2;
     }
      
     public int multiply()
     {
        return num1*num2;
     }

     public int division()
     {
        return num1/num2;
     }
   }

public class Calculator1
{
   public static void main(String[] args)
   {
       Calc c = new Calc(10,20);
         System.out.println("Addition of two numbers : "+c.add());
         System.out.println("Addition of two numbers : "+c.subtract());
         System.out.println("Addition of two numbers : "+c.multiply());
         System.out.println("Addition of two numbers : "+c.division());  
      
   }
   
}

```
<img width="270" height="106" alt="image" src="https://github.com/user-attachments/assets/3ccb4aa6-371b-47cf-b861-8beba462958c" />

## Ass-4

```
class Distances
{
    int mm;
    int cm;
    int m;
    public Distances(int a,int b,int c)
    {
        mm = a;
        cm = b;
        m = c;
    }
    public void conversion()
    {
        while(mm>=10)
        {
            mm = mm-10;
            cm = cm+1;

        }
        while(cm>=100)
        {
            cm = cm-100;
            m = m+1;
        }

    }
    public void display()
    {
        System.out.println("m :"+m + "cm :"+cm + "mm: "+mm);
    }
}

public class Distance {
    public static void main(String zrgs[])
    {
       Distances D1 = new Distances(22,224,76);
       D1.conversion();
       D1.display();
    }
}

```
<img width="375" height="59" alt="image" src="https://github.com/user-attachments/assets/0c6969d5-d486-4800-a0f2-b291e5ffb3ab" />

## Ass-5

```
class Timee
{
    int hr;
    int min;
    int sec;
    public Timee(int a ,int b,int c)
    {
        hr = a;
        min = b;
        sec = c;
    }
    public void conversion()
    {
        while(sec>=60)
        {
            sec = sec-60;
            min = min+1;
        }
        while(min>=60)
        {
            min = min-60;
            hr = hr+1;
        }

    }
    public void display()
    {
        System.out.println("hr :"+hr  + "min :" + min + "sec :"  + sec);
    }
}

public class Time {
    public static void main(String args[])
    {
          Timee T = new Timee(12,70,80);
          T.conversion();
          T.display();
    }
}

```
<img width="340" height="59" alt="image" src="https://github.com/user-attachments/assets/5d09e3f2-b35f-4dca-a217-f137baf35b63" />

## Ass-6

```
class oneD_Array
{
   int [] array;
   oneD_Array(int [] arr)
   {
      array = arr;
   }
   public void reverse()
   {
      int low = 0;
      int high = array.length - 1;
      while(low<=high)
      {
        int temp = array[low];
        array[low]=array[high];
        array[high]=temp;
        low++;
        high--;
      }
   }
   public void display()
   {
     System.out.println("Reverse of the array is :- ");
     for(int i=0;i<array.length;i++)
     {
        System.out.print(array[i] + " ");
     }
   }

}

public class Reverse_1D 
{
    public static void main(String [] args)
    {
       oneD_Array A1 = new oneD_Array(new int[]{1,2,3,4,5,6});
       A1.reverse();
       A1.display();
    }
    
}

```
<img width="272" height="51" alt="Screenshot 2026-03-19 231125" src="https://github.com/user-attachments/assets/7c0c23f1-d8d4-4723-a50b-80f9b7f233ae" />

## Ass-7

```
import java.util.Scanner;

class AllPrograms {

    // Factorial
    void factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }

    // Armstrong
    void armstrong(int num) {
        int temp = num, sum = 0, r;
        while(temp != 0) {
            r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }

        if(sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    // Palindrome
    void palindrome(int num) {
        int temp = num, rev = 0, r;
        while(temp != 0) {
            r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }

        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // Fibonacci
    void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Pattern
    void pattern() {
        System.out.println("Pattern:");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllPrograms obj = new AllPrograms();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Factorial");
            System.out.println("2. Armstrong");
            System.out.println("3. Palindrome");
            System.out.println("4. Fibonacci");
            System.out.println("5. Pattern");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter number: ");
                    obj.factorial(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    obj.armstrong(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    obj.palindrome(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter terms: ");
                    obj.fibonacci(sc.nextInt());
                    break;

                case 5:
                    obj.pattern();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 6);
    }
}

```
<img width="877" height="1032" alt="image" src="https://github.com/user-attachments/assets/a81bc5a2-590e-459f-abd8-a42dce66777f" />

##Ass-8

```
import java.util.Scanner;

class Array1D {
    int arr[] = new int[100];
    int n;

    // Input
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Output 1
    void output1() {
        System.out.println("Array elements:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Output 2 (reverse display)
    void output2() {
        System.out.println("Reverse display:");
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Reverse (actual swap)
    void reverse() {
        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D();

        obj.input();
        obj.output1();

        obj.output2(); // sirf print reverse

        obj.reverse(); // actual reverse
        System.out.println("After reversing:");
        obj.output1();
    }
}

```
<img width="330" height="220" alt="image" src="https://github.com/user-attachments/assets/66e791a9-bc36-414e-a003-53b61a9ecf67" />

##Ass-9

```
import java.util.Scanner;

class MatrixOperations {
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int r, c;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Enter Matrix A:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addition() {
        System.out.println("Matrix Addition:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of Matrix A:");
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Sum of rows:");
        for(int i = 0; i < r; i++) {
            int sum = 0;
            for(int j = 0; j < c; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + i + " = " + sum);
        }
    }

    void sumColumns() {
        System.out.println("Sum of columns:");
        for(int i = 0; i < c; i++) {
            int sum = 0;
            for(int j = 0; j < r; j++) {
                sum += a[j][i];
            }
            System.out.println("Column " + i + " = " + sum);
        }
    }

    void sumDiagonal() {
        int sum = 0;
        for(int i = 0; i < r; i++) {
            sum += a[i][i];
        }
        System.out.println("Sum of diagonal = " + sum);
    }

    public static void main(String[] args) {
        MatrixOperations obj = new MatrixOperations();

        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.sumDiagonal();
    }
}

```
<img width="668" height="509" alt="image" src="https://github.com/user-attachments/assets/32326072-e491-48d6-8502-0a630ec6a3cd" />








