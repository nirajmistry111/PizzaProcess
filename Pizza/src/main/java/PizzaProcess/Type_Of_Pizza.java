package PizzaProcess;

import java.util.*;

public  class Type_Of_Pizza {
    public int cp ;
    public void pizza_type(){
        various_pizza vp = new various_pizza();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag)
        {
            try
            {
                String [] name_of_pizza = {"1 : pistapizza", "2 : margaritapizza", "3 : Vegpizza" };
                for (String k: name_of_pizza) {
                    System.out.println(k);
                }

                System.out.println("Choose the type of pizza : ");
                cp = sc.nextInt();
                if (cp == 1 ){
                    vp.pistapizza();
                } else if (cp == 2) {
                    vp.margaritapizza();
                } else if (cp == 3) {
                    vp.Vegpizza();
                }else {
                    System.out.println("Wrong Input");
                }
            }catch (Exception e){
                System.out.println("Invalid inpuit " + e);
                flag = false;
            }
        }


    }
}

