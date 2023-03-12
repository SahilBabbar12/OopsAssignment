package com.knoldus.task5;
public class TotalSale {
    int month_sale;
    int quarter_sale;
    int year_sale;

    public TotalSale(int month_sale, int quarter_sale, int year_sale) {
        this.month_sale = month_sale;
        this.quarter_sale = quarter_sale;
        this.year_sale = year_sale;
    }
}
class SalesPerson{

    String name;
    int age;
    TotalSale sale;

    public SalesPerson(String name, int age, TotalSale sale) {
        this.name = name;
        this.age = age;
        this.sale = sale;
    }
    void printTotalSale(){
        System.out.println("sales month: "+sale.month_sale);
        System.out.println("sales quarter: "+sale.quarter_sale);
        System.out.println("sales year: "+sale.year_sale);
    }

    public static void main(String[] args) {
        TotalSale personone_sale=new TotalSale(10000,35000,120000);
        TotalSale persontwo_sale=new TotalSale(9000,32000,115000);
        SalesPerson personone =new SalesPerson("Sahil",22,personone_sale);
        SalesPerson persontwo =new SalesPerson("Riya",22,persontwo_sale);

        // Get TotalSale of each person
        System.out.println("PersonOne toalsale: ");
        personone.printTotalSale();
        System.out.println("Persontwo toalsale: ");
        persontwo.printTotalSale();


    }
}

