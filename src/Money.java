import java.util.Scanner;

public class Money {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter a power of n");
    int n;
    n=keyboard.nextInt();
    if (n=6){
        Math.pow(10, n)=Million;
        System.out.println("Its a Million");
    }
    else if (n=9)
    {
        Math.pow(10, n) = Billion;
        System.out.println("Its a Billion");
    }
    else if (n=12)
    {
        Math.pow(10, n) = Trillion;
        System.out.println("Its a Trillion");
    }
    else if (n=15)
    {
        Math.pow(10, n) = Quadrillion;
        System.out.println("Its a Quadrillin");
    }
    else if (n=18)
    {
        Math.pow(10, n) = Quintillion;
        System.out.println("Its a Quintillion");
    }
    else if (n=21)
    {
        Math.pow(10,n,) = Sextillion;
        System.out.println("Its a Sextillion");
    }
    else if (n=30)
    {
        Math.pow(10, n) = Nonillion;
        System.out.println("Its a Nonillion");
    }
    else if (n=100)
    {
        Math.pow(10, n) = Googol;
        System.out.println("Its a Googol");
    }
    else
    {
        System.out.println("End of loop");

    }
}
