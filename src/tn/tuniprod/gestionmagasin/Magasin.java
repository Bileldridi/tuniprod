package tn.tuniprod.gestionmagasin;

import java.util.Arrays;

public class Magasin {
    private int id;
    private String adresse;
    final int capacite = 50;
    private Product[] products;
    public int nbrProduct = 0;


    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.products = new Product[capacite];
    }

    public void add(Product product) {
        if(nbrProduct < capacite && !comparer1(product)) {
            products[nbrProduct] = product;
            nbrProduct ++;
        }
        else {
            System.out.println("Product Exists");
        }

    }

    public Magasin getMagasin(Magasin M1, Magasin M2) {
        if(M1.nbrProduct > M2.nbrProduct)
            {return  M1;}
        return M2;
    }

    
    public boolean comparer1(Product product) {
        for (int i = 0; i < nbrProduct; i++)
            if(products[i].getId() == product.getId() && products[i].getName() == product.getName() && products[i].getPrice() == product.getPrice()) {
                return  true;
            }
        return false;
    }

    public int search(Product product) {
        for (int i = 0; i < nbrProduct; i++)
            if(products[i].getId() == product.getId() && products[i].getName() == product.getName() && products[i].getPrice() == product.getPrice()) {
                return  i;
            }
        return -1;
    }


    public void delete(Product product) {
        int pos = search(product);
        if (pos != -1)
        for (int i = pos; i < nbrProduct ; i++) {

                products[i] = products[i + 1];
        }
        nbrProduct--;
    }



    @Override
    public String toString() {
        return "Magasin{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


}
