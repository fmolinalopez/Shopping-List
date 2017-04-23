package com.molina.model;

/**
 * Created by Fran on 20/04/2017.
 */
public class Product {

    //Atributos

    private String name;
    private double price;

    //Constructores

    public Product() {
    }

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    //Metodos

    @Override
    public String toString() {
        return name + "(" + price + "€)";
    }


    //Accesores

    public String getName() {
        return name;
    }

    /**
     * Setter del atributo name, comprueba que name no sea una cadena vacia.
     * @param name String Valor del atributo name.
     */
    public void setName(String name) {
        if ( name.equals("") ) {
            this.name = "No name";
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    /**
     * Setter del atributo price, comprueba que price no sea menor que 0.
     * @param price double Valor del atributo price.
     */
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}
