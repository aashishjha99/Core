package lld.liskovprinciple;

import java.util.ArrayList;
import java.util.List;

public class Liskov {


    public static void main(String[] args) {


        List<Engine> listVehicle = new ArrayList<>();
        /*
            compile time error

            listVehicle.add(new Bicycle());

         */
                listVehicle.add(new Bike());

        /* run time error

            for(Vehicle v : listVehicle){
            System.out.println(v.hasEngine().toString());
           }


         */

        for (Vehicle v : listVehicle) {
            System.out.println(v.getVehicleWheels());
        }

    }
}
