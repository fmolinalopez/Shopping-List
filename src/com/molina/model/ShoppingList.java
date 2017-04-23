package com.molina.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Fran on 20/04/2017.
 */
public class ShoppingList {

    //Atributos

    static Scanner input = new Scanner(System.in);
    private ArrayList<Product> productsList;

    //Constructores

    public ShoppingList() {
        productsList = new ArrayList<>();
    }

    //Metodos

    public void addProduct(Product product) {
        if ( product != null ){
            productsList.add(product);
        }
    }

    public void removeProduct(int index) {
        productsList.remove(index);
    }

    public double totalAmount() {
        double totalAmount = 0;

        for (Product product: productsList){
            totalAmount += product.getPrice();
        }

        return totalAmount;
    }

    public void pay() {

    }

    //Accesores

    public ArrayList<Product> getProductsList() {
        return productsList;
    }
}
