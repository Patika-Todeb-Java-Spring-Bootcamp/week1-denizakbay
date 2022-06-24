import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Car car = new Car();
       car.setCikisYili(2017);
       car.setKacKisilik(5);
       car.setKilometre(500);
       car.setModels(Models.AUDI);
       car.setRenk(Color.BLACK);

        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, 11);
        c1.set(Calendar.DATE, 05);
        c1.set(Calendar.YEAR, 2012);
        Date dateOne = c1.getTime();
        car.setUretimTarihi(dateOne);

        System.out.println(car);



    }

}

