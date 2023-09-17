package com.tpe.main;

import com.tpe.Utils.CartUtils;
import com.tpe.model.ItemType;
import com.tpe.model.Product;
import com.tpe.model.ShoppingCarts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ///take all date from user
        ShoppingCarts carts= new ShoppingCarts();
        Scanner input= new Scanner(System.in);
        int choice;
        do {

            System.out.println("Shopping Carts Menu: ");
            System.out.println("1. Add products");
            System.out.println("2. Display Carts");
            System.out.println("3. Calculate the Total price");
            System.out.println("4. exist");
            choice=input.nextInt();

            switch (choice){
                case 1:
                    //add products
                    System.out.print("Enter product Name :");// System.out.println("Enter product Name :");
                    input.nextLine();
                    String name= input.nextLine();
                    System.out.println("Enter the Product Price :");
                    double price = input.nextDouble();



                    System.out.println("Select The Category: ");
                    int i=1;
                    for (ItemType itemType:ItemType.values() ){
                        System.out.println(i + " ."+itemType);// 1. BOOK == 2.CLOTHING
                        i++;
                    }
                    System.out.println("Enter Category Choice : ");
                      int categoryChoice =   input.nextInt();
                      ItemType selectCategory = ItemType.values()[categoryChoice-1];//3-1 =2

                    Product<Double> product= new Product<>(name,price,selectCategory);
                    carts.addItem(product);
                    System.out.println("Product added to carts.");

                    break;
                case 2:
                    //Display Carts
                    CartUtils.printCartItems(carts);

                    break;
                case 3:
                    //Calculate the Total price
                    System.out.println("Total Price : "+ CartUtils.calculateTotalPrice(carts));
                    break;
                case 4:
                    //exist
                    break;
                default:
                    System.out.println("Invalid choice ... Please Select the a valid option");
                    break;
            }

        }while (choice!=4);

    }
}
