[Program-1 WAP for calculator ](#Ass-1)

[Program-2 WAP demonstrating loops](#Ass-2) 

[Program-3 WAP to create Calculator using objects](#Ass-3)

[Program-4 Wap for the addition of two distances where each distaance is given in m,cm,and mm using object and classes](#Ass-4)

[Program-5 Wap for addition of two time where each time is given by hours and mins using object and classes](#Ass-5)

[Program-6 Wap using object and classes to do the reverse of 1d array](#Ass-6)

[Program-7 Wap of Factorial, Fibonacci, Armstrong,Palindrome and Pattern](#Ass-7)

[Program-8 Write a class that is having four methods for 1-D array(Input,Output-1, Output-2 and reverse)](#Ass-8)

[Program-9 Write a class with multiple methods to perform matrix operations(Transpose, Addition, sum of rows, sum of columns, sum of diagonals)](#Ass-9)

[Program -10 Wap to demonsrate all 3 types of inheritance with minimum code](#Assi-10)

[Program -11 WAP using three classes to print 1-100 with and without thread and analyse thread and analyse the output and repeat the same program using runnable interface](#Assi-11)

[Program -12 Using the concept of multithreading the output of all three threads must be synchronised (use join method)](#Assi-12)

[Program -13 Addition of 2 numbers using swing](#Assi-13)

[Program -14 Make a registration form with 10 elements and send the data into database (use jdbc connectivity)](#Assi-14)

[Program -15 Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.(Circle, oval rectangle, etc ....)](#Assi-15)

[Program-16 Just using mouse Event create a frame like paint brush with selection of colour and width](#Assi-16)

[Program-17 Create a package of any 5 classes of your choice and import it.](#Assi-17)

[Program-18 Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception .](#Assi-18)

[Program-19 Create one package and sub package  import and test it](#Assi-19)

[Program--20 To test the range of age of one student.write a program using user defined exception](#Assi-20)

[Program-21 Inheritance Programs, using interface and abstract classes](#Assi-21)

[Program-22  File Handling Programs (given in the PPT)](#Assi-22)

[Program-23  Make one calculator in swing](#Assi-23)





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


##Ass-10

```
// Parent class
class Vehicle {
    void showVehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Single inheritance (TwoWheeler inherits Vehicle)
class TwoWheeler extends Vehicle {
    void showTwoWheeler() {
        System.out.println("This is a Two Wheeler");
    }
}

// Multilevel inheritance (Scooty inherits TwoWheeler → Vehicle)
class Scooty extends TwoWheeler {
    void showScooty() {
        System.out.println("This is a Scooty");
    }
}

// Hierarchical inheritance (Car also inherits Vehicle)
class Car extends Vehicle {
    void showCar() {
        System.out.println("This is a Car");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {

        Scooty s = new Scooty();   // multilevel
        s.showVehicle();
        s.showTwoWheeler();
        s.showScooty();

        Car c = new Car();         // hierarchical
        c.showVehicle();
        c.showCar();
    }
}
```
<img width="286" height="94" alt="WhatsApp Image 2026-04-22 at 9 11 53 PM" src="https://github.com/user-attachments/assets/6a6f0f39-eb88-42c3-913e-ca8afcf4bdd6" />


##Ass-11

Without Thread
```
class A {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C {
    void print() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class WithoutThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.print();
        b.print();
        c.print();
    }
}
```
<img width="1042" height="616" alt="WhatsApp Image 2026-04-22 at 9 10 44 PM" src="https://github.com/user-attachments/assets/36c5da48-873c-4f30-a333-b3d6d8261f9a" />


With Thread

```
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class WithThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }
}
```

<img width="1055" height="551" alt="WhatsApp Image 2026-04-22 at 9 09 50 PM" src="https://github.com/user-attachments/assets/d6aed780-07af-4cad-bada-9acb24fa7a9f" />



Runnable Interface
```


class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());

        t1.start();
        t2.start();
        t3.start();
    }
}
```
<img width="1076" height="569" alt="WhatsApp Image 2026-04-22 at 9 08 49 PM" src="https://github.com/user-attachments/assets/fe3d49e8-67cd-494e-803e-c724a950c751" />



##Ass-12

```
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("B: " + i);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("C: " + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
```
join() method is used to achieve synchronization by making one thread wait for another thread to finish execution.
<img width="1006" height="709" alt="image" src="https://github.com/user-attachments/assets/87ec87c6-81c5-43a7-855e-6b84a5997565" />

<img width="1216" height="704" alt="image" src="https://github.com/user-attachments/assets/6d02757d-8f56-4cc9-be97-721f4b282e72" />

<img width="1279" height="708" alt="image" src="https://github.com/user-attachments/assets/2bcbc295-a477-42a0-ac9c-91bd25f4870f" />




##Ass-13

```

import javax.swing.*;
import java.awt.event.*;

public class AddSwing {
    public static void main(String[] args) {

        JFrame f = new JFrame("Addition");

        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(30, 30, 150, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 100, 30);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(30, 70, 150, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 70, 100, 30);

        JButton b = new JButton("Add");
        b.setBounds(100, 120, 80, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 170, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int sum = a + b;
                result.setText("Result: " + sum);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

```
<img width="341" height="292" alt="image" src="https://github.com/user-attachments/assets/1b8c7eff-412c-4ce9-b934-759aa7d94d8c" />


##Ass-14

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b;

    RegistrationForm() {
        setLayout(new GridLayout(11,2));

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        t9=new JTextField();
        t10=new JTextField();

        add(new JLabel("Name")); add(t1);
        add(new JLabel("Email")); add(t2);
        add(new JLabel("Phone")); add(t3);
        add(new JLabel("Address")); add(t4);
        add(new JLabel("City")); add(t5);
        add(new JLabel("State")); add(t6);
        add(new JLabel("Country")); add(t7);
        add(new JLabel("Username")); add(t8);
        add(new JLabel("Password")); add(t9);
        add(new JLabel("Age")); add(t10);

        b=new JButton("Register");
        add(b);

        b.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "swing", "swing123");

            PreparedStatement ps = con.prepareStatement(
                "insert into users values(?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, t1.getText());
            ps.setString(2, t2.getText());
            ps.setString(3, t3.getText());
            ps.setString(4, t4.getText());
            ps.setString(5, t5.getText());
            ps.setString(6, t6.getText());
            ps.setString(7, t7.getText());
            ps.setString(8, t8.getText());
            ps.setString(9, t9.getText());
            ps.setString(10, t10.getText());

            int x = ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Inserted: " + x);

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

```
<img width="1001" height="422" alt="image" src="https://github.com/user-attachments/assets/43eb457c-5903-41e8-9952-580823434a05" />

<img width="384" height="381" alt="image" src="https://github.com/user-attachments/assets/7b4db455-642d-43ac-9954-4414a29ddcfb" />

##Ass-15

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapesFrame extends JFrame implements ActionListener {
    String shape = "";

    public ShapesFrame() {
        setTitle("Shapes Frame");
        setSize(500, 500);
        setLayout(new FlowLayout());

        String[] btns = {"Circle", "Oval", "Rectangle", "Square", "Line",
                "Triangle", "Arc", "RoundRect", "3DRect", "Clear"};

        for (String b : btns) {
            JButton button = new JButton(b);
            button.addActionListener(this);
            add(button);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        switch (shape) {
            case "Circle": g.drawOval(200, 150, 100, 100); break;
            case "Oval": g.drawOval(200, 150, 150, 100); break;
            case "Rectangle": g.drawRect(200, 150, 150, 100); break;
            case "Square": g.drawRect(200, 150, 100, 100); break;
            case "Line": g.drawLine(200, 150, 350, 250); break;
            case "Triangle":
                int x[] = {200, 250, 300};
                int y[] = {250, 150, 250};
                g.drawPolygon(x, y, 3);
                break;
            case "Arc": g.drawArc(200, 150, 100, 100, 0, 180); break;
            case "RoundRect": g.drawRoundRect(200,150,150,100,30,30); break;
            case "3DRect": g.draw3DRect(200,150,150,100,true); break;
            case "Clear": repaint(); break;
        }
    }

    public static void main(String[] args) {
        new ShapesFrame();
    }
}
```
<img width="614" height="609" alt="Screenshot 2026-04-23 102600" src="https://github.com/user-attachments/assets/766acc68-c019-4cd7-a810-52f81f2ce353" />
<img width="604" height="620" alt="Screenshot 2026-04-23 102609" src="https://github.com/user-attachments/assets/c1431113-2cac-4c03-ac6e-560386927ff7" />

##Ass-16

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintApp extends JFrame {
    int x, y;
    Color color = Color.BLACK;
    int width = 5;

    public PaintApp() {
        setTitle("Paint App");
        setSize(600, 500);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(color);
                g.fillOval(e.getX(), e.getY(), width, width);
            }
        });

        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");

        red.addActionListener(e -> color = Color.RED);
        blue.addActionListener(e -> color = Color.BLUE);

        add(red, BorderLayout.NORTH);
        add(blue, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}

```
<img width="738" height="608" alt="image" src="https://github.com/user-attachments/assets/54e0cef8-38f8-47c4-9ac5-687cdd7f897d" />

##Ass-17

Package: mypack

class Addition
```
package mypack;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}
```
class B
```
package mypack;

public class Subtraction {
    public int subtract(int a, int b) {
        return a - b;
    }
}
```
class C
```
package mypack;

public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }
}
```
class D
```
package mypack;

public class Division {
    public int divide(int a, int b) {
        return a / b;
    }
}
```
Main class
```
import mypack.Addition;
import mypack.Subtraction;
import mypack.Multiplication;
import mypack.Division;
import mypack.Message;

public class TestPackage {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Message msg = new Message();

        System.out.println("Addition = " + a.add(20, 10));
        System.out.println("Subtraction = " + s.subtract(20, 10));
        System.out.println("Multiplication = " + m.multiply(20, 10));
        System.out.println("Division = " + d.divide(20, 10));
        msg.showMessage();
    }
}
```
<img width="1080" height="256" alt="image" src="https://github.com/user-attachments/assets/39cf581f-b697-475b-a0a0-301c5b38725c" />


##Ass-18

```
public class ExceptionDemo {
    public static void main(String[] args) {

        // Array Exception
        try {
            int arr[] = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds!");
        }

        // Arithmetic Exception
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
```
<img width="459" height="49" alt="image" src="https://github.com/user-attachments/assets/73794468-1b79-4ab8-bba4-6b081a35b726" />


##Ass-19

```
// in package folder
package college;

public class Student {
    public void showStudent() {
        System.out.println("This is Student class from main package.");
    }
}
//  in info folder
package college.info;

public class Address {
    public void showAddress() {
        System.out.println("This is Address class from sub-package.");
    }
}
// in java lab folder
import college.Student;
import college.info.Address;

public class TestSubPackage {
    public static void main(String[] args) {
        Student s = new Student();
        Address a = new Address();

        s.showStudent();
        a.showAddress();
    }
}

```
<img width="437" height="50" alt="image" src="https://github.com/user-attachments/assets/fe559290-7d6a-42e4-ac36-b0efdee42cfb" />

##Ass-20

```
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeCheck {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible!");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

```
<img width="593" height="73" alt="image" src="https://github.com/user-attachments/assets/23470d80-cd10-4768-8c10-7c1de6bd20a8" />

##Ass-21

```
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating...");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    void sound() {
        System.out.println("Barking...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        d.play();
    }
}

```
<img width="617" height="69" alt="image" src="https://github.com/user-attachments/assets/77ba4dd0-d732-4afb-aeb6-87877a1a4701" />

##Ass-22

Character By Character
```
import java.io.*;

public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using character stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="952" height="39" alt="image" src="https://github.com/user-attachments/assets/de038ad9-a5a4-4589-9f7e-1fbf9f00d53b" />


Byte By Byte

```
import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("Hello Byte File");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


```
<img width="555" height="52" alt="image" src="https://github.com/user-attachments/assets/8eab8960-13be-4434-8a87-027edc6ff547" />


##Ass-23

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    public Calculator() {
        setTitle("Swing Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            tf.setText(tf.getText() + input);
        } else if (input.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tf.getText());
            operator = input;
            tf.setText("");
        } else if (input.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            tf.setText("" + result);
        } else if (input.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

```
<img width="356" height="483" alt="Screenshot 2026-04-23 104848" src="https://github.com/user-attachments/assets/fba9f9b0-f695-424f-b003-99d2c408b08c" />
<img width="355" height="487" alt="Screenshot 2026-04-23 104907" src="https://github.com/user-attachments/assets/24d0ecfe-afe3-42f2-bf7e-53e60f43513a" />
<img width="359" height="490" alt="Screenshot 2026-04-23 104914" src="https://github.com/user-attachments/assets/7d84c9e0-d8f8-4d6a-9bcd-7c4d957e527f" />
<img width="355" height="487" alt="Screenshot 2026-04-23 104921" src="https://github.com/user-attachments/assets/f78bf439-3e44-45bb-b5b4-58523827ac22" />






















