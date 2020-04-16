package tn.tuniprod.gestionmagasin;

import java.util.Date;
import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String marque;
    private double price;
    private Date expirationDate;

    public Product(){}
    public Product(int id, String name, String marque, double price, Date expirationDate){
        setId(id);
        setName(name);
        setMarque(marque);
        setPrice(price);
        setExpirationDate(expirationDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", marque = '" + marque + '\'' +
                ", price = " + price +
                ", expirationDate = " + expirationDate +
                '}';
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getMarque() {
        return marque;
    }

    private void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if(price > 0)
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
