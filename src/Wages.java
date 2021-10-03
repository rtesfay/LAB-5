import java.util.Scanner;

public class Wages {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the hours and overtime you have worked one by one");
    int hours, overTime;
    hours=keyboard.nextInt();
    overTime=keyboard.nextInt();
    System.out.println("Enter the quantity of sales you have made");
    int sales;
    sales=keyboard.nextInt();
    double commision;
    if(1<sales < 99.99)

    {
        commision = 5 %*sales;
        Wages = 7.25 * hours + 1.5 * overTime + commision;
        System.out.println("Wages " + Wages);
    }

    else if {
        if (100 < sales < 299.99) {
            commision = 10 %*sales;
            Wages = 7.25 * hours + 1.5 * overTime + commision;
            System.out.println("Wages " + Wages);
        }
        else if {
            if (sales >= 300) {
                commision = 15 %*sales;
                Wages = 7.25 * hours + 1.5 * overTime + commision;
                System.out.println("Wages " + Wages);
            } else {
                System.out.println("End of loop");
            }
        }
    }
}
