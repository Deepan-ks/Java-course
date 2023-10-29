package com.exercise;


import java.util.Scanner;

public class SwitchEmployeeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select -> Fruits or Vegetables:");
        String itemType = input.nextLine().toLowerCase();
        switch (itemType){
            case "fruits":
                System.out.println("Enter a fruit name:");
                String items=input.nextLine().toLowerCase();
                switch (items){
                    case "apple", "grapes", "banana" -> System.out.println("price 150/KG");
                    case "mango", "watermelon", "ice apple" -> System.out.println("price 180/KG");
                    case "dragon fruit", "kiwi", "berries" -> System.out.println("price 220/KG");
                    default -> System.out.println("out of stock");
                }
                break;
            case "vegetables":
                System.out.println("Enter a vegetable name:");
                items=input.nextLine().toLowerCase();
                switch (items){
                    case "carrot", "potato", "beetroot" -> System.out.println("price 80/KG");
                    case "bean", "cabbage", "cauliflower" -> System.out.println("price 70/KG");
                    case "broccoli", "avocado", "capsicum" -> System.out.println("price 100/KG");
                    default -> System.out.println("out of stock");
                }
                break;
            default:
                System.out.println("Invalid option, try again!");
        }

    }
}
