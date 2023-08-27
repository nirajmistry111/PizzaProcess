package PizzaProcess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Topping {
    Scanner sc = new Scanner(System.in);
    int number_of_top ;

    String [] tof;
    String selectTopping ;

    public void topping_list()
    {
        tof = new String [] {"Onion", "Tomato" , "BlackOlives", "Cheese"};
        for (String e: tof) {
            System.out.println(e);
        }


    try {
        System.out.println("Enter the Number of  topping : ");
        number_of_top = sc.nextInt();
    }catch (InputMismatchException e){
        System.out.println("Integer please ");
    }

        for (int i = 1; i <= number_of_top; i++) {
            System.out.println("Enter topping " + i + " from the above list: ");
            selectTopping = sc.next();
        }


        boolean isToppingAvailable = false;
        for (String topping : tof) {
            if (topping.equalsIgnoreCase(selectTopping)) {
                isToppingAvailable = true;
                break;
            }
        }

        if (isToppingAvailable) {
            System.out.println("Thank you for choosing " );
        } else {
            System.out.println("You entered a wrong topping");
        }
    }

}


