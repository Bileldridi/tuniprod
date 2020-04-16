package tn.tuniprod.gestionmagasin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        var product = new Product();
        int id = (int) (Math.random()*100000);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        var product1 = new Product((int) (Math.random()*100000),"Lait Delice","Delice",1.150, formatter.parse("04/29/2020"));
        var product2 = new Product((int) (Math.random()*100000),"Prince","Delice",1.450, formatter.parse("06/22/2020"));
        var product3 = new Product(id,"Riz","Basmati",4.500, formatter.parse("10/25/2021"));
        var product4 = new Product(id,"Riz","Basmati",4.500, formatter.parse("10/25/2021"));
        var product5 = new Product(id,"banana","fruit",3.500, formatter.parse("06/25/2020"));
        System.out.println(product1);
        var magasin1 = new Magasin((int) (Math.random()*100000),"Ariana");
        var magasin2 = new Magasin((int) (Math.random()*100000),"cité Nozha");
        magasin1.add(product1);
        magasin2.add(product1);
        magasin2.add(product2);
        magasin2.add(product3);
        magasin2.add(product4);
        System.out.println(magasin1);
        System.out.println(magasin2);
        System.out.println("Nber Total of Products = " + (magasin1.nbrProduct + magasin2.nbrProduct));
        magasin2.comparer1(product4 );
        System.out.println(product3.equals(product4));
        magasin2.delete(product1);
        System.out.println(magasin2);
        System.out.println(magasin1.getMagasin(magasin1,magasin2));
    }
}
