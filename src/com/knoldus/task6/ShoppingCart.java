package com.knoldus.task6;

import java.util.Scanner;

class Item{
    int price;
    int quantity;

    public Item(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
}
public class ShoppingCart {
    Item item;
    int totalcost;

    public ShoppingCart(Item item) {
        this.item = item;
    }

    int calculateTotalCost(){
        totalcost= item.price *item.quantity;
        return totalcost;
    }

    public static void main(String[] args) {

        Item item=new Item(1000,3);
        ShoppingCart cart= new ShoppingCart(item);

        System.out.println("Total cost of item: "+cart.calculateTotalCost());

    }

}
