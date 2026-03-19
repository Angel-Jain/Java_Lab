[Program-1 WAP for calculator ](#Ass-1)

[Program-2 WAP demonstrating loops](#Ass-2) 

[Program-3 WAP to create Calculator using objects](#Ass-3)

[Program-4 Wap for the addition of two distances where each distaance is given in m,cm,and mm using object and classes](#Ass-4)

[Program-5 Wap for addition of two time where each time is given by hours and mins using object and classes](#Ass-5)

[Program-6 Wap using object and classes to do the reverse of 1d array](#Ass-6)

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


