package PizzaProcess;

import PizzaProcess.Topping;

public class various_pizza  extends Topping {

    int pissta_pizza = 5;
    int margarita_pizza = 6;

    int Veg_pizza = 7;
    int sum ;
    int amt_of_each_topping = 1;


    public  void pistapizza(){


        System.out.println("You chose the pista pizza ");
        topping_list();
        sum = pissta_pizza + (number_of_top * amt_of_each_topping);
        System.out.println("Amount for pistapizza is :" + sum);

    }

    public  void margaritapizza(){

        System.out.println("You chose the margaritapizza pizza ");
        topping_list();
        sum = margarita_pizza + (number_of_top * amt_of_each_topping);
        System.out.println("Amount for margaritapizza is :" + sum);

    }

    public  void Vegpizza(){

        System.out.println("You chose the Vegpizza pizza ");
        topping_list();
        sum = Veg_pizza + (number_of_top * amt_of_each_topping);
        System.out.println("Amount for Vegpizza is :" + sum);

    }

}
